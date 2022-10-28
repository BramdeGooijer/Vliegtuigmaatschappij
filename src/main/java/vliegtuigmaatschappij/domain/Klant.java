package vliegtuigmaatschappij.domain;

import java.util.ArrayList;
import java.util.List;

public class Klant {
    List<Boeking> boekingen = new ArrayList<>();
    String voornaam;
    String achternaam;
    int leeftijd;
    String email;
    long telefoonnummer;
    String nationaliteit;
}
