#ADRs

---
###ADR-001: Use Java with Spring Boot for backend development.
###Date: 29/5/2025.

### Status
Accepted.

###Context
The application needs a programming language and framework that supports backend server-side logic, data fetching, persistence, and 
RESTful APIs.
For the backend, the language and framework must support:
- REST API development.
- Scheduled tasks (periodic API calls).
- Easy and robust integration with a database.
- Long term maintainability and scalability.

###Decision
Use Java as the programming language and Spring Boot as the primary framework for backend development. Java is a widely 
used and well-supported language in enterprise and large scale systems.

### Consequences
- Rapid, efficient development with many built-in features that support REST APIs, database integration and task scheduling.
- Easy integration with testing (JUnit), CI/CD and containerisation(Docker).
---
###ADR-002: Use PostgreSQL for flight data storage
Date: 29/5/2025

### Status
Accepted

###Context
The application periodically fetches live flight data from OpenSky and needs a relational database to store flight historical position
data with timestamp, latitude, longitude and altitude. The application needs to store this information for:
- Retrieving flight position history which will be used to display the flight path.
- Mapping flight paths with altitude and timestamp data.

###Decision
Use PostgreSQL as the relational database system due to its reliability, compatibility with Spring Data JPA, ability to
handle complex data relationships and ability to use PostGIS for geospatial data if needed.

Proposed Schema:

Table: **flight**

Description: Stores flight meta data.

| Column         | type    | 
|----------------|---------|
| icao24         | varchar |
| callsign       | varchar |
| origin country | varchar |



Table: **flight_position**

Description: Stores periodic flight position data linked to a flight.

| Column       | Type          | 
|--------------|---------------|
| id           | uuid          |
| icao24       | varchar       |
| Callsign     | varchar       |                        
| Latitude     | double        |
| Longitude    | double        |
| baroaltitude | double        |
| timestamp    | LocalDateTime |
| ColourCode   | varchar       |

One to many relationship - One flight has many positions.

### Consequences
- Well supported by with Spring Data JPA.
- Reliable and scalable.
- Can handle storing and indexing time-series data and complex queries.
- Access to future geospatial support.

---
###ADR-003: Use RESTful APIs with JSON
Date: 29/5/2025

### Status
Accepted

###Context
The application needs a way to expose backend functionality so that users can retrieve and interact with the data.

###Decision
Use RESTful APIs with JSON to communicate with the backend via API endpoints as it's easy to build in Spring Boot 
via @RestController, easy to test endpoints via Postman or curl, and it's a widely adopted industry standard.

### Consequences

- Simple and fast to implement with Spring Boot.
- Easy to test with tools like Postman and curl.

---
###ADR-004: Periodic fetching from OpenSky with @Scheduled
Date: 29/5/2025

### Status
Accepted

###Context

The application needs to fetch live flight data periodically. A simple and reliable mechanism is required for task 
scheduling.
###Decision
Use Spring Boot’s ‘@Scheduled’ annotation to trigger data fetching at fixed intervals.

### Consequences

- Using '@Scheduled' simplifies task scheduling.
- No need to use external cron managers.

---

###ADR-005:  Use JUnit and Mockito for testing
Date: 29/5/2025

### Status
Accepted

###Context

Testing is critical for maintaining code quality and application stability so reliable unit and integration tests are needed.


###Decision

Use JUnit for unit and integration testing and Mockito for mocking dependencies.

### Consequences

- JUnit is the standard testing framework for Java and is widely used and well-supported.
- Easy to write, execute and maintain tests with JUnit.
- Mockito integrates seamlessly with JUnit and Spring.
- Easy integration with CI/CD pipeline in GitHub Actions.

---
###ADR-006:  Use Postman for API testing
Date: 29/5/2025

### Status
Accepted

###Context

As the application exposes RESTful endpoints, it is important to test them manually to ensure correctness and stability.
Therefore we need a tool that allows easy testing of HTTP endpoints.
###Decision

Use Postman for manual and automated API testing.
### Consequences

- Fast testing of API endpoints via a user-friendly interface.
- Supports test autonation through collections and Newman(Postman's CLI).
---

###ADR-007:  Use Docker for containerisation
Date: 29/5/2025

### Status
Accepted

###Context

Containerisation is needed to ensure a consistent way to package and run the application across environments, ensuring 
portability and consistent deployments.

###Decision

Use Docker to containerise the application and PostgresQL.


### Consequences

- Simple and rapid deployments.
- Ensures consistency across environments.
- Works well with CI/CD.

---
###ADR-008:  Use Github Actions for CI/CD.
Date: 29/5/2025

### Status
Accepted

###Context

It’s important to automate builds, tests and deployment steps.
###Decision

Use Github Actions for CI/CD to automate tests and Docker builds.

### Consequences
- Fully integrated with Github.
- Github Actions offers customisation allowing flexibility.
