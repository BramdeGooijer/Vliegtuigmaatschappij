package vliegtuigmaatschappij.domain;

import java.util.ArrayList;
import java.util.List;

public class Luchthaven {
    private String code;
    private String naam;
    private String stad;
    private String land;
    private double latitude;
    private double longitude;

    public Luchthaven(String code, String naam, String stad, String land, double latitude, double longitude) {
        this.code = code;
        this.naam = naam;
        this.stad = stad;
        this.land = land;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getStad() {
        return stad;
    }

    public void setStad(String stad) {
        this.stad = stad;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
