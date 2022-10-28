package vliegtuigmaatschappij.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Klant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long klant_id;

    private String voornaam;

    private String achternaam;

    private int leeftijd;

    private String email;

    private long telefoonnummer;

    private String nationaliteit;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(
            name = "klant_boekingen",
            joinColumns = @JoinColumn(name = "klant_id"),
            inverseJoinColumns = @JoinColumn(name = "boeking_id"))
    private List<Boeking> alleBoekingen = new ArrayList<>();
}
