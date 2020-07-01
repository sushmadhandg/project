package training.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import training.demo.service.ContractorService;

@Controller
public class ContractorController {
	@Autowired
	ContractorService contractorService;
	
	
	@RequestMapping(value="/addContractor")
	public ModelAndView Contractor()
	{
		String msg="Welcome ";
		return new ModelAndView("addContractor","msg",msg);
		
	}
	
	@RequestMapping(value="NewContractor")
	public ModelAndView NewContractor()
	{
		return null;
		
	}
	
}
