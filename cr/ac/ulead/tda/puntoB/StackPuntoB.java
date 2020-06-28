package cr.ac.ulead.tda.puntoB;

import cr.ac.ulead.interfaces.implementaciones.Persona;

public class StackPuntoB {

    Persona[] data;
    int indice = 0;
    double menorAltura[];
    int i = -1;

    public StackPuntoB(int tam) {
        data = new Persona[tam];
        this.menorAltura = new double[tam];

    }

    public boolean isFull() {
        if (this.indice == 50) {
            return true;
        }
        return false;
    }


    public boolean isEmpty() {
        if (this.indice == 0) {
            return true;
        }
        return false;
    }

    public void push(Persona newValue) throws Exception {

        if (isFull()) {

            throw new Exception("Lo sentimos, pila llena!");

        } else {

            data[indice] = newValue;

            if (isEmpty()) {
                menorAltura[indice] = (Double.parseDouble(newValue.getEstatura()));
            } else {
                if (menorAltura[i] < Double.parseDouble(newValue.getEstatura())) {
                    menorAltura[indice] = menorAltura[i];
                } else {
                    menorAltura[indice] = Double.parseDouble(newValue.getEstatura());
                }
            }

            i++;
            indice++;

        }
    }

    public Persona pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("¡Lo sentimos, pila vacia!");
        } else {
            indice = indice - 1;
            return data[indice];
        }
    }


    public double menorAltura() throws Exception {

        if (isEmpty()) {
            throw new Exception("¡Lo sentimos, pila vacia!");

        } else {
            return menorAltura[indice - 1];
        }
    }
}