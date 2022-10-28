package vliegtuigmaatschappij;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vliegtuigmaatschappij.data.VMRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@SpringBootApplication
public class VMApplication {
    public static VMRepository vmRepositoryStatic;

    public static void main(String[] args) {
        SpringApplication.run(VMApplication.class, args);
    }

    @Autowired
    public void setVmRepositoryStatic(VMRepository vmRepository) {
        vmRepositoryStatic = vmRepository;
    }
}
