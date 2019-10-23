package edu.eci.arsw.parcial.persistence;

import java.util.List;

import edu.eci.arsw.parcial.model.Airport;

public interface AirportPersistence {

    public List<Airport> searchAirportsByName(String text) throws AirpotPersistenceException;

}