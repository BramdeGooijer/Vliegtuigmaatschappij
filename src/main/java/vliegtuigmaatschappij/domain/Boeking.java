package vliegtuigmaatschappij.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Boeking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boeking_id;

    @ManyToMany(mappedBy = "alleBoekingen")
    private List<Klant> alleKlanten = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "vlucht_id")
    private Vlucht vlucht;

    private Reisklasse reisklasse;
}
