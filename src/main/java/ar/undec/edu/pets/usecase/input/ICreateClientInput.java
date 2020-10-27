package ar.undec.edu.pets.usecase.input;

import ar.undec.edu.pets.domain.Client;
import ar.undec.edu.pets.exception.ClientExistException;

public interface ICreateClientInput {
    boolean createClient(Client client) throws ClientExistException;
}
