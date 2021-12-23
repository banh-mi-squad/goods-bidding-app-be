# Goods Bidding App

## Technologies
- [Spring Boot](https://spring.io/)
- [Spring Data JPA](https://spring.io/guides/gs/accessing-data-jpa/)
- [Spring Validation](https://spring.io/guides/gs/validating-form-input/)
- [Spring Security + JWT Token](https://spring.io/guides/gs/securing-web/)
- [PostgreSQL](https://www.postgresqltutorial.com/postgresql-cheat-sheet/)
- [Mapstruct](https://www.baeldung.com/mapstruct)
- [Lombok](https://projectlombok.org/)
- [Swagger](https://springdoc.org/)

### Database Settings

Before launching the application. You'll need to set up Postgres in your local machine, and then create a new database named `goodsbidding`. 
Default username and password for this database can be found in `src/main/resources/application.properties`.

## Run the Application

You can quickly run the application by using this command:

```./gradlew bootRun```

Alternatively, you can build the JAR file by using:

``` ./gradlew clean build```

then run the JAR file, as follows:

``` java -jar build/libs/goods-bidding-app-be-1.0.0.jar ```


## Database migration
To migrate this application data to your local database. Please clone this repo:

```https://github.com/banh-mi-squad/goods-bidding-app-db```

And run this command to trigger migration

```./flyway migrate```

Additional details can be found at [https://flywaydb.org](https://flywaydb.org)