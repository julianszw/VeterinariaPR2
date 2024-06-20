package clases.modelo;

import collares.Collar;

import java.util.ArrayList;

public class Clinica {
    private ArrayList<Mascota> mascotasInternadas;
    private ArrayList<Doctor> doctores;
    private static Collar collar;

    public Clinica() {
        mascotasInternadas = new ArrayList<>();

    }

    public void internarMascota(Mascota mascota) {
        this.mascotasInternadas.add(mascota);
    }

    public void agregarDoctor(Doctor doctor) {
        this.doctores.add(doctor);
    }

    public static Collar getCollarDelDia() {
        return collar;
    }

    public void cambiarCollaDelDia(Collar collar){
        this.collar = collar;
    }

}
