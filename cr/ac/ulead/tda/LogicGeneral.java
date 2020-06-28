package cr.ac.ulead.tda;

import cr.ac.ulead.interfaces.SerializadorUlead;
import cr.ac.ulead.interfaces.implementaciones.Mascota;
import cr.ac.ulead.interfaces.implementaciones.Persona;
import cr.ac.ulead.tda.puntoA.StackPuntoA;
import cr.ac.ulead.tda.puntoB.StackPuntoB;
import cr.ac.ulead.tda.puntoC.QueuePuntoC;
import cr.ac.ulead.tda.puntoD.QueuePuntoD;

public class LogicGeneral {

    capaPresentacion capa;
    StackPuntoA stack;
    Persona persona;
    StackPuntoB stackB;
    QueuePuntoC queueC;
    Mascota mascota;
    QueuePuntoD queueD;

    public LogicGeneral() {

        this.capa = new capaPresentacion();
        this.stack = new StackPuntoA(50);
        this.persona = new Persona();
        this.stackB = new StackPuntoB(50);
        queueC = new QueuePuntoC(50);
        mascota = new Mascota();
        this.queueD = new QueuePuntoD(50);
    }


    public void ejecutarOptionA(int option) throws Exception {


        switch (option) {

            case 1:

                Persona crearPersona = capa.obtenerData();
                stack.push(crearPersona);

                break;

            case 2:

                capa.mostrarPush(stack);

                break;

            case 3:

                capa.printMensaje();

                break;

            default:

                capa.error();

        }
    }

    public void ejecutarOptionB(int option) throws Exception {


        switch (option) {

            case 1:

                Persona crearPersona = capa.obtenerData();
                stackB.push(crearPersona);

                break;

            case 2:

                capa.mostrarPopPuntoB(stackB);

                break;

            case 3:

                capa.mostrarAltura(stackB.menorAltura());


                break;

            case 4:

                capa.printMensaje();

                break;

            default:

                capa.error();
        }
    }

    public void ejecutarOpcionC(int option) {

        switch (option) {

            case 1:

                Mascota crearMascota = capa.obtenerDataMascota();
                queueC.enqueue(crearMascota);

                break;

            case 2:

                Mascota dato = queueC.dequeue();
                capa.mostrarDequeuePuntoC(dato);

                break;

            case 3:

                capa.printMensaje();

                break;

            default:

                capa.error();
        }
    }

    public void ejecutarOpcionD(int opcion) {

        int eleccion = 0;

        switch (opcion) {

            case 1:

                eleccion = capa.mascotaOPersona();

                if (eleccion == 1) {

                    SerializadorUlead crearPersona = capa.obtenerData();
                    queueD.enqueue(crearPersona);


                } else if (eleccion == 2) {

                    SerializadorUlead crearMascota = capa.obtenerDataMascota();
                    queueD.enqueue(crearMascota);

                } else {

                    capa.error();
                }

                break;

            case 2:

                SerializadorUlead dato = queueD.dequeue();
                capa.mostrarDequeuePuntoD(dato);

                break;

            case 3:

                capa.printMensaje();

                break;

            default:

                capa.error();
        }
    }
}