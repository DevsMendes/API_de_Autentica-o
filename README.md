API de Autenticação JWT com Spring Boot
Esta é uma API completa construída com Spring Boot 3 para autenticação, geração e validação de tokens JWT. O projeto está conteinerizado com Docker e pronto para deploy.

🚀 Funcionalidades
Endpoint de Login: /auth/login para autenticar utilizadores e emitir tokens JWT.

Endpoint de Validação: /auth/validate para verificar a validade de um token.

Recursos Protegidos: Endpoints em /api/** que exigem um token JWT válido para acesso.

Controlo de Acesso por Perfil (Role): Endpoints específicos para utilizadores com perfil de ADMIN e USER.

Documentação Interativa: Interface Swagger UI para testar a API de forma visual.

Banco de Dados em Memória: H2 configurado para facilitar o desenvolvimento e os testes.

Conteinerização: Inclui um Dockerfile otimizado para criar uma imagem leve e portátil da aplicação.

🛠️ Como Executar o Projeto Localmente
Pré-requisitos
Java 17 ou superior

Maven 3.8 ou superior

Passos
Clone o repositório:

git clone https://github.com/seu-nome-de-utilizador/auth-server-spring-boot.git
cd auth-server-spring-boot

Compile e execute a aplicação com o Maven:

mvn spring-boot:run

A aplicação estará disponível em http://localhost:8080.

📖 Aceder aos Recursos
Documentação Swagger UI
Aceda a http://localhost:8080/swagger-ui.html para ver e interagir com todos os endpoints da API. Pode testar o login e usar o token JWT para aceder aos recursos protegidos diretamente na interface.

Consola do Banco de Dados H2
Aceda a http://localhost:8080/h2-console e use as seguintes credenciais para visualizar o banco de dados em memória:

JDBC URL: jdbc:h2:mem:testdb

User Name: sa

Password: (deixe em branco)

Utilizadores Padrão
Dois utilizadores são criados na inicialização para fins de teste:

Username: admin, Password: 123456, Perfil: ADMIN

Username: user, Password: password, Perfil: USER

✅ Executar os Testes
Para executar os testes de integração JUnit que validam o fluxo de autenticação e segurança:

mvn test

🚀 Deploy da Aplicação na Render
Para colocar esta API online, vamos utilizar a plataforma Render, que oferece um plano gratuito e integra-se perfeitamente com o GitHub para fazer o deploy de aplicações conteinerizadas.

Pré-requisitos para o Deploy
Uma conta no GitHub com este projeto enviado.

Uma conta gratuita na Render.

Passo a Passo para o Deploy
Aceda ao Dashboard da Render:

Inicie sessão na sua conta da Render.

No dashboard, clique em "New +" e selecione "Web Service".

Conecte o seu Repositório do GitHub:

Se for a sua primeira vez, terá de conectar a sua conta do GitHub à Render.

Escolha o repositório do seu projeto (auth-server-spring-boot) na lista.

Configure o Serviço Web:

Name: Dê um nome único para o seu serviço (ex: minha-api-auth). Este nome fará parte do URL público.

Region: Escolha a região mais próxima de si (ex: Frankfurt (EU Central)).

Branch: Verifique se o branch principal (main) está selecionado.

Runtime: Esta é a parte mais importante. Selecione Docker. A Render irá detetar automaticamente o seu Dockerfile na raiz do projeto.

Instance Type: O plano Free é suficiente para este projeto.

[Imagem da página de configuração de um novo serviço web na Render]

Adicione Variáveis de Ambiente (Opcional, mas boa prática):

O nosso application.yml tem o segredo JWT diretamente no código. Para um ambiente de produção, o ideal é externalizá-lo.

Pode clicar em "Advanced" e adicionar uma variável de ambiente:

Key: JWT_SECRET

Value: uma_chave_secreta_muito_mais_forte_e_aleatoria_aqui

Nota: Para que isto funcione, teria de alterar o application.yml para ler esta variável (secret: ${JWT_SECRET}), mas para este projeto, o método atual funciona.

Crie o Serviço:

Clique em "Create Web Service".

A Render irá começar o processo de build. Pode acompanhar o progresso nos logs. Primeiro, irá construir a imagem Docker a partir do seu Dockerfile e, em seguida, fará o deploy.

Este processo pode demorar alguns minutos na primeira vez.

Acesso à API:

Quando o deploy estiver concluído, verá o status "Live".

O URL da sua API estará no topo da página, algo como https://minha-api-auth.onrender.com.

Pode agora aceder à sua documentação Swagger em https://minha-api-auth.onrender.com/swagger-ui.html e interagir com a sua API online!

Qualquer git push futuro que fizer para o seu branch main no GitHub irá automaticamente acionar um novo deploy na Render, mantendo a sua aplicação sempre atualizada.
