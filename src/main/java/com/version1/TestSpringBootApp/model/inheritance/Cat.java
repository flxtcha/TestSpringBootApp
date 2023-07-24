package com.version1.TestSpringBootApp.model.inheritance;

public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println(name + " did a Meow");
    }
}
