# Pathogen-api
 REST API that accepts JSON input from a mobile app containing pathogen  test metadata and stores it in memory (or SQLite).
 This is a simple Spring Boot application for managing pathogen test samples. It exposes two REST endpoints:

POST /samples – Accepts a JSON input with pathogen test metadata and stores the sample.

GET /samples – Retrieves stored samples with an optional query parameter status to filter results by classification status (e.g., positive, negative, failed, inconclusive).

The application uses an in-memory list to store the samples and classify them based on the classification logic provided.

Features
POST /samples: Adds new samples to the system and automatically classifies them based on the brightness and color values.

GET /samples: Filters samples based on their classification status.

Classification Logic:

Failed: If brightness < 50

Positive: If red >= green + 50

Negative: If green >= red + 50

Inconclusive: All other cases

Technologies Used
Spring Boot: The core framework to build the REST API.

Java: Language used for developing the backend services.

Spring Web: For building RESTful APIs.

Postman: For testing the API endpoints.

Getting Started
Prerequisites
To run the application, you will need:

Java 17 or higher

Maven for building the project (optional if you use an IDE like IntelliJ or Eclipse)

Installation
Clone the repository:

bash
Copy
git clone https://github.com/your-username/pathogen-api.git
cd pathogen-api
Build the project (if using Maven):

bash
Copy
mvn clean install
Run the Spring Boot application:

bash
Copy
mvn spring-boot:run
The application should now be running at http://localhost:8080.

API Endpoints
1. POST /samples
This endpoint allows you to add a new sample.

Request
URL: http://localhost:8080/samples

Method: POST

Content-Type: application/json
