package com.microservices.dependency_injection.dependant;

import com.microservices.dependency_injection.interfaces.Engine;
import com.microservices.dependency_injection.model.MercedesEngine;
import org.springframework.stereotype.Component;

@Component
public class Car {
    //    public Engine engine = new MercedesEngine();//Tight Coupling
    public Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        this.engine.start();
    }

}
