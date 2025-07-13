package com.microservices.dependency_injection;

import com.microservices.dependency_injection.dependant.Drawer;
import com.microservices.dependency_injection.model.Circle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInjectionApplication  {


	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
		//manual dependency injection
		Circle circle=new Circle();
		Drawer drawer = new Drawer(circle);
		System.out.println("Manual Dependency Injection into Drawer: "+drawer.drawShape());
	}


//	@Bean
//	public Drawer drdfbawer(Shape shape) {
//		return new Drawer(shape);  // Shape bean injected automatically
//	}

//	@Bean
//	public Shape triansdfgsfgle() {
//		return new Triangle();  // Spring manages this bean
//	}
//	@Primary
//
//	@Bean
//	public Shape triansdfguhsfgle() {
//		return new Circle();  // Spring manages this bean
//	}

	@Bean
	public String triansdfgefefuhsfgle() {
		return "Random String Generated";  // Spring manages this bean
	}
}
