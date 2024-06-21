package tests;

import modelo.Clinica;
import modelo.Doctor;
import modelo.Dueño;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Doctor> doctores = GeneradorUsuarios.generarDoctores();
        ArrayList<Dueño> dueños = GeneradorUsuarios.generarDueños();
        Clinica clinica = GeneradorUsuarios.generarClinica("Cuidamos Tu Mascota", doctores);
    }





}
