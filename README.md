# MoviesLocator API

The MoviesLocator API fetches data from The Movie Database (TMDB) to get the 20 trending movies of the week. It stores this data in a MongoDB database and exposes endpoints for CRUD operations using Postman.

## API Key

To access TMDB, the API key used is `4b1ab7cd14b706467046eb45a1332ca1`.

## MongoDB Connection

The application connects to a local MongoDB database with the following configuration:

```properties
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=moviedb
spring.data.mongodb.auto-index-creation=true
```
##Dependencies
The project uses the following dependencies:

Spring Boot Web
Lombok
Spring Boot Starter Data MongoDB
``` 
**<dependencies>**
    **<dependency>**
        **<groupId>org.springframework.boot</groupId>**
        **<artifactId>spring-boot-starter-data-mongodb</artifactId>**
    **</dependency>**
    **<dependency>**
        **<groupId>org.springframework.boot</groupId>**
        **<artifactId>spring-boot-starter-web</artifactId>**
    **</dependency>**
    **<dependency>**
        **<groupId>org.projectlombok</groupId>**
        **<artifactId>lombok</artifactId>**
        **<optional>true</optional>**
    **</dependency>**
    <!-- Add other dependencies as needed -->
**</dependencies>** 
```
##Usage
Clone the repository.
Set up your MongoDB database and configure the connection in the application.properties file.
Build and run the application.
Use Postman or other tools to perform CRUD operations on the exposed endpoints.
```
# **Build** the project
**mvn clean install**

# **Run** the application
**mvn spring-boot:run**
```
##Endpoints
GET /movies: Retrieve all movies.
GET /movies/id/{ID}: Retrieve a movie by ID.
POST /movies: Create a new movie entry.
PUT /movies/id/{ID}: Update a movie's rating.
DELETE /movies/id/{ID}: Delete a movie by ID.
Feel free to explore and interact with the API!

