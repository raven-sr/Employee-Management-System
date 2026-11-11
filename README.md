# 👨‍💼 Employee Management System

A full-stack Employee Management System built using **React.js, Java, and Spring Boot**. This application simplifies employee record management through an interactive frontend and a RESTful backend.

The system provides essential employee management operations, including creating, viewing, updating, and deleting employee records.

## 🚀 Features

### 👨‍💼 Employee Management
- Add new employee records.
- View all employees.
- View individual employee details.
- Update employee information.
- Delete employee records.
- Manage employee data through an intuitive interface.

### 🎨 Frontend
- Interactive user interface using React.js.
- Structured layouts using HTML.
- Custom styling using CSS.
- Reusable React components.
- Integration with backend REST APIs.

### ⚙️ Backend
- RESTful API development using Spring Boot.
- CRUD operations for employee management.
- Layered backend architecture.
- Database integration.
- Structured request and response handling.

## 🛠️ Tech Stack

### Frontend
- React.js
- HTML5
- CSS3
- JavaScript

### Backend
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate

### Database & Tools
- MySQL
- Maven
- Postman
- Git & GitHub

## 🏗️ Application Architecture

```text
             React Frontend
                    |
                    | HTTP Requests
                    v
              Spring Boot
                    |
                    v
               Controller
                    |
                    v
                 Service
                    |
                    v
               Repository
                    |
                    v
                 MySQL
```

## 📂 Project Structure

```text
Employee-Management-System/
│
├── frontend/
│   ├── public/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── assets/
│   │   ├── App.jsx
│   │   └── main.jsx
│   ├── package.json
│   └── index.html
│
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/example/
│   │   │   │       ├── controller/
│   │   │   │       ├── service/
│   │   │   │       ├── repository/
│   │   │   │       ├── model/
│   │   │   │       └── EmployeeManagementApplication.java
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/
│   └── pom.xml
│
└── README.md
```

*Adjust the structure according to your actual project folders.*

## ⚙️ Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/raven-sr/Employee-Management-System.git
cd Employee-Management-System
```

### 2. Backend Setup

Navigate to the backend folder:

```bash
cd backend
```

Configure your database connection in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Install dependencies and run the Spring Boot application:

```bash
mvn spring-boot:run
```

### 3. Frontend Setup

Open another terminal:

```bash
cd frontend
npm install
npm run dev
```

Open the frontend URL displayed in your terminal.

## 🔗 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/employees` | Create employee |
| GET | `/employees` | Get all employees |
| GET | `/employees/{id}` | Get employee by ID |
| PUT | `/employees/{id}` | Update employee |
| DELETE | `/employees/{id}` | Delete employee |

*Update these paths to match your actual backend API routes.*

## 📸 Screenshots

Add screenshots of your application:

- Employee Dashboard
- Employee List
- Add Employee Form
- Edit Employee Form

## 🔮 Future Enhancements

- Employee search and filtering.
- Pagination and sorting.
- Form validation and error handling.
- Authentication and authorization.
- Role-based access control.
- Improved dashboard analytics.

## 👨‍💻 Developer

**Siva Sundaram**

Full-Stack Developer | React.js | Java | Spring Boot | MERN Stack

- GitHub: [@raven-sr](https://github.com/raven-sr)
- LinkedIn: [Connect with me](https://www.linkedin.com/in/sivasundaram-m-7b5b76372/)

---

⭐ If you find this project interesting, consider giving it a star!

**Built with ❤️ using React.js and Spring Boot.**
