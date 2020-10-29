package ar.undec.edu.pets.persistence;

import ar.undec.edu.pets.domain.Pet;
import ar.undec.edu.pets.persistence.crud.ICreatePetCRUD;
import ar.undec.edu.pets.persistence.entity.PetEntity;
import ar.undec.edu.pets.repository.ICreatePetRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CreatePetRepImpl implements ICreatePetRepository {

    @Autowired
    ICreatePetCRUD createPetCRUD;
    @Override
    public boolean exists(String petName) {
        return false;
    }

    @Override
    public boolean savePet(Pet pet) {
        PetEntity petBD = new PetEntity();
        petBD.setName(pet.getName());
        petBD.setBirthDate(pet.getBirthDate());
        petBD.setBreed(pet.getBreed());

        return this.createPetCRUD.save(petBD).getIdPet()!=null;
    }
}
