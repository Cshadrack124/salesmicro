package com.codepride.salesmicro.repository;

import com.codepride.salesmicro.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, Long> {
}
