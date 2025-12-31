package com.learnToDeploy.DeployLearn.repository;

import com.learnToDeploy.DeployLearn.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
