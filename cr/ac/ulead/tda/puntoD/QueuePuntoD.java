package cr.ac.ulead.tda.puntoD;

import cr.ac.ulead.interfaces.SerializadorUlead;

public class QueuePuntoD {

    SerializadorUlead[] data;
    int head = 0;
    int tail = 0;
    int max = 0;

    public QueuePuntoD(int tam) {
        max = tam;
        data = new SerializadorUlead[tam];
    }

    public void enqueue(SerializadorUlead newValue) {

        if (tail == max) {
            System.out.println("¡Lo sentimos, Cola llena!");

        } else {

            int posicion = (head + tail) % max;
            this.data[posicion] = newValue;
            this.tail++;
        }
    }

    public SerializadorUlead dequeue() {

        SerializadorUlead valor = data[head];
        data[head] = null;
        head = (head + 1) % max;

        if (tail != 0) {
            tail--;
        }

        return valor;
    }

}
