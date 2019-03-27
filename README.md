# gaix
Project blog for girls, use Java servlet, JPA and JSP. Do you want to see girls? This repo for you!

## Prerequisites

- Eclipse
- Tomcat server
- MySQL
- Brain (must)

## Install

Step by Step:

- Open project Maven with Eclipse.
- Download Tomcat server https://tomcat.apache.org/download-90.cgi
- Add Tomcat server to Eclipse.
- Create new database with name *gaixdb* (or it's up to you).
- Go to `/gaix/persistence/META-INF/persistence.xml` change suitable config database:

    ```xml
    <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/gaixdb" />
    <property name="javax.persistence.jdbc.user" value="root" />
    <property name="javax.persistence.jdbc.password" value="123456" />
    ```
- Run project in Tomcat server.
- Enjoy.

## Features

- Register
- Login/ logout
- Add/ delete images
- Show list images
- *updating...*

## Description

- Backend community with frontend via API and deserialize JSON
- Used JWT to authenticate for API
- Built project base on Maven
- MySQL for database (upgrade to redis later)
- Deploying with Docker (maybe)

## Techniques used

- [Tomcat Server](https://spring.io/):  is an open-source Java Servlet Container, it implementation of the Java Servlet, JavaServer Pages, Java Expression Language and Java WebSocket.
- [JPA](https://en.wikipedia.org/wiki/Java_Persistence_API): the Java Persistence API (JPA) is the Java standard for mapping Java objects to a relational database.
- [MySQL](https://www.mysql.com/): is an open source relational database management system (RDBMS).
- [Apache Maven](https://maven.apache.org/): is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.