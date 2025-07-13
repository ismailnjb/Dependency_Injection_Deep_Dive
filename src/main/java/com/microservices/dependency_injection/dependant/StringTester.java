package com.microservices.dependency_injection.dependant;

import org.springframework.stereotype.Component;

@Component
public class StringTester {
    public String string;
    StringTester(String string){
        this.string=string;
    }
    public String display(String string){
        return this.string+" + "+string;
    }
}
