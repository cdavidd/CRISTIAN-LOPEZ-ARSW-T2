package edu.eci.arsw.parcial.persistence;

public class AirpotPersistenceException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public AirpotPersistenceException(String message) {
        super(message);
    }

    public AirpotPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

}