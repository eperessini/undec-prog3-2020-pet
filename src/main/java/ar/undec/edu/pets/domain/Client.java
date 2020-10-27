package ar.undec.edu.pets.domain;

import java.time.LocalDate;

public class Client {
    String fullName;
    String adress;
    int id;
    LocalDate birthDate;
    Pet pet;

    private Client(String fullName, String adress, int id, LocalDate birthDate, Pet pet) {
        this.fullName = fullName;
        this.adress = adress;
        this.id = id;
        this.birthDate = birthDate;
        this.pet = pet;
    }

    public static Client instance(String fullName, String adress, int id, LocalDate birthDate, Pet pet) {
        return new Client (fullName, adress, id, birthDate, pet);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Pet getPet() {
        return pet;
    }

    public void setpet(Pet pet) {
        this.pet = pet;
    }
}
