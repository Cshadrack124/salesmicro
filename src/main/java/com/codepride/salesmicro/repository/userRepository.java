package com.codepride.salesmicro.repository;

import com.codepride.salesmicro.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface userRepository extends JpaRepository<user, Integer> {
}
