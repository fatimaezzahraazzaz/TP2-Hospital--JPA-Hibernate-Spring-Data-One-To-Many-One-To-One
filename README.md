 Rapport du Projet : TP2-Hospital--JPA-Hibernate-Spring-Data-One-To-Many-One-To-One

---

## 📌 Objectif du projet
Ce projet a pour but de mettre en œuvre les relations One-To-Many et One-To-One en utilisant Spring Boot, Spring Data JPA, et Hibernate pour modéliser un système de gestion hospitalière comprenant :

Les patients

Les médecins

Les rendez-vous

Les consultations

---

🛠️ Technologies utilisées
Java 17+
Spring Boot
Spring Data JPA
Hibernate
Base de données H2
Lombok
Maven
IntelliJ IDEA
---

## 🔗 Relations entre entités
Patient ↔ RendezVous : One-To-Many

Medecin ↔ RendezVous : One-To-Many

RendezVous ↔ Consultation : One-To-One

----
## 4 Exécution du projet
Lancer h2 la bd  "hospital" avec le port 8086 Voici une capture de l'exécution H2 :
Table medecin :
![Capture d'écran 2025-05-17 000423](https://github.com/user-attachments/assets/29a68ee0-6121-4fa5-bab8-e78935b23edb)
Table Patient :
![Capture d'écran 2025-05-17 000423](https://github.com/user-attachments/assets/12bb37ef-7f30-4a4b-80b9-6767f69ef09a)
Table rendezVous :
![image](https://github.com/user-attachments/assets/01851c29-23d5-4d90-8d7b-826662731350)
Table Consultation :
![image](https://github.com/user-attachments/assets/08946457-ba7b-4440-bbf4-92c40c3a4d35)

----
## ✅ Résultats
Création automatique des tables en base
Mapping réussi des relations
utilisation de H2
Logique métier isolée dans le service

---
## 📌 Conclusion
Ce projet démontre la puissance de Spring Data JPA pour gérer les relations One-To-Many et One-To-One de façon élégante et performante. Il offre une base solide pour bâtir des applications complètes avec une logique métier claire, une séparation des couches, et une intégration facile à une base de données relationnelle.

Ce TP a permis de mieux comprendre :

L'utilisation des annotations JPA (@OneToMany, @OneToOne, @ManyToOne)

L'injection de dépendances Spring

La transition entre base mémoire et base persistante

---## 📎 Auteur
Nom : Fatima Ezzahra Azzaz Master SDIA -FS meknès
