package tratamientos;

public class TratamientoIndivual extends Tratamiento{

    @Override
    public float calcularPrecio() {
        return super.getPrecio();
    }
}
