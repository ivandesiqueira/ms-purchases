package com.ms.purchases.services.exception;

public class PersonNotFoundException extends EntityNotFoundException {

    public PersonNotFoundException(String message) {
        super(message);
    }

    public PersonNotFoundException(Long id) {
        this(String.format("\n" +
                "There is no person with the id: %s in the database!", id));
    }
}
