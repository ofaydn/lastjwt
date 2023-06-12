package com.sau.jwt.Repository;

import com.sau.jwt.Enums.EnumRole;
import com.sau.jwt.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(EnumRole name);
}
