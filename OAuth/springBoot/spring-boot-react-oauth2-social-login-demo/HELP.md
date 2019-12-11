# Spring Boot OAuth2 Social Login with Google, Facebook, and Github

## Setting up the Backend Server (spring-social)
* Create MySQL database

 ``` mysql> create database spring_social```

* Configure database username and password
```
 # spring-social/src/main/resources/application.yml
 spring:
     datasource:
         url: jdbc:mysql://localhost:3306/spring_social?useSSL=false
         username: <YOUR_DB_USERNAME>
         password: <YOUR_DB_PASSWORD>
```

* Run spring-social

``` mvn spring-boot:run ```

## Setting up the Frontend Server (react-social)
``` cd react-social ```
``` npm install && npm start ```
