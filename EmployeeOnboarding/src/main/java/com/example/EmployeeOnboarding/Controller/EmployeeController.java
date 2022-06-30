package com.example.EmployeeOnboarding.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.EmployeeOnboarding.ServiceImpl.EmployeeServiceImpl;
import com.example.EmployeeOnboarding.dto.EmpLogDto;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl empimp;
	@GetMapping("/get")
	public List<EmpLogDto> getDeptEmployeesInnerJoin() {
		return empimp.getJoinInfo();
	}
}
