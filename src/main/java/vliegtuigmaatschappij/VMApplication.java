package vliegtuigmaatschappij;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vliegtuigmaatschappij.data.VMRepository;
import vliegtuigmaatschappij.domain.Luchthaven;
import vliegtuigmaatschappij.domain.VliegRoute;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@SpringBootApplication
public class VMApplication {
    public static VMRepository vmRepositoryStatic;

    public static void main(String[] args) {
        SpringApplication.run(VMApplication.class, args);
        testDomeinHibernate();
    }

    public static void testDomeinHibernate() {
        Luchthaven luchthaven1 = new Luchthaven("123", "luchthaven1", "Hillie", "Holland", 1.0, 1.0);
        Luchthaven luchthaven2 = new Luchthaven("546", "luchthaven2", "Adam", "Holland", 2.0, 2.0);
        Luchthaven luchthaven3 = new Luchthaven("678", "luchthaven3", "Schiedam", "Holland", 3.0, 3.0);

        VliegRoute vliegRoute1 = new VliegRoute(luchthaven1, luchthaven2);
        VliegRoute vliegRoute2 = new VliegRoute(luchthaven2, luchthaven1);
        VliegRoute vliegRoute3 = new VliegRoute(luchthaven2, luchthaven3);
        VliegRoute vliegRoute4 = new VliegRoute(luchthaven3, luchthaven2);
        VliegRoute vliegRoute5 = new VliegRoute(luchthaven3, luchthaven1);
        VliegRoute vliegRoute6 = new VliegRoute(luchthaven1, luchthaven3);

        luchthaven1.addVliegRoute(vliegRoute1);
        luchthaven1.addVliegRoute(vliegRoute2);
        luchthaven2.addVliegRoute(vliegRoute3);
        luchthaven2.addVliegRoute(vliegRoute4);
        luchthaven3.addVliegRoute(vliegRoute5);
        luchthaven3.addVliegRoute(vliegRoute6);

        vmRepositoryStatic.save(luchthaven1);
    }

    @Autowired
    public void setVmRepositoryStatic(VMRepository vmRepository) {
        vmRepositoryStatic = vmRepository;
    }
}
