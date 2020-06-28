package cr.ac.ulead.tda.puntoA;

import cr.ac.ulead.interfaces.implementaciones.Persona;

public class StackPuntoA {

    Persona[] data;
    int indice = 0;

    public StackPuntoA(int tam) {
        data = new Persona[tam];

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
            throw new Exception("¡Lo sentimos, pila llena!");
        } else {
            data[indice] = newValue;
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

}
