package com.api_spring_postgresql_docker.entities;                    // Paquete (ubicación lógica de la clase).

import jakarta.persistence.*;                                      // Anotaciones JPA (@Entity, @Id, etc.).

@Entity                                                            // Marca la clase como entidad persistente (tabla).
@Table(name = "users")                                             // Nombre de la tabla en PostgreSQL.
public class User {

    @Id                                                            // Clave primaria.
    @GeneratedValue(strategy = GenerationType.IDENTITY)            // Autoincremental (identity en Postgres).
    private Long id;                                               // Columna id BIGSERIAL/INTEGER según DB.

    private String name;                                           // Columna name TEXT/VARCHAR.

    @Column(unique = true, nullable = false)                       // Restricción de unicidad y NOT NULL en DB.
    private String email;                                          // Columna email.


    public Long getId() { return id; }                             // Getters/setters simples.
    public String getName() { return name; }
    public String getEmail() { return email; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
}
