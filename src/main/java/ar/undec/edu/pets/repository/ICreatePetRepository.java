package ar.undec.edu.pets.repository;

import ar.undec.edu.pets.domain.Pet;

public interface ICreatePetRepository {
    boolean exists(String namePet);
}
