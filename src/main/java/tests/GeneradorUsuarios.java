package tests;

import modelo.Clinica;
import modelo.Doctor;
import modelo.Dueño;

import java.util.ArrayList;

public class GeneradorUsuarios {
    public static Clinica generarClinica(String nombreClinica, ArrayList<Doctor> doctores) {
        Clinica clinica = new Clinica(nombreClinica);
        for (Doctor doctor: doctores) {
            clinica.agregarDoctor(doctor);
        }
        return clinica;
    }

    public static ArrayList<Doctor> generarDoctores() {
        ArrayList<Doctor> doctores = new ArrayList<>();
        doctores.add(new Doctor("Juan", "González", "12345678A", "juan.gonzalez@example.com", "555-1234"));
        doctores.add(new Doctor("María", "Martínez", "23456789B", "maria.martinez@example.com", "555-5678"));
        doctores.add(new Doctor("Carlos", "López", "34567890C", "carlos.lopez@example.com", "555-9876"));
        doctores.add(new Doctor("Ana", "Sánchez", "45678901D", "ana.sanchez@example.com", "555-4321"));
        doctores.add(new Doctor("Pedro", "Rodríguez", "56789012E", "pedro.rodriguez@example.com", "555-8765"));
        doctores.add(new Doctor("Laura", "García", "67890123F", "laura.garcia@example.com", "555-2109"));
        doctores.add(new Doctor("José", "Fernández", "78901234G", "jose.fernandez@example.com", "555-6543"));
        doctores.add(new Doctor("Sofía", "Díaz", "89012345H", "sofia.diaz@example.com", "555-1098"));
        doctores.add(new Doctor("Manuel", "Pérez", "90123456I", "manuel.perez@example.com", "555-5432"));
        doctores.add(new Doctor("Elena", "Ruiz", "01234567J", "elena.ruiz@example.com", "555-9870"));
        return doctores;
    }

    public static ArrayList<Dueño> generarDueños() {
        ArrayList<Dueño> dueños = new ArrayList<>();
        dueños.add(new Dueño("Gabriel", "García", "11111111A", "gabriel.garcia@example.com", "555-1111"));
        dueños.add(new Dueño("Marina", "López", "22222222B", "marina.lopez@example.com", "555-2222"));
        dueños.add(new Dueño("Lucas", "Gómez", "33333333C", "lucas.gomez@example.com", "555-3333"));
        dueños.add(new Dueño("Valeria", "Martín", "44444444D", "valeria.martin@example.com", "555-4444"));
        dueños.add(new Dueño("Matías", "Fernández", "55555555E", "matias.fernandez@example.com", "555-5555"));
        dueños.add(new Dueño("Agustina", "Sánchez", "66666666F", "agustina.sanchez@example.com", "555-6666"));
        dueños.add(new Dueño("Federico", "Fernández", "77777777G", "federico.fernandez@example.com", "555-7777"));
        dueños.add(new Dueño("Julieta", "Díaz", "88888888H", "julieta.diaz@example.com", "555-8888"));
        dueños.add(new Dueño("Martín", "Rodríguez", "99999999I", "martin.rodriguez@example.com", "555-9999"));
        dueños.add(new Dueño("Camila", "Ruiz", "00000000J", "camila.ruiz@example.com", "555-0000"));
        return dueños;
    }
}
