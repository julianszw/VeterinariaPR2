package clases.estados;

public class EstadoSediento extends Estado {
    @Override
    public Estado comer() {
        return null;
    }

    @Override
    public Estado tomar() {
        return new EstadoFeliz();
    }

    @Override
    public String descripcion() {
        return "Sediento";
    }

}
