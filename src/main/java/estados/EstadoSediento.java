package estados;

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
    public Estado recibirMedicina() {
        return null;
    }

    @Override
    public String descripcion() {
        return "Sediento";
    }

}
