package ar.undec.edu.pets.usecase.input;

import ar.undec.edu.pets.domain.Pet;
import ar.undec.edu.pets.exception.PetExistException;

public interface ICreatePetInput {
    boolean createPet(Pet pet) throws PetExistException;
}
