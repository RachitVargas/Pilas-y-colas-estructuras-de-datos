package cr.ac.ulead.interfaces.implementaciones;

import cr.ac.ulead.interfaces.SerializadorUlead;

public class Mascota implements SerializadorUlead {

    private String nombre;
    private String tipoAnimal;
    private String edad;

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getTipoAnimal() {

        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {

        this.tipoAnimal = tipoAnimal;
    }

    public String getEdad() {

        return edad;
    }

    public void setEdad(String edad) {

        this.edad = edad;
    }

    @Override
    public String SerializarXML() {

        String formato = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>" + "\n" +
                "<mascota>" + "\n" +
                "      <nombre>" + getNombre() + "</nombre>" + "\n" +
                "      <tipoAnimal>" + getTipoAnimal() + "</tipoAnimal>" + "\n" +
                "      <edad>" + getEdad() + "</edad>" + "\n" +
                "</mascota>";

        return formato;
    }

    @Override
    public String SerializarJson() {

        String formato = "{" + "\n" +
                "\"nombre\":" + "\"" + getNombre() + "\"," + "\n" +
                "\"tipo de animal\":" + "\"" + getTipoAnimal() + "\"," + "\n" +
                "\"Edad\":" + getEdad() + "\n" +
                "}";

        return formato;
    }
}
