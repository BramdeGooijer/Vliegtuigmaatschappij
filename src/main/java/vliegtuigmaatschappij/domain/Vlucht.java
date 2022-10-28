package vliegtuigmaatschappij.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vlucht {
    VliegRoute vliegRoute;
    List<Boeking> boekingen = new ArrayList<>();
    Vliegtuig vliegtuig;
    LocalDateTime vertrekdatum;
    LocalDateTime aankomstdatum;
    double prijsKlas1;
    double prijsBusiness;
    double prijsEconomy;
}
