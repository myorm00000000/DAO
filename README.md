DAO
===

1. Preparing database - Queries to be executed as 'root'(MySQL Server: 5.5.27):
-------------------------------------------------------------------------------
CREATE DATABASE javabase DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;

CREATE TABLE javabase.User (
    id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    email VARCHAR(60) NOT NULL,
    password VARCHAR(32) NOT NULL,
    firstname VARCHAR(40) NULL,
    lastname VARCHAR(40) NULL,
    birthdate DATE NULL,

    PRIMARY KEY (id),
    UNIQUE (email)
);

CREATE USER 'java'@'localhost' IDENTIFIED BY 'd$7hF_r!9Y';
GRANT ALL ON javabase.* TO 'java'@'localhost' IDENTIFIED BY 'd$7hF_r!9Y';



2. Create a model class "User" which represents a single row of the User table of the 'javabase' database.

3. Handling DAO exceptions - Create 2 classes 

  a. DAOException: 
	
		It should wrap any exception of the underlying code, such as SQLExceptions.
	
	b. DAOConfigurationException: 
	
		This class represents an exception in the DAO configuration which cannot be resolved at runtime, 
		such as a missing resource in the classpath, a missing property in the properties file etc.
		

4. Write the Properties file named "dao.properties"

	In case of a webapplication you may consider to place it outside the WAR (the webapp project) so that you can edit it without 
	the need to redeploy (only an appserver/webapp restart is enough).
	
	
	In this example,"dao.properties" is stored at project root folder
	
5. Write a DAOProperties class which loads the DAO properties file 'dao.properties' once in memory.

6. Write an abstract DAO factory class and DAOFactory implementations.

7. Write User DAO interface.

8. Write the concrete JDBC implementation of the User DAO interface in UserDAOJDBC class.

9. Write DAO utility class(Repeated and/or standardized code is best to be refactored into an utility class)

10. Write DAOTest class containing a method which will test all this.


P.S: High respects to BalusC.
Preparing the database by executing the queries(See 1.),clone this repository and get started. :)

For any queries/feedbacks/suggestions,drop a mail to sndpchatterjee07@gmail.com.

