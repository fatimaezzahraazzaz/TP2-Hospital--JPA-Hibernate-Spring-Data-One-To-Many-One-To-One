package ma.FS.hospital;

import ma.FS.hospital.entities.*;
import ma.FS.hospital.repositories.MedecinRepository;
import ma.FS.hospital.repositories.PatientRepository;
import ma.FS.hospital.repositories.RendezVousRepository;
import ma.FS.hospital.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}
	@Bean
	CommandLineRunner stat(IHospitalService hospitalService ,
						   PatientRepository patientRepository,
						   MedecinRepository medecinRepository,
						   RendezVousRepository rendezVousRepository
	) {
		return args -> {

			Stream.of("Mohemed","malak","Najat")
					.forEach(name->{
						Patient patient = new Patient();
						patient.setNom(name);
						patient.setDateNaissance(new Date());
						patient.setMalade(false);
						hospitalService.savePatient(patient);
					});

			Stream.of("Ghali","Yassire","Aya")
					.forEach(name->{
						Medecin medecin = new Medecin();
						medecin.setNom(name);
						medecin.setEmail(name+"@gmail.com");
						medecin.setSpecialite(Math.random()>0.5 ?"Cardio":"Dentiste");
						hospitalService.saveMedecin(medecin);
					});
			Patient patient = patientRepository.findById(1L).orElse(null);
			Patient patient2 = patientRepository.findByNom("Mohamed");
			Medecin medecin = medecinRepository.findByNom("Ghali");

			RendezVous rendezVous=new RendezVous();
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatutsRV.PENDING);
			rendezVous.setMedecin(medecin);
			rendezVous.setPatient(patient);
			hospitalService.saveRDV(rendezVous);
			RendezVous savedRDV = rendezVousRepository.save(rendezVous);
			System.out.println(savedRDV.getId());

			RendezVous rendezVous1 = rendezVousRepository.findAll().get(0);

			Consultation consultation=new Consultation();
			consultation.setDateConsultation(rendezVous1.getDate());
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("Rapport de la consultation ....");
			hospitalService.saveConsultation(consultation);
		};
	}

}
