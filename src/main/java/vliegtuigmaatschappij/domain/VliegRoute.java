package vliegtuigmaatschappij.domain;

import javax.persistence.*;

@Entity(name = "vliegroute")
public class VliegRoute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vlieg_route_id;

    @OneToOne(fetch = FetchType.LAZY)
    private Luchthaven vertrekLocatie;

    @OneToOne(fetch = FetchType.LAZY)
    private Luchthaven aankomstLocatie;

    public VliegRoute() {

    }

    public VliegRoute(Luchthaven aankomstLocatie, Luchthaven vertrekLocatie) {
        this.vertrekLocatie = vertrekLocatie;
        this.aankomstLocatie = aankomstLocatie;
    }

    public Luchthaven getVertrekLocatie() {
        return vertrekLocatie;
    }

    public void setVertrekLocatie(Luchthaven vertrekLocatie) {
        this.vertrekLocatie = vertrekLocatie;
    }

    public Luchthaven getAankomstLocatie() {
        return aankomstLocatie;
    }

    public void setAankomstLocatie(Luchthaven aankomstLocatie) {
        this.aankomstLocatie = aankomstLocatie;
    }
}
