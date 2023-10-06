package PkgLogica;

public class Automovil extends Vehiculo {

    private int numeroPuertas;

    //constructor
    public Automovil(int numeroPuertas, String marca, String modelo, int año, String propietario, String placa) {
        super(marca, modelo, año, propietario, placa);
        this.numeroPuertas = numeroPuertas;
    }

    //get and set
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    //metodos

    @Override
    public String mostrarInformacion() {
        return "Marca: " + this.getMarca() + "\n"
                + "Modelo: " + this.getModelo() + "\n"
                + "Año: " + this.getAño() + "\n"
                + "Propietario: " + this.getPropietario() + "\n"
                + "Placa: "+this.getPlaca()+"\n"
                + "Numero de puertas: "+this.getNumeroPuertas()
                + "Años circulacion: "+(2023-this.getAño());
    }

}
