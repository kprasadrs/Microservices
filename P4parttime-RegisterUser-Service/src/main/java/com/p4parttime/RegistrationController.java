package com.p4parttime;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RegistrationController {
	
	private RegistrationRepository registrationRepo;

	public RegistrationController(RegistrationRepository registrationRepo) {
		super();
		this.registrationRepo = registrationRepo;
	}
	@RequestMapping("/hello")
	private String Hello() {
		return "hello fdfdf kp";
	}
	
	@RequestMapping("/users")
	private List<RegistrationModel>getAllUsers(){
		List<RegistrationModel>list =this.registrationRepo.findAll();
		return list;
	}
	
	@GetMapping("/insertUser")
	private void insertData(){
		RegistrationModel model = new RegistrationModel("SafariTorme", "kprasda@gmail.com",
				"kp", "123123", "123123", "7012220205", new UserLocation("Trivandrum", "Kerala", "India"));
		
		registrationRepo.save(model);
	}
	@PostMapping("/register")
	private void registerUser(@RequestBody RegistrationModel data){
		RegistrationModel model = data;
		
		registrationRepo.insert(model);
	}

}
