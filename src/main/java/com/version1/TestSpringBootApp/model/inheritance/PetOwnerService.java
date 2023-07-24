package com.version1.TestSpringBootApp.model.inheritance;

public class PetOwnerService {


    public void havePetMakeNoise(Animal animal) { // dog cat snake hamster
        animal.makeNoise();
    }

}
