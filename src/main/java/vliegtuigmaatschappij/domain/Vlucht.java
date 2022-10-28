package vliegtuigmaatschappij.domain;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Vlucht {
    private VliegRoute vliegRoute;
    private List<Boeking> boekingen = new ArrayList<>();
    private Vliegtuig vliegtuig;
    private LocalDateTime vertrekdatum;
    private LocalDateTime aankomstdatum;
    private double prijsKlas1;
    private double prijsBusiness;
    private double prijsEconomy;
}
