package ar.undec.edu.pets.persistence.crud;

import ar.undec.edu.pets.persistence.entity.PetEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICreatePetCRUD extends CrudRepository<PetEntity, Integer> {
}
