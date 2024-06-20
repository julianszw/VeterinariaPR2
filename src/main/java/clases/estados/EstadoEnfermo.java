package clases.estados;

public class EstadoEnfermo extends Estado {
    @Override
    public Estado comer() {
        return null;
    }

    @Override
    public Estado tomar() {
        return null;

    }

    @Override
    public String descripcion() {
        return "Enfermo";
    }

    public Estado recibirMedicina() {
        return new EstadoFeliz();
    }
}
