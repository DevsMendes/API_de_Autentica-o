# 🔐 API de Autenticação JWT com Spring Boot

Esta é uma API completa construída com Spring Boot 3 para autenticação, geração e validação de tokens JWT. O projeto está conteinerizado com Docker e pronto para deploy.

---

## 🚀 Funcionalidades

- **Endpoint de Login:** `/auth/login` para autenticar utilizadores e emitir tokens JWT.
- **Endpoint de Validação:** `/auth/validate` para verificar a validade de um token.
- **Recursos Protegidos:** Endpoints em `/api/**` que exigem um token JWT válido para acesso.
- **Controlo de Acesso por Perfil (Role):** Endpoints específicos para utilizadores com perfil de `ADMIN` e `USER`.
- **Documentação Interativa:** Interface Swagger UI para testar a API de forma visual.
- **Banco de Dados em Memória:** H2 configurado para facilitar o desenvolvimento e os testes.
- **Conteinerização:** Inclui um `Dockerfile` otimizado para criar uma imagem leve e portátil da aplicação.

---

## 🛠️ Como Executar o Projeto Localmente

### Pré-requisitos

- Java 17 ou superior  
- Maven 3.8 ou superior  

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-nome-de-utilizador/auth-server-spring-boot.git
   cd auth-server-spring-boot
Compile e execute a aplicação com o Maven:

bash
Copiar
Editar
mvn spring-boot:run
A aplicação estará disponível em:
http://localhost:8080

📖 Aceder aos Recursos
🔹 Documentação Swagger UI
Acesse:
http://localhost:8080/swagger-ui.html

🔹 Consola do Banco de Dados H2
Acesse:
http://localhost:8080/h2-console

Credenciais:

JDBC URL: jdbc:h2:mem:testdb

User Name: sa

Password: (deixe em branco)

👤 Utilizadores Padrão
Dois utilizadores são criados na inicialização para fins de teste:

Username: admin
Password: 123456
Perfil: ADMIN

Username: user
Password: password
Perfil: USER

✅ Executar os Testes
Execute os testes de integração JUnit:

bash
Copiar
Editar
mvn test
🌐 Deploy da Aplicação na Render
Vamos utilizar a plataforma Render, que oferece um plano gratuito e integração com GitHub para deploy de aplicações Docker.

Pré-requisitos
Conta no GitHub com este projeto enviado

Conta gratuita na Render

Passo a Passo
Acesse o Dashboard da Render:

Inicie sessão na sua conta da Render

Clique em "New +" → "Web Service"

Conecte o seu Repositório GitHub:

Conecte sua conta GitHub, se for a primeira vez

Escolha o repositório auth-server-spring-boot

Configure o Serviço Web:

Name: minha-api-auth (exemplo)

Region: Frankfurt (EU Central)

Branch: main

Runtime: Docker

Instance Type: Free

A Render detectará automaticamente o Dockerfile na raiz do projeto

Variáveis de Ambiente (opcional, mas recomendado):

Vá em "Advanced" e adicione:

Key: JWT_SECRET

Value: uma_chave_secreta_muito_mais_forte_e_aleatoria_aqui

Para isso funcionar, altere seu application.yml:

yaml
Copiar
Editar
secret: ${JWT_SECRET}
Crie o Serviço:

Clique em "Create Web Service"

Acompanhe o build nos logs (leva alguns minutos na primeira vez)

🌍 Acesso à API
URL da API:
Algo como: https://minha-api-auth.onrender.com

Swagger UI online:
https://minha-api-auth.onrender.com/swagger-ui.html

📦 Deploy Contínuo
Qualquer git push para o branch main no GitHub irá automaticamente acionar um novo deploy na Render, mantendo sua API sempre atualizada.

perl
Copiar
Editar

Se quiser, posso transformar isso em um arquivo `.md` pronto para usar no seu repositório. Deseja isso?







Você disse:
me de tudo em markdown


