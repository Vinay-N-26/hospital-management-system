# Hospital Management System

A backend-based Hospital Management System developed using **Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL**.

The application provides REST APIs for managing hospital-related information such as hospitals, branches, branch heads, owners, doctors, employees, patients, ambulances, payments, and prescriptions.

---

## Project Overview

The Hospital Management System is a Java backend application designed to manage hospital-related data through RESTful APIs.

The project uses:

- **Spring Boot** for backend application development
- **Spring Data JPA** for database operations
- **Hibernate** as the ORM framework
- **MySQL** as the database
- **Maven** for dependency and build management
- **Postman** for API testing

The application follows a layered architecture to separate API handling, business logic, database operations, data models, exception handling, and utility components.

---

## Features

- Hospital management
- Branch management
- Branch Head management
- Owner management
- Doctor information management
- Employee information management
- Patient information management
- Ambulance information management
- Payment information management
- Prescription information management
- RESTful API development
- MySQL database integration
- Spring Data JPA integration
- Hibernate ORM
- Entity relationships using JPA
- Custom exception handling
- Global exception handling
- Standardized API response structure
- Maven-based project management

---

## Technologies Used

### Backend

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- REST API

### Database

- MySQL

### Build Tool

- Maven

### Development & Testing Tools

- Eclipse / Spring Tool Suite
- Visual Studio Code
- Postman
- Git
- GitHub

---

## Application Architecture

The project follows a layered backend architecture:

```text
Client
  |
  v
Controller Layer
  |
  v
Service Layer
  |
  v
Repository Layer
  |
  v
MySQL Database
```

### Controller Layer

The Controller layer handles HTTP requests and exposes REST APIs.

Controllers included:

- `BranchController`
- `BranchHeadController`
- `HospitalController`
- `OwnerController`

### Service Layer

The Service layer contains the application's business logic.

Services included:

- `BranchService`
- `BranchHeadService`
- `HospitalService`
- `OwnerService`

### Repository Layer

The Repository layer communicates with the database using Spring Data JPA.

Repositories included:

- `BranchRepo`
- `BranchHeadRepo`
- `HospitalRepo`
- `OwnerRepo`

### DTO Layer

The DTO package contains the application's data models.

DTOs included:

- `Ambulance`
- `Branch`
- `BranchHead`
- `Doctors`
- `Employee`
- `Hospital`
- `Owner`
- `Patients`
- `Payment`
- `Prescription`

### DAO Layer

The project also contains DAO classes for data-access-related operations.

DAOs included:

- `BranchDao`
- `BranchHeadDao`
- `HospitalDao`
- `OwnerDao`

### Exception Layer

The application includes custom and global exception handling.

Classes included:

- `DoesNotExistException`
- `GlobalExceptionHandler`

### Utility Layer

Utility classes are used for application configuration and standardized response handling.

Classes included:

- `ApplicationConfiguration`
- `ResponseStructure`

---

## Project Structure

