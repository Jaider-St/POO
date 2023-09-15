package Animales;

abstract public class Animal {

    private String nombre;
    private String edad;
    private String tipo_Alimentacion;
//constructor

    public Animal(String nombre, String edad, String tipo_Alimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo_Alimentacion = tipo_Alimentacion;
    }
//get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
//metodos
    public abstract void sonidoAnimal();
    
}
