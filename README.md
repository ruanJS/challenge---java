# 1. Documentação do Projeto - Sistema de Recomendação Personalizado

## Nome da Aplicação
Sistema de Recomendação Personalizado para Cursos Profissionalizantes

## 2. Integrantes do Grupo
- **Ruan Guedes**: Responsável pela integração do front-end com o back-end, Responsável pelo desenvolvimento do front-end utilizando React Native.
- **Ana Beatriz**: Responsável pelo desenvolvimento do back-end e configuração do banco de dados, Responsável pelos testes e validação da aplicação.


## Descrição do Projeto
O projeto consiste em um sistema de recomendação personalizado para cursos profissionalizantes. Utiliza Spring Boot para o back-end, React Native para o front-end e Oracle para o banco de dados. A aplicação tem como objetivo fornecer recomendações de cursos com base nos interesses e perfis dos usuários, contribuindo para seu desenvolvimento profissional.

## 3. Código-Fonte
Estrutura do Projeto:

![1](https://github.com/ruanJS/challenge---java/assets/125290791/eee0645b-031e-4183-bbed-209eb966d85b)


## 4. Instrução de como rodar a aplicação

### Backend (Spring Boot)

1. Clone o repositório:
   ```bash
   git clone <https://github.com/ruanJS/challenge---java>
   cd <challenge - java>


spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.jpa.hibernate.ddl-auto=update

./mvnw spring-boot:run

Frontend (React Native)
Navegue até o diretório do front-end:

bash
Copiar código
cd <front-end_directory>
Instale as dependências:

bash
Copiar código
npm install
Rode a aplicação:

bash
Copiar código
npx react-native run-android
# ou
npx react-native run-ios

4. Imagem dos Diagramas
Diagrama de Classes:
![diagrama de classe](https://github.com/ruanJS/challenge---java/assets/125290791/9fba5d99-0506-45be-b14d-0414f9292cef)

Diagrama de Sequência
![diagrama de sequencia](https://github.com/ruanJS/challenge---java/assets/125290791/76410e75-39e9-4f8f-9297-2835e60688a9)

6. Documentação da API
Endpoints
Curso
GET /api/courses: Retorna todos os cursos cadastrados.
GET /api/courses/{id}: Retorna um curso específico pelo ID.
POST /api/courses: Cria um novo curso.
PUT /api/courses/{id}: Atualiza um curso existente pelo ID.
DELETE /api/courses/{id}: Exclui um curso existente pelo ID.

Interesse
GET /api/interests: Retorna todos os interesses cadastrados.
GET /api/interests/{id}: Retorna um interesse específico pelo ID.
POST /api/interests: Cria um novo interesse.
PUT /api/interests/{id}: Atualiza um interesse existente pelo ID.
DELETE /api/interests/{id}: Exclui um interesse existente pelo ID.

Usuário
GET /api/users: Retorna todos os usuários cadastrados.
GET /api/users/{id}: Retorna um usuário específico pelo ID.
POST /api/users: Cria um novo usuário.
PUT /api/users/{id}: Atualiza um usuário existente pelo ID.
DELETE /api/users/{id}: Exclui um usuário existente pelo ID.
