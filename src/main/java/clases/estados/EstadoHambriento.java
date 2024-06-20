package clases.estados;

public class EstadoHambriento extends Estado {
    @Override
    public Estado comer() {
        return new EstadoFeliz();
    }

    @Override
    public Estado tomar() {
        return null;
    }

    @Override
    public String descripcion() {
        return "Hambriento";
    }

}
