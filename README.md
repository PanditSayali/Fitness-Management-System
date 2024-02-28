
# Fitness Management System
The Fitness Management System is a Java Spring Boot application designed to manage members and trainers of a gym. It provides functionalities for registration, login, updating member information, and administrative access.
## Overview
User Registration: Allows new members to sign up for gym membership.
User Login: Provides authentication for registered members to access their account.
Member Details Update: Enables members to update their personal information.
Admin Access: Allows administrators to manage member and trainer information.
### Technologies Used
      java
      Spring Boot
      Spring Data JPA
      MySQL
      Angular
### Set up MySQL database:
Create a MySQL database named fitness_management.
Update the database configuration in src/main/resources/application.properties with your MySQL username and password
### Access the application:
Open a web browser and navigate to http://localhost:8080 to access the application.
### Usage
-Visit /homePage to access the homepage.
-Navigate to /Loginpage for member login.
-Register new members by visiting /Registration.
-Update member details at /Update/{emailID} (API endpoint).
-Admin login is available at /admin.
-API documentation: API Documentation
