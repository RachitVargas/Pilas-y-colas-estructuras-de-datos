package cr.ac.ulead.tda.puntoD;
import cr.ac.ulead.tda.LogicGeneral;
import cr.ac.ulead.tda.capaPresentacion;

public class MainPuntoD {

    public static void main(String[] args) {

        capaPresentacion capa = new capaPresentacion();
        LogicGeneral logic = new LogicGeneral();

        int opcion = 0;

        do {

            opcion = capa.showMenuPuntoD();
            logic.ejecutarOpcionD(opcion);

        } while (opcion != 3);

    }
}
