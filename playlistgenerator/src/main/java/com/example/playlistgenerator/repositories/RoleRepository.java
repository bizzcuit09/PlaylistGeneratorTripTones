package com.example.playlistgenerator.repositories;

import com.example.playlistgenerator.models.Role;
import com.example.playlistgenerator.models.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
