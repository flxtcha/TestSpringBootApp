package com.version1.TestSpringBootApp.model.inheritance;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }

    @Override
    public String makeString() {
        return "Dog String is Different";
    }
}
