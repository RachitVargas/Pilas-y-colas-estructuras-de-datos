package cr.ac.ulead.tda.puntoA;
import cr.ac.ulead.tda.LogicGeneral;
import cr.ac.ulead.tda.capaPresentacion;

public class MainPuntoA {

    public static void main(String[] args) throws Exception {

        capaPresentacion capa = new capaPresentacion();
        LogicGeneral logic = new LogicGeneral();


        int option = 0;


        do {

            option = capa.showMenu();
            logic.ejecutarOptionA(option);

        } while (option != 3);
    }
}
