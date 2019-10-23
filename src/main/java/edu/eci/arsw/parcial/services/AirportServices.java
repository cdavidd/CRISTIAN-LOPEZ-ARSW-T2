package edu.eci.arsw.parcial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.parcial.model.Airport;
import edu.eci.arsw.parcial.persistence.AirportPersistence;
import edu.eci.arsw.parcial.persistence.AirpotPersistenceException;

@Service
public class AirportServices {
    @Autowired
    AirportPersistence app = null;

    

    public List<Airport> searchAirportsByName(String text) throws AirpotPersistenceException {
        return app.searchAirportsByName(text);
    }

    

}