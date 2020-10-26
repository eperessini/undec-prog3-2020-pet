package ar.undec.edu.pets.repository;

import ar.undec.edu.pets.domain.Client;

public interface ICreateClientRepository {
    boolean exists(int clientId);

    boolean saveClient(Client client);
}
