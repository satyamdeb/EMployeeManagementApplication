# Employee Management Application

This is a simple Employee Management Application (Full Stack) where you can do CRUD operations on employees.

## Technologies Used - 
Spring Boot (Backend), Angular (Frontend) & MySQL (Database)

### Spring Boot Dependencies Used
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
	<scope>runtime</scope>
</dependency>
<dependency>
	<groupId>org.projectlombok</groupId>
	<artifactId>lombok</artifactId>
	<optional>true</optional>
</dependency>
```

### CSS libraries used along with Angular -

```css
@import "https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css";
@import "https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css";
```

## Starting the Application
##### 1. Install required dependencies 
Java 1.8 or above, Angular 12.2.0 or above, MySQL Server 8.0

The spring boot project uses java 1.8. If you have a different version of java, just update your java version in pom.xml and do a maven update.
```xml
<java.version>{YOUR_JAVA_VERSION}</java.version>
```
##### 2. Create employee Database
Open your MySQL Command Line Client and create the database.
```sql
CREATE DATABASE employee
```
##### 3. Update database username and password
Open the Backend directory in IntelliJ (or any other IDE of your choice) and Update your database username and password in Application.properties
```properties
spring.datasource.username ={YOUR_DB_USERNAME}
spring.datasource.password ={YOUR_DB_PASSWORD}
```
##### 4. Start the Spring Boot application by running EmployeeManagementApplication.java

##### 5. Install npm dependencies
Open the Frontend directory in VS Code (or any other IDE of your choice). Open the terminal using CTRL + ` and install all the npm depenencies using the following command
```bash
npm install
```
##### 6. Start the Angular application using the following command
```ng
ng serve
```
## Test
Visit [http://localhost:4200/](http://localhost:4200/) and try to perform CRUD operations from the UI. One thing to note is that the profile picture input is of type string, you can provide the link of any image in this section for e.g., [this](https://static.wixstatic.com/media/31a53a_82bf85818af44d5db5b4504197194476~mv2.jpg/v1/crop/x_1907,y_642,w_3129,h_3129/fill/w_308,h_308,al_c,q_80,usm_0.66_1.00_0.01,enc_auto/IMG_2028_JPG.jpg).
