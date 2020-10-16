# Java Spring Boot - API

## circleci status:
[![leolplex](https://circleci.com/gh/leolplex/Panthera-Spring-API.svg?style=svg)](https://app.circleci.com/pipelines/github/leolplex)

## sonarcloud status:
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=leolplex_Panthera-Spring-API&metric=alert_status)](https://sonarcloud.io/dashboard?id=leolplex_Panthera-Spring-API)
[![SonarCloud Bugs](https://sonarcloud.io/api/project_badges/measure?project=leolplex_Panthera-Spring-API&metric=bugs)](https://sonarcloud.io/dashboard?id=leolplex_Panthera-Spring-API)
[![SonarCloud Code Smells](https://sonarcloud.io/api/project_badges/measure?project=leolplex_Panthera-Spring-API&metric=code_smells)](https://sonarcloud.io/dashboard?id=leolplex_Panthera-Spring-API)
[![SonarCloud Coverage](https://sonarcloud.io/api/project_badges/measure?project=leolplex_Panthera-Spring-API&metric=coverage)](https://sonarcloud.io/dashboard?id=leolplex_Panthera-Spring-API)
[![SonarCloud Duplicated Lines](https://sonarcloud.io/api/project_badges/measure?project=leolplex_Panthera-Spring-API&metric=duplicated_lines_density)](https://sonarcloud.io/dashboard?id=leolplex_Panthera-Spring-API)
[![SonarCloud Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=leolplex_Panthera-Spring-API&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=leolplex_Panthera-Spring-API)

## To the source code works you should:
 Create a file called **application.properties**  at path src/main/resources/application.properties  and define the next properties:
 
    spring.profiles.active=[dev or pdn]
    server.servlet.context-path=[define_api_path]
 
 Create a file called **application-dev.properties** at path src/main/resources/application-dev.properties  and define the next properties:
 
    server.port=[define_port_to_use]
    spring.datasource.url=[define_database_url]
    spring.datasource.username=[define_database_username]
    spring.datasource.password=[define_password_username]
 

 Create a file called **application-pdn.properties** at path src/main/resources/application-pdn.properties  and define the next properties:
 
    server.port=[define_port_to_use]
    spring.datasource.url=[define_database_url]
    spring.datasource.username=[define_database_username]
    spring.datasource.password=[define_password_username]
    
## Useful commands

    heroku login
    heroku create [app_name]
    heroku addons:create heroku-postgresql
    heroku config
    git push heroku master
    
 [Panthera API](https://pantheramarket.herokuapp.com/)
 
