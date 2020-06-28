package cr.ac.ulead.ejecutables;

import cr.ac.ulead.logica.Logic;
import cr.ac.ulead.presentacion.Presentation;

public class Main {


    public static void main(String[] args) {

        Logic logic = new Logic();
        Presentation presentacion = new Presentation();
        int option = 0;

        do {

            option = presentacion.mostrarMenu();
            logic.ejecutarOpcion(option);

        } while (option != 5);

    }
}
