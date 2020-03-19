package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

	public GreetingsService greetingsService;

	ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingsService greetingsService) {
		this.greetingsService = greetingsService;
	}

	public String getGreeting() {
		return greetingsService.sayGreeting();
	}
}
