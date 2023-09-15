package Animales;

public class Gato extends Animal {

    private String raza;
//constructor

    public Gato(String nombre, String edad, String tipo_Alimentacion, String raza) {
        super(nombre, edad, tipo_Alimentacion);
        this.raza = raza;
    }
//get and set

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
//metodos

    @Override
    public void sonidoAnimal() {
        System.out.println("Miau");
    }
    
    
}
