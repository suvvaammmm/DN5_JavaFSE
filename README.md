# DN5 - Java FSE Hands-On

Solutions and practice work for the **Cognizant Digital Nurture 5.0 – Java Full Stack Engineering (FSE)** program, completed as part of the technical onboarding track.

## About

This repository contains my solutions to the mandatory hands-on exercises assigned in the Cognizant Digital Nurture Java FSE study material, organized by skilling phase and module.

## Tech Stack

- **Language:** Java
- **Build Tool:** Maven
- **Testing:** JUnit 5, Mockito, SLF4J
- **Backend:** Spring Core, Spring Boot, Spring Data JPA, Hibernate
- **Database:** MySQL / PL-SQL
- **Frontend:** Angular
- **Microservices:** Spring Cloud, Eureka, API Gateway
- **DevOps:** Git, Docker
- **Cloud:** AWS Basics

## Modules Covered

| # | Module |
|---|--------|
| 1 | Design Patterns & SOLID Principles |
| 2 | Data Structures & Algorithms |
| 3 | PL/SQL Programming |
| 4 | JUnit 5 & Mockito (TDD) |
| 5 | SLF4J Logging |
| 6 | Spring Core & Maven |
| 7 | Spring Data JPA & Hibernate |
| 8 | Spring REST / Spring Boot |
| 9 | JWT Authentication |
| 10 | Microservices (Spring Cloud, Eureka, API Gateway) |
| 11 | Angular |
| 12 | Git |
| 13 | Docker |
| 14 | AWS Basics |
| 15 | Agile |
| 16 | GenAI Basics |

## Mandatory Hands-On Exercises

Exercises marked **Mandatory** in `DN - Java FSE Mandatory hands-on detail.xlsx`:

- **Design Patterns & Principles** – Singleton Pattern, Factory Method Pattern
- **Data Structures & Algorithms** – E-commerce Platform Search Function, Financial Forecasting
- **PL/SQL** – Control Structures, Stored Procedures
- **JUnit** – Setting Up JUnit, Assertions in JUnit, Arrange-Act-Assert Pattern (Test Fixtures, Setup/Teardown)
- **Mockito** – Mocking and Stubbing, Verifying Interactions
- **SLF4J** – Logging Error Messages and Warning Levels
- **Spring Core & Maven** – Configuring a Basic Spring Application, Dependency Injection, Creating & Configuring a Maven Project
- **Spring Data JPA & Hibernate** – Country CRUD Service, Query Methods, O/R Mapping, HQL & Native Queries
- **Spring REST (Spring Boot 3)** – Web Project Setup, Hello World REST Service, Country Web Service, Get Country by Code
- **JWT** – Authentication Service returning JWT
- **Microservices** – Account & Loan Microservices, Eureka Discovery Server registration
- **React** – All hands-on documents (1–17)
- **Git** – All 5 Git hands-on documents
- **Angular** – Angular hands-on document

## How to Run

Each exercise folder contains its own instructions. In general:

```bash
# Clone the repo
git clone https://github.com/<your-username>/DN5_JavaFSE.git
cd DN5_JavaFSE

# Core Java exercises
cd Upskilling/CoreJava
javac HelloWorld.java && java HelloWorld

# Maven-based exercises (Design Patterns, JUnit/Mockito, etc.)
cd DeepSkilling/<module>/<exercise-folder>
mvn clean install
mvn test
```

## Notes

- This repo is updated regularly as new modules and exercises are completed during the program.
- Reference material is sourced from Cognizant's official Digital Nurture Java FSE GitHub repository and study handbook.

---
*Maintained as part of Cognizant Digital Nurture 5.0 – Java Full Stack Engineering track.*
