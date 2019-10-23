package edu.eci.arsw.parcial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.parcial.persistence.AirpotPersistenceException;
import edu.eci.arsw.parcial.services.AirportServices;

@RestController
@RequestMapping(value = "/airports")
public class AirportAPIController {

    @Autowired
    AirportServices aps = null;

    @RequestMapping(path = "/by-text", method = RequestMethod.GET)
    public ResponseEntity<?> searchAirportsByRadius(@RequestParam("text") String text) {
        try {
            return new ResponseEntity<>(aps.searchAirportsByName(text), HttpStatus.ACCEPTED);
        } catch (AirpotPersistenceException ex) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }

    }

}