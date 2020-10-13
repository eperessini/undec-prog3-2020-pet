package ar.undec.edu.pets.usecase;

import ar.undec.edu.pets.domain.Pet;
import ar.undec.edu.pets.exception.PetExistException;
import ar.undec.edu.pets.repository.ICreatePetRepository;
import ar.undec.edu.pets.usecase.input.ICreatePetInput;

public class CreatePetUseCase implements ICreatePetInput {

    private ICreatePetRepository createPetRepository;

    public CreatePetUseCase(ICreatePetRepository createPetRepository) {
        this.createPetRepository = createPetRepository;
    }



    @Override
    public boolean createPet(Pet pet) throws PetExistException {
        if (createPetRepository.exists(pet.getName())){
            throw new PetExistException();
        }
        else{
            createPetRepository.savePet(pet);
            return true;
        }
    }
}

