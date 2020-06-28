package cr.ac.ulead.interfaces.implementaciones;

import cr.ac.ulead.interfaces.SerializadorUlead;

public class Persona implements SerializadorUlead {

    private String nombre;
    private String apellido;
    private String fecha;
    private String peso;
    private String estatura;

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public String getFecha() {

        return fecha;
    }

    public void setFecha(String fecha) {

        this.fecha = fecha;
    }

    public String getPeso() {

        return peso;
    }

    public void setPeso(String peso) {

        this.peso = peso;
    }

    public String getEstatura() {

        return estatura;
    }

    public void setEstatura(String estatura) {

        this.estatura = estatura;
    }

    @Override
    public String SerializarXML() {

        String formato = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>" + "\n" +
                "<persona>" + "\n" +
                "      <nombre>" + getNombre() + "</nombre>" + "\n" +
                "      <apellido>" + getApellido() + "</apellido>" + "\n" +
                "      <fechaDeNacimiento>" + getFecha() + "</fechaDeNacimiento>" + "\n" +
                "      <peso>" + getPeso() + "</peso>" + "\n" +
                "      <estatura>" + getEstatura() + "</estatura>" + "\n" +
                "</persona>";


        return formato;
    }

    @Override
    public String SerializarJson() {

        String formato = "{" + "\n" +
                "\"nombre\":" + "\"" + getNombre() + "\"," + "\n" +
                "\"apellido\":" + "\"" + getApellido() + "\"," + "\n" +
                "\"fecha de nacimiento\":" + getFecha() + "," + "\n" +
                "\"peso\":" + getPeso() + "," + "\n" +
                "\"estatura\":" + getEstatura() + "\n" +
                "}";

        return formato;
    }
}
