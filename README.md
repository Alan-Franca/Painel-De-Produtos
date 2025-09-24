# Painel de Gerenciamento de Produtos

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Maven](https://img.shields.io/badge/Maven-4.0.0-red)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)

## 📝 Descrição

Este projeto é uma aplicação web desenvolvida como um painel administrativo para gerenciamento de produtos em um inventário de loja. O objetivo principal foi aplicar e demonstrar conhecimentos práticos no ecossistema Spring, construindo uma aplicação funcional, segura e com uma interface amigável.

Um usuário administrador pode se autenticar para acessar um painel onde é possível realizar operações de CRUD (Criar, Ler, Atualizar e Excluir) para os produtos da loja.

## ✨ Funcionalidades

* **Autenticação e Autorização:** Acesso ao painel protegido por login e senha utilizando Spring Security.
* **Gerenciamento de Produtos (CRUD):**
    * Cadastro de novos produtos com nome, marca, preço base e categoria.
    * Listagem completa de todos os produtos em uma tabela responsiva.
    * Edição das informações de produtos existentes.
    * Exclusão de produtos.
* **Categorização:** Cada produto pertence a uma categoria pré-definida (ex: Eletrônicos, Hardware, etc.).
* **Lógica de Negócio:** Cálculo automático do preço de venda com base no preço base e em uma taxa de imposto padrão.
* **Interface Responsiva:** O layout se adapta a diferentes tamanhos de tela, de desktops a dispositivos móveis.

## 🛠️ Tecnologias Utilizadas

* **Backend:**
    * [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
    * [Spring Boot](https://spring.io/projects/spring-boot)
    * [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
    * [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
    * [Spring Security](https://spring.io/projects/spring-security)
* **Frontend:**
    * [Thymeleaf](https://www.thymeleaf.org/) (Template Engine)
    * HTML5 / CSS3
    * [Bootstrap 5](https://getbootstrap.com/) (para agilizar a estilização e responsividade)
* **Banco de Dados:**
    * [H2 Database](https://www.h2database.com/html/main.html) (em memória, para fins de desenvolvimento)
* **Build e Dependências:**
    * [Apache Maven](https://maven.apache.org/)

## 🚀 Como Executar o Projeto

Siga os passos abaixo para executar o projeto em sua máquina local.

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina:
* [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) ou superior
* [Apache Maven](https://maven.apache.org/download.cgi)
* [Git](https://git-scm.com/downloads)

### Passos para Execução

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/Alan-Franca/Painel-De-Produtos.git](https://github.com/Alan-Franca/Painel-De-Produtos.git)
    ```

2.  **Navegue até a pasta do projeto:**
    ```bash
    cd seu-repositorio
    ```

3.  **Compile e instale as dependências com o Maven:**
    *Este comando irá baixar todas as bibliotecas necessárias e compilar o código.*
    ```bash
    mvn clean install
    ```

4.  **Execute a aplicação:**
    ```bash
    mvn spring-boot:run
    ```

5.  **Alternativamente**, você pode importar o projeto em sua IDE preferida (como IntelliJ IDEA ou Eclipse) e executar a classe principal `PainelProdutosApplication.java`.

## 🔑 Acesso e Credenciais

* **Acesso à Aplicação:**
    Após iniciar, a aplicação estará disponível em: `http://localhost:8081`

* **Credenciais de Administrador:**
    * **Usuário:** `admin`
    * **Senha:** `admin123`

* **Acesso ao Banco de Dados H2:**
    *Para visualizar o banco de dados em memória durante a execução.*
    * **URL:** `http://localhost:8081/h2-console`
    * **JDBC URL:** `jdbc:h2:mem:produtodb`
    * **User Name:** `sa`
    * **Password:** (deixe em branco)

## 💻 Como Usar a Aplicação

1.  Após executar o projeto, acesse `http://localhost:8081` ou 8080, caso a porta esteja ocupada, é necessário alterar para uma vazia no arquivo applications.properties no seu navegador.
2.  Você será redirecionado para a tela de login. Utilize as credenciais de administrador fornecidas acima.
3.  Ao logar, você será direcionado ao painel de gerenciamento de produtos.
4.  No painel, você pode:
    * Clicar em **"Cadastrar Novo Produto"** para abrir o formulário de criação.
    * Clicar em **"Editar"** em um produto existente para modificar suas informações.
    * Clicar em **"Excluir"** para remover um produto do inventário.

## 🔮 Próximos Passos (Melhorias Futuras)

* [ ] Migrar do banco de dados H2 para um banco persistente (PostgreSQL ou MySQL).
* [ ] Implementar uma camada de testes (unitários e de integração).
* [ ] Adicionar validações mais robustas nos campos do formulário (Bean Validation).
* [ ] Criar uma API RESTful para o backend e desacoplar o frontend.
* [ ] Containerizar a aplicação com Docker.
* [ ] Implementar um sistema de gerenciamento de usuários com diferentes papéis (roles).

---
Feito com ❤️ por [Alan França](https://github.com/Alan-Franca)
