package ar.undec.edu.pets.usecase.input;

import ar.undec.edu.pets.domain.Pet;

public interface ICreatePetInput {
    boolean exists(String petName);
}
