package vliegtuigmaatschappij.domain;

public class VliegRoute {
    private Luchthaven vertrekLocatie;
    private Luchthaven aankomstLocatie;

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
