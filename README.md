#  Introduction

This is my first restAPI that provides endpoints to a todo list.

## Endpoints

| Method | Resource 		     | Description                                                  |
|--------|-----------------------|----------------------------------------------------------|
| GET    | /v1/tasks             | Returns all the existing tasks                           |
| GET    | /v1/tasks/{id}        | Returns all requests made to third-party providers       |
| POST   | /v1/requests          | Deletes all saved requests made to third-party providers |
| UPDATE | /v1/requests          | Deletes all saved requests made to third-party providers |
| DELETE | /v1/requests          | Deletes all saved requests made to third-party providers |


## Run 

For running the project locally, you need to start the Postgres database:
```
docker-compose up
```

Then start the spring application:
```
mvn spring-boot:run
```