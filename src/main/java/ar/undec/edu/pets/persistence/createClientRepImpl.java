package ar.undec.edu.pets.persistence;

import ar.undec.edu.pets.domain.Client;
import ar.undec.edu.pets.repository.ICreateClientRepository;

public class createClientRepImpl implements ICreateClientRepository {
    @Override
    public boolean exists(int clientId) {
        return false;
    }

    @Override
    public boolean saveClient(Client client) {
        return false;
    }
}
