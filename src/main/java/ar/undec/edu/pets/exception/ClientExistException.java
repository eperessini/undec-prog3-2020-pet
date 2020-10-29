package ar.undec.edu.pets.exception;

public class ClientExistException extends Exception {
    @Override
    public String getMessage(){
        return "There is an existing client with that ID";
    }
}
