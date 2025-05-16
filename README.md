
---

# ✅ ToDo List REST API

This is a **RESTful API** for managing a **ToDo list**, allowing users to perform basic **CRUD operations** on tasks. The project is built using:

* **Spring Boot**
* **Spring Data JPA**
* **Hibernate**
* **MySQL**

## 🧩 Features

* Create new tasks
* View all tasks
* View a specific task by ID
* Update an existing task
* Delete tasks

## ⚙️ Technologies Used

* Java 17+
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven

## 🚀 Running Locally

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/todolist_rest_api.git
   cd todolist_rest_api
   ```

2. Configure your database in `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. Start the application:

   ```bash
   ./mvnw spring-boot:run
   ```

## 🌐 API Endpoints

> Base URL for local: `http://localhost:8080`

| Method | Endpoint                    | Description                            |
| ------ | --------------------------- | -------------------------------------- |
| GET    | `/api/v1/tasks/`            | Get all tasks                          |
| GET    | `/api/v1/tasks/{id}`        | Get a task by ID                       |
| GET    | `/api/v1/tasks/bytitle/{id}`| Get a task by ID                       |
| POST   | `/api/v1/tasks/new`         | Create a new task (JSON body required) |
| PUT    | `/api/v1/tasks/update/{id}` | Update an existing task by ID          |
| DELETE | `/api/v1/tasks/delete/{id}` | Delete a task by ID                    |

## 📝 Sample JSON Payload for POST/PUT

```json
{
  "title": "Complete assignment",
  "description": "Finish the Spring Boot project by Monday",
  "status": "pending"
}
```

## 📘 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for more details.

---
