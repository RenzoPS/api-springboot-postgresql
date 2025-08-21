package com.api_spring_postgresql_docker.repositories;

import com.api_spring_postgresql_docker.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
}
