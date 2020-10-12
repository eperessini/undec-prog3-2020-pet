package ar.undec.edu.pets.usecase;

import ar.undec.edu.pets.domain.Pet;
import ar.undec.edu.pets.repository.ICreatePetRepository;
import ar.undec.edu.pets.usecase.input.ICreatePetInput;

public class CreatePetUseCase implements ICreatePetInput {

    private ICreatePetRepository createPetRepository;

    public CreatePetUseCase(ICreatePetRepository createPetRepository) {
        this.createPetRepository = createPetRepository;
    }


    @Override
    public boolean createPet(Pet pet) {
        return false;
    }
}

