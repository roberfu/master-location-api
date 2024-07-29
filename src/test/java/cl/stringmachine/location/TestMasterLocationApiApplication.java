package cl.stringmachine.location;

import org.springframework.boot.SpringApplication;

public class TestMasterLocationApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(MasterLocationApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
