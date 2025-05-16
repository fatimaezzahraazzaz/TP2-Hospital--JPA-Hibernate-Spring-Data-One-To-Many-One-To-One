package ma.FS.hospital.repositories;

import ma.FS.hospital.entities.Medecin;
import ma.FS.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    Medecin findByNom(String nom);

}
