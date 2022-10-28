package vliegtuigmaatschappij.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "vliegtuig")
public class Vliegtuig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vliegtuig_id;

    private String vliegtuigtype;

    private int stoelenKlas1;

    private int stoelenBusiness;

    private int stoelenEconomy;

    @OneToMany(mappedBy = "vliegtuig", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vlucht> alleVluchten = new ArrayList<>();

    public Vliegtuig() {

    }
}
