# FitMeGym

FitMeGym is a fitness application for managing workout sessions and tracking personal fitness journeys. This application allows users to register, log in, manage their workouts, add exercises and categories, and track their progress.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [REST API](#rest-api)
- [Contribution](#contribution)
- [License](#license)

## Features

- User registration and login
- Workout management
- Adding and deleting exercises
- Adding and deleting categories
- Tracking personal workout journey

## Technologies Used

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Thymeleaf
- H2 Database (for development)
- Maven

## Project Structure

```plaintext
FitMeGym/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │           └── fitmegym/
│   │   │               ├── config/
│   │   │               │   ├── WebSecurityConfig.java
│   │   │               │   └── UserDetailsServiceConfig.java
│   │   │               ├── controller/
│   │   │               │   ├── api/
│   │   │               │   │   ├── ApiCategoryController.java
│   │   │               │   │   ├── ApiExerciseController.java
│   │   │               │   │   ├── ApiMyWorkoutJourneyController.java
│   │   │               │   │   └── ApiUserController.java
│   │   │               │   ├── CategoryController.java
│   │   │               │   ├── ExerciseController.java
│   │   │               │   ├── MyWorkoutJourneyController.java
│   │   │               │   ├── RegisterController.java
│   │   │               │   └── WorkoutController.java
│   │   │               ├── entity/
│   │   │               │   ├── Category.java
│   │   │               │   ├── Exercise.java
│   │   │               │   ├── MyWorkoutJourney.java
│   │   │               │   ├── User.java
│   │   │               │   └── Workout.java
│   │   │               ├── repository/
│   │   │               │   ├── CategoryRepository.java
│   │   │               │   ├── ExerciseRepository.java
│   │   │               │   ├── MyWorkoutJourneyRepository.java
│   │   │               │   ├── UserRepository.java
│   │   │               │   └── WorkoutRepository.java
│   │   │               ├── service/
│   │   │               │   ├── CategoryService.java
│   │   │               │   ├── CustomUserDetailsService.java
│   │   │               │   ├── ExerciseService.java
│   │   │               │   ├── MyWorkoutJourneyService.java
│   │   │               │   ├── UserService.java
│   │   │               │   └── WorkoutService.java
│   │   │               └── FitMeGymApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── css/
│   │       │       └── styles.css
│   │       ├── templates/
│   │       │   ├── fragments/
│   │       │   │   └── navigation.html
│   │       │   ├── categories.html
│   │       │   ├── exercises.html
│   │       │   ├── home.html
│   │       │   ├── login.html
│   │       │   ├── myworkoutjourney.html
│   │       │   ├── register.html
│   │       │   ├── users.html
│   │       │   └── workouts.html
│   │       ├── application.properties
│   │       └── data.sql
│   └── test/
│       └── java/
│           └── com/
│                   └── fitmegym/
│                       └── SpringProjectApplicationTests.java
├── .gitignore
├── README.md
├── pom.xml
└── mvnw
```

## Installation

1. Clone the repository:

```bash
git clone https://github.com/yasmine-BR/FitMeGym.git
cd FitMeGym
```

2. Make sure you have Maven and Java installed on your machine.

3. Build the project and download dependencies:

```bash
mvn clean install
```

## Configuration

1. Configure your database in the `application.properties` file. For development, you can use the embedded H2 database:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

2. You can also configure other application settings in `application.properties`.

## Usage

1. Start the application:

```bash
mvn spring-boot:run
```

2. Access the application in your browser at [http://localhost:8080](http://localhost:8080).

3. Use the navigation links to access various features of the application, such as registration, login, and workout management.

## REST API

The application also exposes REST endpoints for interacting with the data. Here are some examples:

- **Users**
  - `GET /api/users` : List all users
  - `POST /api/users` : Add a new user
  - `PUT /api/users/{id}` : Update a user
  - `DELETE /api/users/{id}` : Delete a user

- **Categories**
  - `GET /api/categories` : List all categories
  - `POST /api/categories` : Add a new category
  - `PUT /api/categories/{id}` : Update a category
  - `DELETE /api/categories/{id}` : Delete a category

- **Exercises**
  - `GET /api/exercises` : List all exercises
  - `POST /api/exercises` : Add a new exercise
  - `PUT /api/exercises/{id}` : Update an exercise
  - `DELETE /api/exercises/{id}` : Delete an exercise

## Contribution

Contributions are welcome! To contribute, follow these steps:

1. Fork the repository.
2. Create a branch for your feature (`git checkout -b my-new-feature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push your branch (`git push origin my-new-feature`).
5. Open a Pull Request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
```

### Project Structure

```plaintext
FitMeGym/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │           └── fitmegym/
│   │   │               ├── config/
│   │   │               │   ├── WebSecurityConfig.java
│   │   │               │   └── UserDetailsServiceConfig.java
│   │   │               ├── controller/
│   │   │               │   ├── api/
│   │   │               │   │   ├── ApiCategoryController.java
│   │   │               │   │   ├── ApiExerciseController.java
│   │   │               │   │   ├── ApiMyWorkoutJourneyController.java
│   │   │               │   │   └── ApiUserController.java
│   │   │               │   ├── CategoryController.java
│   │   │               │   ├── ExerciseController.java
│   │   │               │   ├── MyWorkoutJourneyController.java
│   │   │               │   ├── RegisterController.java
│   │   │               │   └── WorkoutController.java
│   │   │               ├── entity/
│   │   │               │   ├── Category.java
│   │   │               │   ├── Exercise.java
│   │   │               │   ├── MyWorkoutJourney.java
│   │   │               │   ├── User.java
│   │   │               │   └── Workout.java
│   │   │               ├── repository/
│   │   │               │   ├── CategoryRepository.java
│   │   │               │   ├── ExerciseRepository.java
│   │   │               │   ├── MyWorkoutJourneyRepository.java
│   │   │               │   ├── UserRepository.java		  
│   │   │							└── WorkoutRepository.java
│   │   │               ├── service/
│   │   │               │   ├── CategoryService.java
│   │   │               │   ├── CustomUserDetailsService.java
│   │   │               │   ├── ExerciseService.java
│   │   │               │   ├── MyWorkoutJourneyService.java
│   │   │               │   ├── UserService.java
│   │   │               │   └── WorkoutService.java
│   │   │               └── FitMeGymApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── css/
│   │       │       └── styles.css
│   │       ├── templates/
│   │       │   ├── fragments/
│   │       │   │   └── navigation.html
│   │       │   ├── categories.html
│   │       │   ├── exercises.html
│   │       │   ├── home.html
│   │       │   ├── login.html
│   │       │   ├── myworkoutjourney.html
│   │       │   ├── register.html
│   │       │   ├── users.html
│   │       │   └── workouts.html
│   │       ├── application.properties
│   │       └── data.sql
│   └── test/
│       └── java/
│           └── com/
│                   └── fitmegym/
│                       └── SpringProjectApplicationTests.java
├── .gitignore
├── README.md
├── pom.xml
└── mvnw
```