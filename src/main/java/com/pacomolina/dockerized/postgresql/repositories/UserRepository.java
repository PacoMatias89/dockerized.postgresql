package com.pacomolina.dockerized.postgresql.repositories;

import com.pacomolina.dockerized.postgresql.user.User;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {





}
