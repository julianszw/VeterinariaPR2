package modelo;

import tratamientos.Tratamiento;

import java.util.ArrayList;
import java.util.Random;

public class Clinica {
    private String nombre;
    private static ArrayList<Mascota> mascotasInternadas;
    private static ArrayList<Doctor> doctores;
    private static ArrayList<Tratamiento> tratamientos;
    private static Collar collar;

    public Clinica(String nombre) {
        this.nombre = nombre;
        mascotasInternadas = new ArrayList<>();
        doctores = new ArrayList<>();
        tratamientos = new ArrayList<>();
    }

    public void internarMascota(Mascota mascota) {
        this.mascotasInternadas.add(mascota);
        this.atenderMascota(mascota);
    }

    private void atenderMascota(Mascota mascota) {
        Doctor doctor = this.asignarDoctor();
        if (doctor != null) {
            doctor.atenderMascota(mascota);
            mascota.suscribir(doctor);
        }
    }

    private Doctor asignarDoctor() { //manejar nulls
        return doctores.get(new Random().nextInt(doctores.size()));
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

    public String getNombre() {
        return nombre;
    }


    //Métodos para el test
    public static ArrayList<Doctor> getDoctores(){
        return doctores;
    }
    public static ArrayList<Mascota> getMascotasInternadas(){
        return mascotasInternadas;
    }

}
