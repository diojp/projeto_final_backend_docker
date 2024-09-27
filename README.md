
# Projeto final da PÓS-GRADUAÇÃO EM DESENVOLVIMENTO WEB FULL STACK - Versão em Docker
# * Backend

O Projeto consiste na criação de um sistema web voltado o cálculo automático de Dimensionamento e Balanço Hídrico de Açudes.

## 📁 Acesso ao projeto

**Efetue o download do projeto:**
- [Backend](https://github.com/robsonvieirajr/Projeto-Final-Backend)
- [Backend em Docker](https://github.com/diojp/projeto_final_backend_docker)
- [Frontend](https://github.com/robsonvieirajr/Projeto-Final-Frontend)


- Necessário ter o docker-compose instalado


## 🛠️ Abrir e rodar o projeto
Execute o comando:

```bash
    docker-compose up -d
```


## Instalação
Após executar o comando vai subir o banco de dados Postgres junto com a aplicação String.

### Dados da aplicação
POSTGRES_DB: recursos_hidricos  
POSTGRES_USER: postgres
POSTGRES_PASSWORD: postgres

Para evitar conflitos de portas o Postgres foi mapeado para a porta: 5440:5432

Ao executar pela primeira vez o conteiner do Banco de Dados irá executar um script inicial para criar automaticamente todas as tabelas do sistema incluindo um usuário padrão

### Dados do usuário padrão
login: 85050355001 (cpf gerado automaticamente)
senha: 123
    
## Documentação da API

#### Ao Executar o projeto localmente você pode acessar o swagger através do endereço:

```http
 - Swagger: http://localhost:8080/swagger-ui/index.html/

```




## Autores

- [Robson Vieira Cavalcanti Júnior](https://www.github.com/robsonvieirajr)
- [Diego Magno Tavares da Silva](https://github.com/diojp)

