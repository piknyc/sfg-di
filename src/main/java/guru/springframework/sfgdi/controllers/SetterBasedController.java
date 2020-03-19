package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedController {

	private GreetingsService greetingsService;

	@Autowired
	@Qualifier("setterGreetingService")
	public void setGreetingsService(GreetingsService greetingsService) {
		this.greetingsService = greetingsService;
	}

	public String getGreeting() {
		return greetingsService.sayGreeting();
	}
}
