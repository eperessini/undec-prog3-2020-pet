package ar.undec.edu.pets.domain;

import java.time.LocalDate;

public class Pet {

    private String name;
    private String breed;
    private LocalDate birthDate;

    private Pet(String name, String breed, LocalDate birthDate) {
    }

    public static Pet instance(String name, String breed, LocalDate birthDate){
        return new Pet (name, breed, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
