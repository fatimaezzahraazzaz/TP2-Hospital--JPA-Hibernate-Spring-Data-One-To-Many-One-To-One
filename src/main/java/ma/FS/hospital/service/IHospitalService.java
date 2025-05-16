package ma.FS.hospital.service;

import ma.FS.hospital.entities.Consultation;
import ma.FS.hospital.entities.Medecin;
import ma.FS.hospital.entities.Patient;
import ma.FS.hospital.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV (RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
