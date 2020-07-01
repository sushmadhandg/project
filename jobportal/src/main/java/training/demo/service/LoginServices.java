package training.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.demo.dao.Logindao;
import training.demo.model.Login;

@Service
public class LoginServices {
	@Autowired
	Logindao logindao;

public   Login Validateadmin(Login login) {
		return (Login) logindao.Validate(login);	
		
	}
	
	

}
