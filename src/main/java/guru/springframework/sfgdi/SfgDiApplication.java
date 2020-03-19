package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SfgDiApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("---- Primary");
		String greeting = myController.sayHello();
		System.out.println(greeting);


		System.out.println("---- Property");

		PropertyInjectedController propertyInjectedController =
				  (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		greeting = propertyInjectedController.getGreeting();
		System.out.println(greeting);

		System.out.println("---- Setter");

		SetterBasedController setterBasedController =
				  (SetterBasedController) ctx.getBean("setterBasedController");

		greeting = setterBasedController.getGreeting();
		System.out.println(greeting);

		System.out.println("---- Constructor");

		ConstructorInjectedController constructorInjectedController =
				  (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		greeting = constructorInjectedController.getGreeting();
		System.out.println(greeting);
	}


}
