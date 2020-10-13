package ar.undec.edu.pets.exception;

public class PetExistException extends Exception {

    @Override
    public String getMessage(){
        return "There is an existing pet with that name";
    }
}
