package ma.FS.hospital.repositories;

import ma.FS.hospital.entities.Patient;
import ma.FS.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous, String> {
}
