package tratamientos;

public class TratamientoIndivual extends Tratamiento{

    public TratamientoIndivual(String nombre, float precio) {
        super(nombre, precio);
    }

    @Override
    public float calcularPrecio() {
        return super.getPrecio();
    }
}
