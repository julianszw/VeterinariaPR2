package modelo;

import criterios.Criterio;

public class Doctor extends Usuario{
    private Criterio criterio;

    public Doctor(String nombre, String apellido, String dni, String email, String telefono) {
        super(nombre, apellido, dni, email, telefono);
    }

    public void darDeComer(Mascota mascota) {
        mascota.comer();
    }

    public void darDeTomar(Mascota mascota) {
        mascota.tomar();
    }

    public void darMedicina(Mascota mascota) {
        mascota.recibirMedicina();
    }

    public void atenderMascota(Mascota mascota) {
        this.criterio.atender(mascota);
        this.colocarCollar(mascota);
    }

    private void colocarCollar(Mascota mascota) {
        mascota.colocarCollar(Clinica.getCollarDelDia());
    }

    private void modificarCriterio(Criterio criterio) {
        this.criterio = criterio;
    }
}
