package org.web.pizzaapp.exception;

public class PizzeriaNotFoundException extends RuntimeException {
    public PizzeriaNotFoundException(String message) {
        super(message);
    }
}
