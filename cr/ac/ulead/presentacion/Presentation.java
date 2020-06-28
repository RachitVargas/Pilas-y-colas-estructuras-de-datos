package cr.ac.ulead.presentacion;

import cr.ac.ulead.interfaces.implementaciones.Mascota;

import java.io.PrintStream;
import java.util.Scanner;

public class Presentation {

    private Scanner input = new Scanner(System.in);
    private PrintStream output = new PrintStream(System.out);

    public int mostrarMenu() {

        output.println("¡Bienvenido al serializador!");
        output.println("¿En que formato desea serializar su datos persona o mascota?");
        output.println("1. Formato XML - Persona\n2. Formato Json - Persona");
        output.println("3. Formato XML - Mascota\n4. Formato Json - Mascota\n5. Salir");
        String opcion = input.nextLine();
        int opcionToInteger = Integer.parseInt(opcion);

        return opcionToInteger;
    }

    public String[] dataPersona() {

        output.println("Ingrese el nombre de la persona");
        String nombre = input.nextLine();
        output.println("Ingrese el apellido de la persona");
        String apellido = input.nextLine();
        output.println("Ingrese la fecha de nacimiento de la persona");
        String fecha = input.nextLine();
        output.println("Ingrese el peso de la persona");
        String peso = input.nextLine();
        output.println("Ingrese la estatura de la persona");
        String estatura = input.nextLine();
        String data [] = {nombre,apellido,fecha,peso,estatura};

        return data;
    }

    public String[] dataMascota() {


        output.println("Ingrese el nombre del animal");
        String nombre = input.nextLine();
        output.println("Ingrese el tipo de animal");
        String tipoAnimal = input.nextLine();
        output.println("Ingrese la edad del animal");
        String edad = input.nextLine();

        String data [] = {nombre,tipoAnimal,edad};

        return data;
    }

    public void mensaje() {

        output.println("¡Muchas gracias!");

    }

    public void error() {

        output.println("¡Lo sentimos, ha ocurrido un error!");

    }

    public void printFormato(String formato) {

        output.println(formato);

    }
}
