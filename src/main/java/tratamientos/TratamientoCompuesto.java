package tratamientos;

import java.util.ArrayList;

public class TratamientoCompuesto extends Tratamiento{
    private ArrayList<Tratamiento> tratamientos;

    @Override
    public float calcularPrecio() {
        float precio = 0;
        for (Tratamiento tratamiento : tratamientos) {
            precio += tratamiento.getPrecio();
        }
        return precio;
    }
}
