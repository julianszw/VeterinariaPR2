package tratamientos;

public abstract class Tratamiento {
    private float precio;

    public float getPrecio() {
        return this.precio;
    }

    public abstract float calcularPrecio();
}
