package vliegtuigmaatschappij.domain;

import java.util.ArrayList;
import java.util.List;

public class Klant {
    private List<Boeking> boekingen = new ArrayList<>();
    private String voornaam;
    private String achternaam;
    private int leeftijd;
    private String email;
    private long telefoonnummer;
    private String nationaliteit;
}
