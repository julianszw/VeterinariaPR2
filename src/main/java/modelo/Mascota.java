package modelo;

import collares.Collar;
import estados.Estado;

import java.util.ArrayList;

public class Mascota {
    private String nombre;
    private float peso;
    private boolean estaVacunado;
    private Estado estado;
    private Dueño dueño;
    private Collar collar;
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

    public void desuscribir(String dniUsuario) {
        suscriptores.removeIf(usuario -> usuario.getDni().equals(dniUsuario));
    }

    private Usuario buscarUsuarioPorDNI(String dni) {
        Usuario usuarioEncontrado = null;
        int i = 0;
        while (usuarioEncontrado == null && i < suscriptores.size()) {
            if (suscriptores.get(i).getDni().equals(dni)) {
                usuarioEncontrado = suscriptores.get(i);
            }
        }
        return usuarioEncontrado;
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

    public float getPeso() {
        return peso;
    }

    public boolean estaVacunado() {
        return estaVacunado;
    }

    public Estado getEstado() {
        return estado;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void colocarCollar(Collar collar) {
        this.collar = collar;
    }

}
