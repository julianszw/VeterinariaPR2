package criterios;

import modelo.Doctor;
import modelo.Mascota;
import tratamientos.TratamientoIndivual;

public class CriterioInyeccion extends Criterio{
    @Override
    public void atender(Mascota mascota) {
        mascota.aplicarTratamiento(new TratamientoIndivual("Inyección", 50000));
    }
}
