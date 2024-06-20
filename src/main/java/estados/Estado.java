package estados;

public abstract class Estado {
    public abstract Estado comer();
    public abstract Estado tomar();
    public abstract Estado recibirMedicina();
    public abstract String descripcion();
}
