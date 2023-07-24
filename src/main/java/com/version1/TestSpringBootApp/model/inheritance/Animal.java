package com.version1.TestSpringBootApp.model.inheritance;

public abstract class Animal {

    public String name;

    abstract public void makeNoise();

    public String makeString() {
        return "Some string";
    }
}
