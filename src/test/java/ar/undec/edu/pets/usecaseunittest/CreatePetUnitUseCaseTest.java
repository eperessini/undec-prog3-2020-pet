package ar.undec.edu.pets.usecaseunittest;

import ar.undec.edu.pets.domain.Pet;
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

@ExtendWith({MockitoExtension.class})

public class CreatePetUnitUseCaseTest {

    @Mock
    ICreatePetRepository createPetRepository;

    @Test
    void createPetPetDoesntExistCreatePet(){
        Pet pet = Pet.instance("Magnus", "Labrador Mix", LocalDate.of(2019,2,2));
        CreatePetUseCase createPetUseCase = new CreatePetUseCase(createPetRepository);

        when(createPetRepository.exists(pet.getName())).thenReturn(false);

        boolean result = createPetUseCase.createPet(pet);

        Assertions.assertTrue(result);
    }
}
