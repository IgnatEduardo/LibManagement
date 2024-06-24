
# Library Management Application

This Library Management Application is a full-featured web application built with Spring Boot and Thymeleaf. It allows users to manage books, authors, publishers, and categories efficiently. The application includes functionalities for adding, updating, deleting, and listing all entities involved in library management.

## Features

- **Manage Books**: Add, update, delete, and list books with detailed attributes including ISBN, book name, and description.
- **Manage Authors**: Keep track of authors, including their names and descriptions.
- **Manage Categories**: Organize books into categories to facilitate easy access and systematic organization.
- **Manage Publishers**: Maintain a list of publishers associated with various books.
- **Export Data**: Export lists of books, authors, categories, and publishers to CSV files.
- **User Authentication**: Manage admin login with secured access to the system.

## Technology Stack

- **Spring Boot**: Framework for creating standalone, production-grade Spring based Applications.
- **MySQL**: Database for storing all application data.
- **Thymeleaf**: Server-side Java template engine for web and standalone environments.
- **Bootstrap**: Front-end framework for developing responsive and mobile-first websites.
- **Font Awesome**: Icon library and toolkit.
- **Maven**: Dependency management.


## Demo

https://github.com/IgnatEduardo/LibManagement/assets/81325426/e8bb78b4-aa4b-43cb-8ce7-8b4aab8d9f06


## Getting Started


### Prerequisites

What things you need to install the software and how to install them:

```bash
Java 17 or newer
Maven
MySQL Server
```

### Database Configuration

Before running the application, you need to create a MySQL database and update the `application.properties` file with your database name, username, and password.

1. Create a MySQL database:
   ```sql
   CREATE DATABASE library_management;
   ```

2. Update `src/main/resources/application.properties`:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/library_management
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

### Installing

A step by step series of examples that tell you how to get a development environment running:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/library-management.git
   ```
2. Navigate to the project directory:
   ```bash
   cd library-management
   ```
3. Install dependencies:
   ```bash
   mvn install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. Open your browser and visit:
   ```
   http://localhost:8080
   ```

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