```text
hospitalManagementSystem/
│
├── .mvn/
│   └── wrapper/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── qsp/
│   │   │           └── hospitalManagementSystem/
│   │   │               ├── controller/
│   │   │               │   ├── BranchController.java
│   │   │               │   ├── BranchHeadController.java
│   │   │               │   ├── HospitalController.java
│   │   │               │   └── OwnerController.java
│   │   │               │
│   │   │               ├── dao/
│   │   │               │   ├── BranchDao.java
│   │   │               │   ├── BranchHeadDao.java
│   │   │               │   ├── HospitalDao.java
│   │   │               │   └── OwnerDao.java
│   │   │               │
│   │   │               ├── dto/
│   │   │               │   ├── Ambulance.java
│   │   │               │   ├── Branch.java
│   │   │               │   ├── BranchHead.java
│   │   │               │   ├── Doctors.java
│   │   │               │   ├── Employee.java
│   │   │               │   ├── Hospital.java
│   │   │               │   ├── Owner.java
│   │   │               │   ├── Patients.java
│   │   │               │   ├── Payment.java
│   │   │               │   └── Prescription.java
│   │   │               │
│   │   │               ├── exception/
│   │   │               │   ├── DoesNotExistException.java
│   │   │               │   └── GlobalExceptionHandler.java
│   │   │               │
│   │   │               ├── repo/
│   │   │               │   ├── BranchRepo.java
│   │   │               │   ├── BranchHeadRepo.java
│   │   │               │   ├── HospitalRepo.java
│   │   │               │   └── OwnerRepo.java
│   │   │               │
│   │   │               ├── service/
│   │   │               │   ├── BranchService.java
│   │   │               │   ├── BranchHeadService.java
│   │   │               │   ├── HospitalService.java
│   │   │               │   └── OwnerService.java
│   │   │               │
│   │   │               ├── util/
│   │   │               │   ├── ApplicationConfiguration.java
│   │   │               │   └── ResponseStructure.java
│   │   │               │
│   │   │               └── HospitalManagementSystemApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── qsp/
│                   └── hospitalManagementSystem/
│                       └── HospitalManagementSystemApplicationTests.java
│
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

## Database Configuration

The application uses **MySQL** as its database.

The local database configuration is maintained in:

```text
src/main/resources/application.properties
```

For local development, configure the database connection according to your MySQL setup.

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hospital_management_system
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> **Important:** Do not commit real database credentials or passwords to a public GitHub repository. Keep your actual `application.properties` file local and use placeholder values when sharing the project publicly.

---

## How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/Vinay-N-26/hospital-management-system.git
```

### 2. Navigate to the Project Directory

```bash
cd hospital-management-system
```

### 3. Configure MySQL

Create or configure your MySQL database.

Then update your local:

```text
src/main/resources/application.properties
```

with your own database URL, username, and password.

### 4. Build the Project Using Maven

Using Maven:

```bash
mvn clean install
```

Or using the Maven Wrapper on Windows:

```bash
mvnw.cmd clean install
```

### 5. Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main application class from your IDE:

```text
HospitalManagementSystemApplication.java
```

---

## API Testing

The REST APIs can be tested using **Postman** or any REST API client.

Common HTTP methods used in REST APIs include:

```text
GET
POST
PUT
DELETE
```

The APIs are organized according to the different modules of the application.

---

## Exception Handling

The application contains custom exception handling for situations where requested data does not exist.

The project includes:

```text
DoesNotExistException
GlobalExceptionHandler
```

The global exception handler helps provide structured responses when application exceptions occur.

---

## Maven

The project uses Maven for dependency management and build automation.

The main Maven configuration is available in:

```text
pom.xml
```

The project also includes the Maven Wrapper:

```text
mvnw
mvnw.cmd
```

This allows the project to be built using Maven Wrapper commands without requiring a separate Maven installation.

---

## Git and GitHub

The project is version-controlled using Git and hosted on GitHub.

Repository:

https://github.com/Vinay-N-26/hospital-management-system

---

## Learning Objectives

This project was developed to gain practical experience with:

- Core Java
- Spring Boot
- Spring Data JPA
- Hibernate
- REST API development
- MySQL
- Maven
- Postman
- Git
- GitHub
- Layered application architecture
- Database integration
- Exception handling
- Backend application development

---

## Future Enhancements

Possible future improvements include:

- User authentication and authorization
- Role-based access control
- Doctor authentication
- Patient authentication
- Appointment management
- Billing management
- Advanced search and filtering
- API documentation using Swagger / OpenAPI
- Frontend integration
- Cloud deployment
- Improved security
- Environment-based configuration

---

## Developer

**Vinay N**

**B.E. – Artificial Intelligence & Machine Learning**

**Mysore University School of Engineering**

---

## Project Purpose

This project is intended for **educational and portfolio purposes** and demonstrates backend application development using Java, Spring Boot, JPA, Hibernate, REST APIs, and MySQL.
