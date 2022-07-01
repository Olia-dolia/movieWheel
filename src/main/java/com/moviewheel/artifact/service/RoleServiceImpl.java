package com.moviewheel.artifact.service;

import com.moviewheel.artifact.entity.Role;
import com.moviewheel.artifact.repository.RoleRepository;
import com.moviewheel.artifact.service.interfaces.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role getRoleByName(String name) {
        return roleRepository.getRoleByName(name)
                .orElseThrow(() -> new RuntimeException("Role not found by name - " + name));
    }
}
