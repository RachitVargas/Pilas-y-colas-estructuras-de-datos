package cr.ac.ulead.logica;

import cr.ac.ulead.interfaces.implementaciones.Mascota;
import cr.ac.ulead.interfaces.implementaciones.Persona;

public class GestorDatos {

    public void dataPersona(String[] dataPersona, Persona persona){

        persona.setNombre(dataPersona[0]);
        persona.setApellido(dataPersona[1]);
        persona.setFecha(dataPersona[2]);
        persona.setPeso(dataPersona[3]);
        persona.setEstatura(dataPersona[4]);

    }

    public void dataMascota(String[] dataMascota, Mascota mascota){

        mascota.setNombre(dataMascota[0]);
        mascota.setTipoAnimal(dataMascota[1]);
        mascota.setEdad(dataMascota[2]);

    }

}

