package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

	private SetterBasedController controller;

	@BeforeEach
	void setUp() {
		controller = new SetterBasedController();
		controller.setGreetingsService(new ConstructorGreetingService());
	}

	@Test
	void setGreetingsService() {
		System.out.println(controller.getGreeting());
	}
}