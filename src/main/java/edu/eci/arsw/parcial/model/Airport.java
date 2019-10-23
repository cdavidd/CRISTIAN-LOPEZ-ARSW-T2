package edu.eci.arsw.parcial.model;

import java.util.List;

public class Airport {
    String airportId;
    String code;
    String name;
    Location location;
    String cityId;
    String city;
    String countryCode;
    List<String> themes;
    List<String> pointsOfSale;

    public Airport() {
    }

    public String getAirportId() {
        return airportId;
    }

    public void setAirportId(String airportId) {
        this.airportId = airportId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public List<String> getThemes() {
        return themes;
    }

    public void setThemes(List<String> themes) {
        this.themes = themes;
    }

    public List<String> getPointsOfSale() {
        return pointsOfSale;
    }

    public void setPointsOfSale(List<String> pointsOfSale) {
        this.pointsOfSale = pointsOfSale;
    }

    @Override
    public String toString() {
        return "Airport{airportId=" + airportId + ", city=" + city + ", cityId=" + cityId + ", code=" + code
                + ", countryCode=" + countryCode + ", location=" + location + ", name=" + name + ", pointsOfSale="
                + pointsOfSale + ", themes=" + themes + "}";
    }

}