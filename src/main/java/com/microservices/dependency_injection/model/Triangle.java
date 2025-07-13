package com.microservices.dependency_injection.model;

import com.microservices.dependency_injection.interfaces.Shape;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Triangle implements Shape {
    @Override
    public  String draw(){
        return "Hi from Triangle";
    }
}
