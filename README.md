Anotações:

Spring Initializer (Cria projetos com as dependências prontas) (Add Spring Web nas dependências)
Por padrão, o spring irá hospedar o serviço na porta 8080

Annotations do JPA (mapeamento entidade relacional):
@Entity define uma entidade
@Table(name = "tb_user") define um nome da tabela que corresponde a entidade (o parâmetro serve para trocar o nome caso necessário)
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@OneToOne, @OneToMany, @ManyToOne e @ManyToMany serve para definir a relação entre 2 entidades
no user: (mappedBy = "client") para nomear qual é a propriedade responsável por mapear a relação do outro lado

@JoinColumn(name = "client_id") para definir o nome da coluna da chave estrangeira

Annotations do Spring:
@RestController define o recurso (resource) como sendo um componente do Spring
@RequestMapping(value = "/users") para definir a raiz do endpoint do recurso

Os objetos a serem retornados pela API são da classe ResponseEntity<entity>
ResponseEntity.ok().body(entity)

@GetMapping vincula o método ao endpoint
@GetMapping(value = "/{id}") vincula o método ao endpoint com um parâmetro
(@PathVariable Long id) passa o valor do parâmetro passado na url

O repository é declarado como interface, e não como classe (extends JPARepository)

@Configuration define uma classe de configuração inicial que será executada pelo spring
@Profile("test") o nome do profile deve ser o mesmo definido no application-test.properties

@Autowired realiza a injeção de dependências automática do Spring, através de instâncias de componentes já registrados

@Repository serve para definir o repositório como sendo um componente do Spring
@Service serve para definir o serviço como sendo um componente do Spring

H2 database
endpoint H2-console acessa a UI do H2

Dependencies do Maven (pom.xml):
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
<groupId>com.h2database</groupId>
<artifactId>h2</artifactId>
<scope>runtime</scope>
</dependency>

src/main/resources/

(Já existente) application.properties:
spring.profiles.active=test
spring.jpa.open-in-view=true

(Criar arquivo)application-test.properties:
# DATASOURCE
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
# H2 CLIENT
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
# JPA, SQL
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
