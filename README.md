# Journal App

A lightweight **RESTful Journal API** built with **Spring Boot** that allows users to create and retrieve personal journal entries.


## Tech Stack

| Layer | Technology |
|-------|-----------|
| Language | Java |
| Framework | Spring Boot |
| Build Tool | Maven |
| Architecture | REST API |
| Storage | In-Memory (HashMap) |

---

## Project Structure

```
journalApp/
├── src/
│   └── main/
│       └── java/
│           └── com/example/journalApp/
│               ├── controller/
│               │   ├── JavaEntryController.java   # Journal CRUD endpoints
│               │   └── HealthCheck.java            # Health check endpoint
│               ├── entity/
│               │   └── JournalEntry.java           # Journal entry model
│               └── JournalApplication.java         # Main application entry point
└── pom.xml
```

---

## API Endpoints

### Base URL: `http://localhost:8080`

| Method | Endpoint | Description | Request Body |
|--------|----------|-------------|--------------|
| `GET` | `/journal` | Fetch all journal entries | None |
| `POST` | `/journal` | Create a new journal entry | JSON (see below) |
| `GET` | `/health` | Check if server is running | None |

---

### Request & Response Examples

#### Create a Journal Entry
**POST** `/journal`

```json
{
  "id": 1,
  "title": "Morning",
  "content": "I am happy"
}
```

**Response:** `true`

---

#### 📋 Get All Journal Entries
**GET** `/journal`

**Response:**
```json
[
  {
    "id": 1,
    "title": "Morning",
    "content": "I am happy"
  }
]
```

---

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.x
- IntelliJ IDEA (recommended)

### Run Locally

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/journalApp.git

# Navigate into the project
cd journalApp

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

The server will start at **`http://localhost:8080`**

---

## Testing the API

You can test the endpoints using:
- **Postman** — send GET/POST requests to `localhost:8080/journal`
- **curl:**

```bash
# GET all entries
curl http://localhost:8080/journal

# POST a new entry
curl -X POST http://localhost:8080/journal \
  -H "Content-Type: application/json" \
  -d '{"id":1,"title":"Morning","content":"I am happy"}'
```

---

##  Limitations

- Data is stored **in-memory** — all entries are lost when the server restarts
- No authentication or authorization implemented yet
- No database integration (planned for future versions)

---

##  Future Improvements

- [ ] Integrate MongoDB or MySQL for persistent storage
- [ ] Add user authentication (Spring Security + JWT)
- [ ] Add input validation
- [ ] Write unit and integration tests

---

