package com.p4parttime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner{
	
	private RegistrationRepository registrationRepo;
	

	public DbSeeder(RegistrationRepository registrationRepo) {
		super();
		this.registrationRepo = registrationRepo;
	}


	@Override
	public void run(String... args) throws Exception {
		
		RegistrationModel model = new RegistrationModel("Krishnapradsa", "kprasda@gmail.com",
				"kp", "123123", "123123", "7012220205", new UserLocation("Trivandrum", "Kerala", "India"));
		
		registrationRepo.save(model);
		
	}

}
