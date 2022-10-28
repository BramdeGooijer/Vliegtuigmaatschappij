package vliegtuigmaatschappij.data;

import org.springframework.data.jpa.repository.JpaRepository;
import vliegtuigmaatschappij.domain.Vlucht;

public interface VMRepository extends JpaRepository<Vlucht, Long> {

}
