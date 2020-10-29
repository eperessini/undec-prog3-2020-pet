package ar.undec.edu.pets.persistence.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name="Pets")
@SequenceGenerator(name="pets_id_seq", initialValue = 1, sequenceName = "pets_id_seq", allocationSize = 1)
public class PetEntity {

    @Id
    @Column(name="idpet")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "pets_id_seq")
    private Integer idPet;

    @Column(name="name")
    private String name;
    @Column(name="breed")
    private String breed;
    @Column(name="birthdate")
    private LocalDate birthDate;

    public PetEntity() {}

    public Integer getIdPet() {
        return idPet;
    }

    public void setIdPet(Integer idPet) {
        this.idPet = idPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
