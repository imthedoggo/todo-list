#  Introduction

This is my first restAPI that provides endpoints to a todo list.

## Endpoints

| Method | Resource 		     | Description                                              |
|--------|-----------------------|----------------------------------------------------------|
| GET    | /v1/tasks             | Returns all the existing tasks                           |
| GET    | /v1/tasks/{id}        | Returns all requests made to third-party providers       |
| POST   | /v1/tasks/            | Creates a new task with a 'to-do' status by default      |
| UPDATE | /v1/tasks/{id}        | Updates the content of one specific task                 |
| DELETE | /v1/requests          | Deletes the specified task                               |


## Run 

For running the project locally, you need to start the Postgres database:
```
docker-compose up
```

Then start the spring application:
```
mvn spring-boot:run
```