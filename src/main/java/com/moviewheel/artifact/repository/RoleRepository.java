package com.moviewheel.artifact.repository;

import com.moviewheel.artifact.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.*;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> getRoleByName(@Param("name") String name);
}
