package ar.undec.edu.pets.domain;

import java.time.LocalDate;

public class Client {
    String fullName;
    String adress;
    int id;
    LocalDate birthDate;

    private Client(String fullName, String adress, int id, LocalDate birthDate) {
        this.fullName = fullName;
        this.adress = adress;
        this.id = id;
        this.birthDate = birthDate;
    }

    public static Client instance(String fullName, String adress, int id, LocalDate birthDate) {
        return new Client (fullName, adress, id, birthDate);
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
}
