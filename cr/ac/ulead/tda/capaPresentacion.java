package cr.ac.ulead.tda;

import cr.ac.ulead.interfaces.SerializadorUlead;
import cr.ac.ulead.interfaces.implementaciones.Mascota;
import cr.ac.ulead.interfaces.implementaciones.Persona;
import cr.ac.ulead.tda.puntoA.StackPuntoA;
import cr.ac.ulead.tda.puntoB.StackPuntoB;

import java.io.PrintStream;
import java.util.Scanner;

public class capaPresentacion {

    private Scanner input;
    private PrintStream output;

    public capaPresentacion() {
        input = new Scanner(System.in);
        output = new PrintStream(System.out);
    }


    public int showMenu() {


        output.println("Bienvenido a la pila");
        output.println("1. Meter persona");
        output.println("2. Sacar persona");
        output.println("3. Salir");
        output.println("Elija una opción!");
        String opcion1 = input.nextLine();
        int opcion = Integer.parseInt(opcion1);

        return opcion;
    }

    public void printMensaje() {

        System.out.println("¡Muchas gracias!");
    }

    public void error() {

        System.out.println("Lo sentimos, ¡ha ocurrido un error!");
    }

    public Persona obtenerData() {

        Persona persona = new Persona();

        output.println("Ingrese el nombre de la persona");
        persona.setNombre(input.nextLine());
        output.println("Ingrese el apellido de la persona");
        persona.setApellido(input.nextLine());
        output.println("Ingrese la fecha de nacimiento de la persona");
        persona.setFecha(input.nextLine());
        output.println("Ingrese el peso de la persona");
        persona.setPeso(input.nextLine());
        output.println("Ingrese la estatura de la persona");
        persona.setEstatura(input.nextLine());


        return persona;
    }

    public void mostrarPush(StackPuntoA stack) throws Exception {

        try {

            int opcion = xmlOJson();
            if (opcion == 1) {
                output.println(stack.pop().SerializarXML());
            } else if (opcion == 2) {
                output.println(stack.pop().SerializarJson());
            } else {
                error();

            }

        } catch (Exception e) {
            error();

        }

    }


    public int showMenuMascota() {

        int option = 0;

        output.println("¡Bienvenido!");
        output.println("1. Meter mascota");
        output.println("2. Sacar mascota");
        output.println("3. Salir");
        output.println("Elije una opción");
        String option1 = input.nextLine();
        option = Integer.parseInt(option1);

        return option;
    }

    public Mascota obtenerDataMascota() {

        Mascota mascota = new Mascota();

        output.println("Ingrese el nombre del animal");
        mascota.setNombre(input.nextLine());
        output.println("Ingrese el tipo de animal");
        mascota.setTipoAnimal(input.nextLine());
        output.println("Ingrese la edad del animal");
        mascota.setEdad(input.nextLine());

        return mascota;
    }

    public void mostrarDequeuePuntoD(SerializadorUlead queue) {

        if (queue == null) {

            output.println("¡No hay datos en la cola!");

        } else {

            int opcion = xmlOJson();
            if (opcion == 1) {
                output.println(queue.SerializarXML());
            } else if (opcion == 2) {
                output.println(queue.SerializarJson());
            } else {
                error();
            }

        }
    }

    public int showMenuPuntoD() {

        output.println("¡Bienvenido!");
        output.println("1. Meter objeto serializador");
        output.println("2. Sacar objeto serializador");
        output.println("3. Salir");
        output.println("Elija una opción");
        String opcion1 = input.nextLine();
        int opcion = Integer.parseInt(opcion1);

        return opcion;

    }

    public int mascotaOPersona() {

        output.println("¿Qué desea ingresar, Persona o Mascota?");
        output.println("1. Persona");
        output.println("2. Mascota");
        String eleccionString = input.nextLine();
        int eleccion = Integer.parseInt(eleccionString);


        return eleccion;
    }

    public int xmlOJson() {

        output.println("¿En qué formato desea imprimir sus datos?");
        output.println("1. Formato XML");
        output.println("2. Formato Json");
        String eleccionString = input.nextLine();
        int eleccion = Integer.parseInt(eleccionString);

        return eleccion;
    }

    public int showMenuPuntoB() {

        output.println("Bienvenido a la pila");
        output.println("1. Meter persona");
        output.println("2. Sacar persona");
        output.println("3. Menor altura");
        output.println("4. Salir");
        output.println("Elija una opción!");
        String opcion1 = input.nextLine();
        int opcion = Integer.parseInt(opcion1);

        return opcion;

    }

    public void mostrarPopPuntoB(StackPuntoB stack) {

        try {

            int opcion = xmlOJson();
            if (opcion == 1) {
                output.println(stack.pop().SerializarXML());
            } else if (opcion == 2) {
                output.println(stack.pop().SerializarJson());
            } else {
                error();
            }

        } catch (Exception e) {

            error();

        }

    }

    public void mostrarDequeuePuntoC(Mascota valor) {

        if (valor == null) {
            output.println("¡No hay datos en la cola!");
        } else {
            int opcion = xmlOJson();
            if (opcion == 1) {
                output.println(valor.SerializarXML());
            } else if (opcion == 2) {
                output.println(valor.SerializarJson());
            } else {
                error();
            }

        }
    }

    public void mostrarAltura(double menorAltura) throws Exception {

        try {

            output.println("La menor altura presente en la pila es: " + menorAltura);

        } catch (Exception e) {

            error();
        }

    }

}

