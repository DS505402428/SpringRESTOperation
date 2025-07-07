
# SpringRESTOperation

A simple Spring Boot application demonstrating basic RESTful operations such as GET, POST, PUT, and DELETE using Spring MVC and Spring Boot.

---

## Features

- Create, Read, Update, and Delete (CRUD) operations
- RESTful API design using Spring MVC
- Simple POJO-based model with in-memory data (no database persistence)
- Clean separation of concerns using controller, service, and model layers

---

## Project Structure

SpringRESTOperation/
├── src/
│ └── main/
│ ├── java/
│ │ └── com.sandeep.SandeepJobPortal/
│ │ ├── controller/
│ │ ├── model/
│ │ └── service/
│ └── resources/
│ └── application.properties
├── pom.xml
└── README.md


---

## Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring MVC
- Maven
- Lombok

---

##  How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/DS505402428/SpringRESTOperation.git
   cd SpringRESTOperation


##  How to Build and Run

### Build the Project

```bash
mvn clean install


##  Run the Application
mvn spring-boot:run

The application should start on: http://localhost:8080/


##  Sample REST Endpoints

Assuming you are working with a `JobPost` object:

### GET all job posts
```http
GET /getJobs

### POST a new job post
``http
POST /addJob

Request Body (JSON):

{
"postId": 1,
"postProfile": "Java Developer",
"postDesc": "Experienced in Spring Boot",
"reqExperience": 3,
"postTechStack": ["Java", "Spring Boot", "REST"]
}

###  PUT (update) a job post
```http
PUT /updateJob

### DELETE a job post
```http
DELETE /deleteJob/{id}

