package com.microservices.dependency_injection.dependant;

import com.microservices.dependency_injection.interfaces.Shape;
import com.microservices.dependency_injection.model.Triangle;
import org.springframework.stereotype.Component;

@Component
public class Drawer {
    //    public Shape shape=new Triangle(); // Hard Coding Tightly Coupled
    private final Shape shape;
    public Drawer(Shape shape) {
        this.shape = shape;
    }
    public String drawShape() {
        return this.shape.draw();
    }
}
