# EmployeeManagementSystem
Employeement Management System
Setup:-
add external ojdbc8 file into the configuration
add these properties into application.properties
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.Dialect=org.hibernate.dialect.Oracle10gDialect
---------
Features:-
Add Employee
Delete Employee
Update Employee
View Employee based on salary (drop down menu)
-------
Tech Stacks:-
JavaScript
HTML
CSS
Java 8
Thymeleaf
Spring boot framework
Bootstrap
