package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class I18nEnglishGreetingService implements GreetingsService {

	@Override
	public String sayGreeting() {
		return "English - Hello";
	}
}
