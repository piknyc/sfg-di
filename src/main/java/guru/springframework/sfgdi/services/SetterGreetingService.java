package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingsService {

	@Override
	public String sayGreeting() {
		return "Hello World! - Setter";
	}
}
