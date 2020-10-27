package ar.undec.edu.pets.usecase;

import ar.undec.edu.pets.domain.Client;
import ar.undec.edu.pets.exception.ClientExistException;
import ar.undec.edu.pets.repository.ICreateClientRepository;
import ar.undec.edu.pets.usecase.input.ICreateClientInput;

public class CreateClientUseCase implements ICreateClientInput {
    private ICreateClientRepository createClientRepository;

    public CreateClientUseCase(ICreateClientRepository createClientRepository) {
        this.createClientRepository = createClientRepository;
    }

    @Override
    public boolean createClient(Client client) throws ClientExistException {
        if (createClientRepository.exists(client.getId())){
            throw new ClientExistException();
        }
        else{
            createClientRepository.saveClient(client);
            return true;
        }
    }
}
