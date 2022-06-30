package com.example.EmployeeOnboarding.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.EmployeeOnboarding.Entity.LoginHistory;

public interface LoginHistoryRepository extends JpaRepository<LoginHistory,Long>{

}