O ChatGPT disse:
Claro, aqui está todo o conteúdo formatado diretamente em Markdown, pronto para ser salvo como um arquivo README.md no seu projeto:

markdown
Copiar
Editar
# 🔐 API de Autenticação JWT com Spring Boot

Esta é uma API completa construída com Spring Boot 3 para autenticação, geração e validação de tokens JWT. O projeto está conteinerizado com Docker e pronto para deploy.

---

## 🚀 Funcionalidades

- **Endpoint de Login:** `/auth/login` para autenticar utilizadores e emitir tokens JWT.
- **Endpoint de Validação:** `/auth/validate` para verificar a validade de um token.
- **Recursos Protegidos:** Endpoints em `/api/**` que exigem um token JWT válido para acesso.
- **Controlo de Acesso por Perfil (Role):** Endpoints específicos para utilizadores com perfil de `ADMIN` e `USER`.
- **Documentação Interativa:** Interface Swagger UI para testar a API de forma visual.
- **Banco de Dados em Memória:** H2 configurado para facilitar o desenvolvimento e os testes.
- **Conteinerização:** Inclui um `Dockerfile` otimizado para criar uma imagem leve e portátil da aplicação.

---

## 🛠️ Como Executar o Projeto Localmente

### Pré-requisitos

- Java 17 ou superior  
- Maven 3.8 ou superior  

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-nome-de-utilizador/auth-server-spring-boot.git
   cd auth-server-spring-boot
Compile e execute a aplicação com o Maven:

bash
Copiar
Editar
mvn spring-boot:run
A aplicação estará disponível em:
http://localhost:8080

📖 Aceder aos Recursos
🔹 Documentação Swagger UI
Acesse:
http://localhost:8080/swagger-ui.html

🔹 Consola do Banco de Dados H2
Acesse:
http://localhost:8080/h2-console

Credenciais:

JDBC URL: jdbc:h2:mem:testdb

User Name: sa

Password: (deixe em branco)

👤 Utilizadores Padrão
Dois utilizadores são criados na inicialização para fins de teste:

Username: admin
Password: 123456
Perfil: ADMIN

Username: user
Password: password
Perfil: USER

✅ Executar os Testes
Execute os testes de integração JUnit:

bash
Copiar
Editar
mvn test
🌐 Deploy da Aplicação na Render
Vamos utilizar a plataforma Render, que oferece um plano gratuito e integração com GitHub para deploy de aplicações Docker.

Pré-requisitos
Conta no GitHub com este projeto enviado

Conta gratuita na Render

Passo a Passo
Acesse o Dashboard da Render:

Inicie sessão na sua conta da Render

Clique em "New +" → "Web Service"

Conecte o seu Repositório GitHub:

Conecte sua conta GitHub, se for a primeira vez

Escolha o repositório auth-server-spring-boot

Configure o Serviço Web:

Name: minha-api-auth (exemplo)

Region: Frankfurt (EU Central)

Branch: main

Runtime: Docker

Instance Type: Free

A Render detectará automaticamente o Dockerfile na raiz do projeto

Variáveis de Ambiente (opcional, mas recomendado):

Vá em "Advanced" e adicione:

Key: JWT_SECRET

Value: uma_chave_secreta_muito_mais_forte_e_aleatoria_aqui

Para isso funcionar, altere seu application.yml:

yaml
Copiar
Editar
secret: ${JWT_SECRET}
Crie o Serviço:

Clique em "Create Web Service"

Acompanhe o build nos logs (leva alguns minutos na primeira vez)

🌍 Acesso à API
URL da API:
Algo como: https://minha-api-auth.onrender.com

Swagger UI online:
https://minha-api-auth.onrender.com/swagger-ui.html

📦 Deploy Contínuo
Qualquer git push para o branch main no GitHub irá automaticamente acionar um novo deploy na Render, mantendo sua API sempre atualizada.

go
Copiar
Editar

Se quiser, posso gerar o arquivo `README.md` automaticamente para você baixar. Deseja isso?
