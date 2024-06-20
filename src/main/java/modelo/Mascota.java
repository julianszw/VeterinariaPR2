package modelo;

import estados.Estado;

import java.util.ArrayList;

public class Mascota {
    private String nombre;
    private float peso;
    private boolean estaVacunado;
    private Estado estado;
    private Dueño dueño;
    private ArrayList<Usuario> suscriptores;

    public Mascota(String nombre, float peso, boolean estaVacunado, Estado estado, Dueño dueño) {
        this.nombre = nombre;
        this.peso = peso;
        this.estaVacunado = estaVacunado;
        this.estado = estado;
        this.dueño = dueño;
        suscriptores = new ArrayList<>();
        suscriptores.add(dueño);
    }

    public void comer() {
        Estado nuevoEstado = this.estado.comer();
        if (nuevoEstado != null && nuevoEstado != this.estado) {
            this.estado = nuevoEstado;
            notificarCambioDeEstado();
        }
    }

    public void tomar() {
        Estado nuevoEstado = this.estado.tomar();
        if (nuevoEstado != null && nuevoEstado != this.estado) {
            this.estado = nuevoEstado;
            notificarCambioDeEstado();
        }
    }

    public void suscribir(Usuario usuario) {
        this.suscriptores.add(usuario);
    }

    public void desuscribir(Usuario usuario) {
        this.suscriptores.remove(usuario);
    }

    private void notificarCambioDeEstado() {
        for (Usuario suscriptor:suscriptores) {
            this.enviarEmail(suscriptor);
        }
    }

    private void enviarEmail(Usuario suscriptor) {
        System.out.println("Enviando mail a " + suscriptor.getEmail() + " ...");
        System.out.println("Notificando cambio de estado a " + this.estado.descripcion());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isEstaVacunado() {
        return estaVacunado;
    }

    public void setEstaVacunado(boolean estaVacunado) {
        this.estaVacunado = estaVacunado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }


}
