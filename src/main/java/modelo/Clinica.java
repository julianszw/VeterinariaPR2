package modelo;

import tratamientos.Tratamiento;

import java.util.ArrayList;

public class Clinica {
    private static ArrayList<Mascota> mascotasInternadas;
    private static ArrayList<Doctor> doctores;
    private static ArrayList<Tratamiento> tratamientos;
    private static Collar collar;

    public Clinica() {
        mascotasInternadas = new ArrayList<>();
        doctores = new ArrayList<>();
        tratamientos = new ArrayList<>();
    }

    public void internarMascota(Mascota mascota) {
        this.mascotasInternadas.add(mascota);
    }

    public void agregarDoctor(Doctor doctor) {
        this.doctores.add(doctor);
    }

    public void suscribirDoctor(Mascota mascota, Doctor doctor) {
        mascota.suscribir(doctor);
    }

    public static Collar getCollarDelDia() {
        return collar;
    }

    public void cambiarCollaDelDia(Collar collar){
        this.collar = collar;
    }

}
