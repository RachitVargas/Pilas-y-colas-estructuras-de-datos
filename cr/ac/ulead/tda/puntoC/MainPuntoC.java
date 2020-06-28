package cr.ac.ulead.tda.puntoC;
import cr.ac.ulead.tda.LogicGeneral;
import cr.ac.ulead.tda.capaPresentacion;

public class MainPuntoC {

    public static void main(String args[]) {

        capaPresentacion capa = new capaPresentacion();
        LogicGeneral logic = new LogicGeneral();

        int option = 0;

        do {

            option = capa.showMenuMascota();
            logic.ejecutarOpcionC(option);

        } while (option != 3);
    }
}
