package com.microservices.dependency_injection.model;

import com.microservices.dependency_injection.interfaces.Shape;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class Circle implements Shape {
    @Override
    public  String draw(){
        return "Hi from Circle";
    }
}
