#  Journal App

A REST API built with **Spring Boot** and **MongoDB** that allows users to create, read, update, and delete journal entries.

## Tech Stack

- **Java** with Spring Boot 4.0.6
- **MongoDB** 8.3.2 (NoSQL Database)
- **Spring Data MongoDB**
- **Maven** (Build Tool)
- **Mongosh** 2.8.3

##  Project Structure

```
journalApp/
├── src/main/java/com/example/journalApp/
│   ├── controller/
│   │   ├── HealthCheck.java
│   │   └── JavaEntryControllerV2.java
│   ├── entity/
│   │   └── JournalEntry.java
│   ├── repository/
│   │   └── JavaEntryRepository.java
│   ├── service/
│   │   └── JournalEntryService.java
│   └── JournalApplication.java
└── src/main/resources/
    └── application.properties
```

##  Configuration

```properties
spring.application.name=journalApp
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=journaldb
```

##  Getting Started

### Prerequisites
- Java 17+
- MongoDB installed and running
- Maven

### Run the App

1. **Clone the repository**
```bash
git clone https://github.com/muskaaanraj/journalapp.git
cd journalapp
```

2. **Start MongoDB**
```bash
mongosh
```

3. **Run the Spring Boot app**
```bash
./mvnw spring-boot:run
```

App runs on: `http://localhost:8080`

##  API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/journal` | Get all journal entries |
| POST | `/journal` | Create a new entry |
| GET | `/journal/id/{id}` | Get entry by ID |
| PUT | `/journal/id/{id}` | Update entry by ID |
| DELETE | `/journal/id/{id}` | Delete entry by ID |

## Sample Request

**POST** `/journal`

```json
{
  "title": "My First Entry",
  "content": "Today I built a Spring Boot API with MongoDB!"
}
```

**Response**
```json
{
  "id": "6a09f1f1d322e22b52a69caa",
  "title": "My First Entry",
  "content": "Today I built a Spring Boot API with MongoDB!",
  "date": "2026-05-17T22:35:30"
}
```

##  Database

Data is stored in MongoDB under:
- **Database:** `journaldb`
- **Collection:** `journalEntries`

To verify data in mongosh:
```js
use journaldb
show collections
db.journalEntries.find().pretty()
```

## Author

**Muskaan Raj** — [@muskaaanraj](https://github.com/muskaaanraj)
