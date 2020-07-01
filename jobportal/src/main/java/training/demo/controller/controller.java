package training.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import training.demo.model.Login;
import training.demo.service.LoginServices;

@Controller
public class controller {
@Autowired
LoginServices loginServices;


@PostMapping("/dologin")
public String ClientLogin(@RequestParam("uname") String userName,@RequestParam("password") String password)
{
	Login login=new Login(userName,password);
	login=loginServices.Validateadmin(login);
	//List<Login> List=loginservice.getDetails();
	//return new ModelAndView("");
	if(login!=null) {
		System.out.println(login);
			String role =login.getRole().getRoleName();
			System.out.println("role"+role);
			if(role.equals("client")) {
				//return "admin/adminHeaderSidebar";
				return "register";
			}else if(role.equals("contractor")) {
				return "RegisterPage";
			}else
			{
				System.out.println("somethig wents wrong..");
			}	
             
	        }
			else
			{
				System.out.println( "not found");
			}
	return "index";
}




}
