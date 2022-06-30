package com.example.EmployeeOnboarding.ServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.EmployeeOnboarding.Repo.EmployeeRepository;
import com.example.EmployeeOnboarding.Service.EmployeeService;
import com.example.EmployeeOnboarding.dto.EmpLogDto;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository emprepo;
	public List<EmpLogDto> getJoinInfo(){
		return emprepo.getJoinInformation();
		
	}
	
}
