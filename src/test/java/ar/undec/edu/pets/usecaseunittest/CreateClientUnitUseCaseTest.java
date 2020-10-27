package ar.undec.edu.pets.usecaseunittest;
import ar.undec.edu.pets.domain.Client;
import ar.undec.edu.pets.repository.ICreateClientRepository;
import ar.undec.edu.pets.usecase.CreateClientUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import java.time.LocalDate;

import static org.mockito.Mockito.when;

@ExtendWith(Mockito.MockitoExtension.class)
public class CreateClientUnitUseCaseTest {

    @Mock
    ICreateClientRepository createClientRepository;



    @Test
    void createClient_ClientDoesntExist_CreateClient(){

        Client client = Client.instance("Emiliano Peressini", "B° Padre Inestal Urbano 19 nro. 22", 33707738, LocalDate.of(1988, 5,12), null);
        CreateClientUseCase createClientUseCase = new CreateClientUseCase(createClientRepository);


        //Simulacion BD
        when(createClientRepository.exists(client.getId())).thenReturn(false);
        when(createClientRepository.saveClient(client)).thenReturn(true);

        //Act

        boolean result = createClientUseCase.createClient(client);

        //Assert
        Assertions.assertTrue(result);


    }
}
