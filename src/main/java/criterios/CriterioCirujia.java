package criterios;

import modelo.Doctor;
import modelo.Mascota;
import tratamientos.Tratamiento;
import tratamientos.TratamientoIndivual;

public class CriterioCirujia extends Criterio{

    @Override
    public void atender(Mascota mascota) {
        mascota.aplicarTratamiento(new TratamientoIndivual("Cirujía", 1000000));
    }
}
