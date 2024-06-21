package modelo;

import criterios.Criterio;

public class Doctor extends Usuario{
    private Criterio criterio;

    public Doctor(String nombre, String apellido, String dni, String email, String telefono) {
        super(nombre, apellido, dni, email, telefono);
    }

    public void darDeComer() {

    }

    public void darDeTomar() {

    }

    public void darMedicina() {

    }

    public void atenderMascota(Mascota mascota) {
        this.criterio.atender(mascota, this);
        this.colocarCollar(mascota);
    }

    private void colocarCollar(Mascota mascota) {
        mascota.colocarCollar(Clinica.getCollarDelDia());
    }
}
