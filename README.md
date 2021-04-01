Sistema com dois endpoints simples, para cadastro e consulta de informação referente e autorização de procedimentos médicos.

# Tecnologias:
- Spring Boot
- Java 11
- JPA/Hibernate
- Maven
- QueryDSL
- Liquibase
- H2 Database (para os testes unitários)
- MySQL
- JUnit
- Docker

------

# Para rodar o projeto pela IDE

- Instalar MySQL 8
- Baixar e importar o projeto maven na IDE.
- Verificar o arquivo application.properties e alterar as informações de banco caso for preciso.
- Rodar a aplicação (MedApplication.java)

# Para rodar o projeto com Docker

- Ter o Docker instalado
- Baixar o projeto.
- Descomentar o código do arquivo application.properties (tem um comentário indicando qual comentar/descomentar)
- Executar o comando para subir a aplicação Spring + MySQL: docker-compose up --build --force-recreate

Obs: Antes de executar o comando, encerre o serviço do MySQL caso esteja em execução, para evitar conflito de porta.

------

# Demo
![Alt text](https://github.com/brunoFreiberger/med-backend/blob/master/gifs/main-working.gif)

------

# Demo com Docker
![Alt text](https://github.com/brunoFreiberger/med-backend/blob/master/gifs/docker-working.gif)
