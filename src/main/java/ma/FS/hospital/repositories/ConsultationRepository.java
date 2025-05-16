package ma.FS.hospital.repositories;

import ma.FS.hospital.entities.Consultation;
import ma.FS.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
