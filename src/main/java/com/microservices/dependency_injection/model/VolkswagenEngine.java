package com.microservices.dependency_injection.model;

import com.microservices.dependency_injection.interfaces.Engine;

public class VolkswagenEngine implements Engine {
    public void start(){
        System.out.println("VolkswagenEngine is started");
    }
}
