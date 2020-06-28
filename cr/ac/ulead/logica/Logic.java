package cr.ac.ulead.logica;

import cr.ac.ulead.interfaces.implementaciones.Mascota;
import cr.ac.ulead.interfaces.implementaciones.Persona;
import cr.ac.ulead.presentacion.Presentation;


public class Logic {

    Presentation presentation;
    Persona persona;
    Mascota mascota;
    GestorDatos gestor;


    public Logic() {

        this.presentation = new Presentation();
        this.persona = new Persona();
        this.mascota = new Mascota();
        this.gestor = new GestorDatos();


    }

    public void ejecutarOpcion(int option) {

        String dataPersona[];
        String dataMascota[];
        String formato;

        switch (option) {

            case 1:

                dataPersona = presentation.dataPersona();
                gestor.dataPersona(dataPersona, this.persona);
                formato = this.persona.SerializarXML();
                presentation.printFormato(formato);

                break;

            case 2:

                dataPersona = presentation.dataPersona();
                gestor.dataPersona(dataPersona, this.persona);
                formato = this.persona.SerializarJson();
                presentation.printFormato(formato);

                break;

            case 3:


                dataMascota = presentation.dataMascota();
                gestor.dataMascota(dataMascota, mascota);
                formato = this.mascota.SerializarXML();
                presentation.printFormato(formato);

                break;

            case 4:

                dataMascota = presentation.dataMascota();
                gestor.dataMascota(dataMascota, mascota);
                formato = this.mascota.SerializarJson();
                presentation.printFormato(formato);

                break;

            case 5:

                presentation.mensaje();
                break;

            default:

                presentation.error();

        }

    }

}