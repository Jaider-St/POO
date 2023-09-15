package Animales;

public class Ave extends Animal {

    private String especie;
//constructor

    public Ave(String nombre, String edad, String tipo_Alimentacion, String especie) {
        super(nombre, edad, tipo_Alimentacion);
        this.especie = especie;
    }
//get and set

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
//metodos

    @Override
    public void sonidoAnimal() {
        System.out.println("Croak");
    }

}
