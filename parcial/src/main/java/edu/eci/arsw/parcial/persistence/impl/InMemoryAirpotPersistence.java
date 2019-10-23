package edu.eci.arsw.parcial.persistence.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.springframework.stereotype.Service;

import edu.eci.arsw.parcial.model.Airport;
import edu.eci.arsw.parcial.persistence.AirportPersistence;
import edu.eci.arsw.parcial.persistence.AirpotPersistenceException;

@Service
public class InMemoryAirpotPersistence implements AirportPersistence {

    ConcurrentHashMap<String, List<Airport>>  airports= new ConcurrentHashMap<>();

    @Override
    public List<Airport> searchAirportsByName(String text) throws AirpotPersistenceException {
        List<Airport> res= null;
        String uri = "https://cometari-airportsfinder-v1.p.rapidapi.com/api/airports/by-text?text="+text;
        if (airports.containsKey(text)){
            res= airports.get(text);
        }else{
            try {
                HttpResponse<String> response = Unirest
                        .get(uri)
                        .header("x-rapidapi-host", "cometari-airportsfinder-v1.p.rapidapi.com")
                        .header("x-rapidapi-key", "92512f4a13msh1502aedce44d7c3p1a8f5bjsn6b552afde466").asString();
                Gson gson = new Gson();
                Type listType = new TypeToken<ArrayList<Airport>>() {
                }.getType();
                res = gson.fromJson(response.getBody(), listType);
                airports.put(text, res);
                
            } catch (UnirestException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return res;
    }

   
}