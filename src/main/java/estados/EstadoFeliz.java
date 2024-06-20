package estados;

public class EstadoFeliz extends Estado {
    @Override
    public Estado comer() {
        return new EstadoEnfermo();
    }

    @Override
    public Estado tomar() {
        return null;
    }

    @Override
    public String descripcion() {
        return "Feliz";
    }

}
