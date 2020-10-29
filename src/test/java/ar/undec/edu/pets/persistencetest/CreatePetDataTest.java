package ar.undec.edu.pets.persistencetest;

import ar.undec.edu.pets.domain.Pet;
import ar.undec.edu.pets.persistence.CreatePetRepImpl;
import ar.undec.edu.pets.persistence.crud.ICreatePetCRUD;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest

public class CreatePetDataTest {
    @InjectMocks
    CreatePetRepImpl createPetRep;
    @Mock
    ICreatePetCRUD createPetCRUD;

    @Test
    public void testCreatePetBD()
    {
        Pet pet = Pet.instance("Magnus", "Labrador Mix", LocalDate.of(2019,2,2));

        boolean result = createPetRep.savePet(pet);

        Assertions.assertTrue(result);
    }
}
