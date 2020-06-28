package cr.ac.ulead.tda.puntoB;
import cr.ac.ulead.tda.LogicGeneral;
import cr.ac.ulead.tda.capaPresentacion;
public class MainPuntoB {

    public static void main(String[] args) throws Exception {

        capaPresentacion capa = new capaPresentacion();
        LogicGeneral logic = new LogicGeneral();

        int option = 0;

        do {

            option = capa.showMenuPuntoB();
            logic.ejecutarOptionB(option);

        } while (option != 4);
    }
}
