package com.microservices.dependency_injection.runner;

import com.microservices.dependency_injection.dependant.Car;
import com.microservices.dependency_injection.dependant.Drawer;
import com.microservices.dependency_injection.dependant.StringTester;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final Drawer drawer;
    private final Car car;
    private final StringTester stringTester;
    public AppRunner(Drawer drawer,Car car,StringTester stringTester) {
        this.drawer = drawer;
        this.car=car;
        this.stringTester=stringTester;
    }

    @Override
    public void run(String... args) {
        System.out.println("Spring Dependency Injection into Drawer: "+drawer.drawShape());
        System.out.print("Spring Dependency Injection into Car: ");
        car.startCar();
        System.out.println("Spring Dependency Injection into StringTester: "+stringTester.display("Successfully Tested String"));
    }
}
