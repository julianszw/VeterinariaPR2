package criterios;

import modelo.Doctor;
import modelo.Mascota;
import tratamientos.TratamientoIndivual;

public class CriterioMasajes extends Criterio{

    @Override
    public void atender(Mascota mascota) {
        mascota.aplicarTratamiento(new TratamientoIndivual("Masaje", 2000));
    }
}
