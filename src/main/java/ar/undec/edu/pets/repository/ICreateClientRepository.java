package ar.undec.edu.pets.repository;

import ar.undec.edu.pets.domain.Client;
import ar.undec.edu.pets.domain.Pet;

public interface ICreateClientRepository {
    boolean exists(int clientId);
    boolean saveClient(Client client);

}
