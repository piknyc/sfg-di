package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class I18nSpanishGreetingService implements GreetingsService {

	@Override
	public String sayGreeting() {
		return "Spanish Holla!";
	}
}
