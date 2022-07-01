package com.moviewheel.artifact.repository;

import com.moviewheel.artifact.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByUsername(@Param("username") String username);
}
