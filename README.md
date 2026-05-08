Task Manager API (Spring Boot Microservices Project)

A backend-focused Task Management system built using Core Java and Spring Boot, designed to demonstrate production-style backend engineering practices including RESTful API design, layered architecture, unit testing, and database integration.

This project is actively being developed as part of my preparation for enterprise backend roles focused on Spring Boot microservices, scalable API design, and cloud-ready applications.

🚀 Project Overview

This project simulates a real-world task management backend system where users can create, update, delete, and track tasks.

It is designed with enterprise-style backend architecture principles in mind, focusing on:

Clean separation of concerns
Scalable REST API design
Testable service layer logic
Database-backed persistence
Cloud-ready deployment structure (Docker-ready)

The goal is to reflect the kind of backend engineering work commonly done in enterprise digital transformation environments like Cognizant Enterprise Platform Services (EPS).

🧠 Key Features
Create, update, delete, and retrieve tasks (CRUD operations)
RESTful API design following HTTP best practices
Layered architecture (Controller → Service → Repository)
Input validation and exception handling
In-memory / SQL-based persistence (expandable to PostgreSQL/MySQL)
Unit testing with JUnit
Mock-based testing using Mockito
Clean and maintainable code structure
🛠️ Tech Stack
Backend
Java (Core Java, OOP principles)
Spring Boot
Spring Web (REST APIs)
Spring Data JPA (data persistence)
Database
SQL (H2 / PostgreSQL-ready design)
Testing
JUnit 5
Mockito
DevOps / Tools
Git & GitHub (version control)
Docker (containerization-ready)
Maven (build tool)
Postman (API testing)
GitHub Actions (CI/CD - planned/in progress)
🏗️ Architecture

This project follows a layered architecture commonly used in enterprise Spring Boot applications:

Controller Layer   → Handles REST API requests
Service Layer      → Business logic
Repository Layer   → Data access abstraction
Database Layer     → SQL-based persistence
Design Principles Used:
SOLID principles
Separation of concerns
Dependency Injection (Spring IoC)
RESTful API conventions
📡 API Endpoints (Sample)
Task Operations
GET /api/tasks → Get all tasks
GET /api/tasks/{id} → Get task by ID
POST /api/tasks → Create new task
PUT /api/tasks/{id} → Update task
DELETE /api/tasks/{id} → Delete task
🧪 Testing Strategy

This project emphasizes test-driven backend development practices:

Unit tests for service layer using JUnit 5
Mocking dependencies using Mockito
Controller-level API testing (in progress)

Example focus areas:

Business logic correctness
Edge cases handling
Service-repository interaction validation
📦 Running the Project
Prerequisites
Java 17+
Maven
Git
Steps
git clone https://github.com/your-username/task-manager-api.git
cd task-manager-api
mvn spring-boot:run

API will start at:

http://localhost:8080
🐳 Docker (Planned / In Progress)

This project is being extended to include containerization using Docker:

Dockerfile setup for Spring Boot app
Image-based deployment for consistency across environments
Preparation for cloud deployment (AWS/GCP-ready structure)
🔄 CI/CD (Planned)

Planned integration using GitHub Actions:

Automated build pipeline
Unit test execution on push
Docker image build workflow
☁️ Cloud Readiness

The project is being structured with cloud deployment in mind:

Stateless REST API design
Environment-based configuration
Containerization support (Docker)
Future deployment target: AWS / GCP
📌 Why This Project Matters

This project is intentionally aligned with enterprise backend expectations such as:

Spring Boot microservices development
REST API design and integration
Unit testing with JUnit/Mockito
SQL-based persistence design
Git-based collaboration workflow
Exposure to CI/CD and containerization concepts

It directly reflects the kind of work done in enterprise digital engineering teams like Cognizant EPS, where scalable backend services and fast delivery cycles are key.

🔮 Future Improvements
Migration to full microservices architecture
PostgreSQL production setup
JWT authentication & Spring Security
Kafka/RabbitMQ event-driven messaging
Kubernetes deployment
Swagger API documentation
👨‍💻 Author

Built by a Computer Science graduate actively developing enterprise-ready backend engineering skills in Java + Spring Boot ecosystem, with a focus on scalable system design and real-world software engineering practices.
