package PkgLogica;

public class Motocicleta extends Vehiculo{

    private double cilindrada;

    //constructor
    public Motocicleta(double cilindrada, String marca, String modelo, int año, String propietario, String placa) {
        super(marca, modelo, año, propietario, placa);
        this.cilindrada = cilindrada;
    }
    //get and set

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    //metodos

    @Override
    public String mostrarInformacion() {
        return "Marca: " + this.getMarca() + "\n"
                + "Modelo: " + this.getModelo() + "\n"
                + "Año: " + this.getAño() + "\n"
                + "Propietario: " + this.getPropietario() + "\n"
                + "Cilindrada: "+this.getCilindrada()
                + "Placa: "+this.getPlaca()+"\n"
                + "Años circulacion: "+(2023-this.getAño());
    }
}
