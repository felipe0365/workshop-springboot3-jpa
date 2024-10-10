# Curso Java COMPLETO 🌟


Bem-vindo ao projeto de web services com Spring Boot e JPA/Hibernate desenvolvido durante o curso do Dr. Nelio Alves em [devsuperior.com.br](https://devsuperior.com.br) 🎓.

## Objetivos do Projeto 🎯

- 🛠️ Criar projeto Spring Boot Java
- 💾 Implementar modelo de domínio
- 🏗️ Estruturar camadas lógicas: resource, service, repository
- 🧪 Configurar banco de dados de teste (H2)
- 🌱 Povoar o banco de dados
- 🔄 Realizar operações CRUD - Create, Retrieve, Update, Delete
- 🚫 Tratamento de exceções

## Estrutura do Projeto 🗂️

### Modelos de Domínio 🏷️

- **User**, **Order**, **Category**, **Product**: Definição das entidades e suas associações.

### Camadas Lógicas 📚

- **Resource**: Controladores REST.
- **Service**: Camada de serviços com lógica de negócios.
- **Repository**: Acesso ao banco de dados.

## Configurações do Projeto ⚙️

### Inicialização do Projeto 🚀

- **Ferramenta**: Spring Initializr
    - 🧩 Dependências: Spring Web, JPA, H2

### Banco de Dados de Teste 🧪

- **Banco Atual**: H2
- Configurações de ambiente para desenvolvimento e testes.

### Dependências Importantes 📦

- Spring Boot Starter Data JPA
- Banco de dados H2 para ambiente de teste

## Funcionalidades Implementadas ✅

- **CRUD Completo**: Usuários, Pedidos, Produtos e Categorias.
- **Associações Complexas**: Many-to-many utilizando JoinTable.
- **Tratamento de Exceções**: Padrão para retornos de erros.
- **Deploy em Produção**: Simplificado com Heroku e PostgreSQL.

