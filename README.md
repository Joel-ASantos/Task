# Task

##  Sobre o Projeto

O **Task** é um projeto pessoal desenvolvido com o objetivo de **estudar
o funcionamento de aplicações backend utilizando Java com Spring Boot**,
tendo como foco principal a implementação de um **CRUD (Create, Read,
Update e Delete)** integrado a um banco de dados.

A aplicação simula o gerenciamento de tarefas, permitindo a criação,
consulta, atualização e remoção de registros, servindo como base prática
para compreender o fluxo completo de uma aplicação backend moderna,
desde a camada de controle até a persistência dos dados.

------------------------------------------------------------------------

## Objetivos do Projeto

-   Aplicar conceitos fundamentais do backend com **Java e Spring Boot**
-   Implementar operações CRUD utilizando **Spring Data JPA**
-   Compreender a integração entre a aplicação e o **banco de dados**
-   Utilizar arquitetura em camadas para melhor organização do código
-   Consolidar boas práticas de desenvolvimento backend
-   Desenvolver um projeto base para evolução futura

------------------------------------------------------------------------

## Funcionalidades

-    Criar uma nova tarefa\
-    Listar todas as tarefas\
-    Buscar tarefa por ID\
-    Atualizar dados de uma tarefa\
-    Remover uma tarefa

------------------------------------------------------------------------

##  Conceitos e Tecnologias Trabalhadas

-   Java 21+
-   Spring Boot
-   Spring Web (REST API)
-   Spring Data JPA
-   Docker
-   Hibernate
-   PostgreSQL Driver
-   Mapeamento de entidades
-   Métodos HTTP (`GET`, `POST`, `PUT`, `DELETE`)
-   Tratamento de exceções
-   Versionamento com Git

------------------------------------------------------------------------

##  Tecnologias Utilizadas

-   **Linguagem:** Java\
-   **Framework:** Spring Boot\
-   **Docker**\
-   **ORM:** JPA / Hibernate\
-   **Gerenciador de Dependências:** Maven\
-   **Ferramentas:** Docker, Postman, Git & GitHub

------------------------------------------------------------------------

##  Banco de Dados

Configuração exemplo no `application.properties`:

    spring.application.name=SimpleTask
    spring.config.import=optional:file:.env[.properties]
------------------------------------------------------------------------

##  Como Executar o Projeto

### Pré-requisitos

-   Java 21+
-   Docker
-   Maven

### Passos

1.  Clone o repositório\
2.  Crie um DockerFile e um `compose.yml`\
3.  Configure o `application.properties`\
4.  Execute:

```{=html}
<!-- -->
```
    ./mvnw spring-boot:run

A aplicação estará disponível em `http://localhost:8080`.

------------------------------------------------------------------------

##  Endpoints (Exemplo)

  Método   Endpoint      Descrição
  -------- ------------- ------------------
  POST     /tasks        Criar uma tarefa
  GET      /tasks        Listar tarefas
  GET      /tasks/{id}   Buscar por ID
  PUT      /tasks/{id}   Atualizar tarefa
  DELETE   /tasks/{id}   Remover tarefa

------------------------------------------------------------------------

##  Próximas Evoluções

-   Autenticação e autorização com Spring Security
-   DTOs para desacoplamento
-   Paginação e ordenação
-   Documentação com Swagger
-   Testes unitários e de integração

------------------------------------------------------------------------

##  Autor

**Joel Alves**\
Projeto desenvolvido para fins de estudo e portfólio.
