package com.microservices.dependency_injection.model;

import com.microservices.dependency_injection.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component
public class MercedesEngine implements Engine {
    public void start(){
        System.out.println("MercedesEngine is started");
    }
}
