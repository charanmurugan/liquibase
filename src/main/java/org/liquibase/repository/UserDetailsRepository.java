package org.liquibase.repository;

import org.liquibase.entity.UserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetailsEntity,Long> {
}
