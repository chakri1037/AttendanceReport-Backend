package com.example.EmployeeOnboarding.Repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.EmployeeOnboarding.Entity.Employee;
import com.example.EmployeeOnboarding.dto.EmpLogDto;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	@Query("SELECT new com.example.EmployeeOnboarding.dto.EmpLogDto(e.id,e.employeeName,l.loginTime) FROM Employee e LEFT JOIN e.loginhistory l")
	List<EmpLogDto> getJoinInformation();	
}
