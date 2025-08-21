# api-springboot-postgresql

Una **API RESTful + CRUD básica** desarrollada con Spring Boot y PostgreSQL, diseñada para aprender la estructura típica de un proyecto backend en Java y cómo utilzar el docker-compose sin necesidad de instalar dependencias.

---

## 🛠 Tecnologías utilizadas

- **JDK 17 (Eclipse Temurin)**
- **Spring Boot**
- **Maven** como gestor de dependencias
- **PostgreSQL** (usando imagen oficial de Docker, sacada de "Docker Hub")
- **Docker Compose** para levantar el servicio de la base de datos
- **DBeaver** para visualizar la base de datos de manera grafica

---

## Estructura del proyecto

El proyecto sigue una **organización limpia** de capas, separando responsabilidades:

- **`entities/`**: Contiene las clases que representan las tablas de la base de datos. Cada clase es un “modelo” de un recurso de tu API.
- **`repositories/`**: Interfaces que permiten interactuar con la base de datos (CRUD) usando Spring Data JPA.
- **`services/`**: Lógica de negocio. Aquí se procesan los datos antes de enviarlos o recibirlos del repositorio.
- **`controllers/`**: Expone los endpoints RESTful. Recibe solicitudes HTTP (`GET`, `POST`, `PUT`, `DELETE`) y devuelve respuestas JSON.

---

## Levantarla aplicación y la base de datos con Docker

1. Asegurate de tener **Docker y Docker Compose** instalados y que tu usuario pertenezca al grupo de docker: `sudo usermod -aG docker <nombre_de_usuario>` (en Linux).
2. El proyecto se ejecuta corriendo el archivo **ApiSpringPostgresqlDockerApplication** para correr el backend con Spring Boot
3. El archivo **docker-compose.yml** sirve para levantar PostgreSQL, se ejecuta con `docker compose up -d`
