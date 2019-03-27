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

[updating...]