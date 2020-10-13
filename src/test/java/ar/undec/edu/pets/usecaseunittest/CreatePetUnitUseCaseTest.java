package ar.undec.edu.pets.usecaseunittest;

import ar.undec.edu.pets.domain.Pet;
import ar.undec.edu.pets.exception.PetExistException;
import ar.undec.edu.pets.repository.ICreatePetRepository;
import ar.undec.edu.pets.usecase.CreatePetUnitUseCase;
import ar.undec.edu.pets.usecase.CreatePetUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.mockito.Mockito.when;

@ExtendWith (MockitoExtension.class)

public class CreatePetUnitUseCaseTest {

    @Mock
    ICreatePetRepository createPetRepository;

    @Test
    void createPetPetDoesntExistCreatePet() throws PetExistException {
        Pet pet = Pet.instance("Magnus", "Labrador Mix", LocalDate.of(2019,2,2));
        CreatePetUseCase createPetUseCase = new CreatePetUseCase(createPetRepository);

        // Simulamos BD, primero comprobando si la mascota existe y luego guardamos la mascota

        when (createPetRepository.exists(pet.getName())).thenReturn(false);
        when (createPetRepository.savePet(pet)).thenReturn(true);


        // Caso de uso creacion de mascota

        boolean result = createPetUseCase.createPet(pet);

        // Comprobamos el resultado
        Assertions.assertTrue(result);
    }

    @Test
    void createPetPetExistDontCreatePet(){
        Pet pet = Pet.instance("Magnus", "Labrador Mix", LocalDate.of(2019,2,2));
        CreatePetUseCase createPetUseCase = new CreatePetUseCase(createPetRepository);

        // Simulamos BD, primero comprobando si la mascota existe

        when(createPetRepository.exists("Magnus")).thenReturn(true);

        Assertions.assertThrows(PetExistException.class, ()->createPetUseCase.createPet(pet));

    }
}
