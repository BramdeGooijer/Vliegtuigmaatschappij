package vliegtuigmaatschappij.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "vlucht")
public class Vlucht {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vlucht_id;

    @OneToOne(fetch = FetchType.LAZY)
    private VliegRoute vliegRoute;

    @ManyToOne
    @JoinColumn(name = "vliegtuig_id")
    private Vliegtuig vliegtuig;

    @OneToMany(mappedBy = "vlucht", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Boeking> boekingen = new ArrayList<>();

    private LocalDateTime vertrekdatum;

    private LocalDateTime aankomstdatum;

    private double prijsKlas1;

    private double prijsBusiness;

    private double prijsEconomy;
}
