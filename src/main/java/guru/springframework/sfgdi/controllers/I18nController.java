package guru.springframework.sfgdi.controllers;


import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

	private final GreetingsService greetingsService;

	public I18nController(GreetingsService greetingsService) {
		this.greetingsService = greetingsService;
	}

	public String sayHello() {
		return greetingsService.sayGreeting();
	}
}
