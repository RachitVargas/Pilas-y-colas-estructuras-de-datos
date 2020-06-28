package cr.ac.ulead.tda.puntoC;

import cr.ac.ulead.interfaces.implementaciones.Mascota;

public class QueuePuntoC {

    Mascota[] data;
    int head = 0;
    int tail = 0;
    int max = 0;

    public QueuePuntoC(int tam) {
        max = tam;
        data = new Mascota[tam];
    }

    public void enqueue(Mascota newValue) {

        if (tail == max) {
            System.out.println("¡Lo sentimos, Cola llena!");

        } else {

            int posicion = (head + tail) % max;
            this.data[posicion] = newValue;
            this.tail++;
        }
    }

    public Mascota dequeue() {

        Mascota dato = (data[head]);
        data[head] = null;
        head = (head + 1) % max;

        if (tail != 0) {
            tail--;

        }

        return dato;
    }
}
