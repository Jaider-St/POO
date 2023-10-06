package PkgPresentacion;

import PkgLogica.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner caracteres = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);

        Vehiculo[] objVehiculo = new Vehiculo[10];
        objVehiculo[0] = new Automovil(2, "Honda", "no se de modelos 1", 2004, "Jose", "ASK12");
        objVehiculo[1] = new Automovil(4, "Ferrary", "todavia no se de modelos", 2000, "mary", "ASD23");
        objVehiculo[2] = new Motocicleta(220, "Yamaha", "alguna", 2010, "Mathias", "MNH33");
        objVehiculo[3] = new Motocicleta(150, "Susuky", "ni idea", 2001, "Anthonio", "ALK65");

        System.out.println("Informacion de los Vehiculos");
        for (int i = 0; i < 4; i++) {
            System.out.println(objVehiculo[i].mostrarInformacion());
            System.out.println("************************************");
        }

        for (int i = 3; i < 10; i++) {
            if (i / 2 == 0) {
                System.out.println("Ingrese el numero de puertas del automovil");
                int puertas = numeros.nextInt();
                System.out.println("Ingrese la marca del automovil");
                String marcaAuto = caracteres.nextLine();
                System.out.println("Ingrese el modelo del automovil");
                String modeloAuto = caracteres.nextLine();
                System.out.println("Ingrese el año del automovil");
                int añoAuto = numeros.nextInt();
                System.out.println("Ingrese el propietario del automovil");
                String propietarioAuto = caracteres.nextLine();
                System.out.println("Ingrese la placa del automovil");
                String placaAuto = caracteres.nextLine();
                for (int j = 0; j < 10; j++) {
                    if (objVehiculo[i].getPlaca().equals(placaAuto)) {
                        System.out.println("No ingrese placas repetidas");
                        placaAuto = caracteres.nextLine();
                    }
                }
                objVehiculo[i]=new Automovil(puertas,marcaAuto,modeloAuto,añoAuto,propietarioAuto,placaAuto);
            } else {
                System.out.println("Ingrese el cilindraje de la motocicleta");
                int cilindraje = numeros.nextInt();
                System.out.println("Ingrese la marca del motocicleta");
                String marcaMoto = caracteres.nextLine();
                System.out.println("Ingrese el modelo del motocicleta");
                String modeloMoto = caracteres.nextLine();
                System.out.println("Ingrese el año del motocicleta");
                int añoMoto = numeros.nextInt();
                System.out.println("Ingrese el propietario del motocicleta");
                String propietarioMoto = caracteres.nextLine();
                System.out.println("Ingrese la placa del motocicleta");
                String placaMoto = caracteres.nextLine();
                for (int j = 0; j < 10; j++) {
                    if (objVehiculo[i].getPlaca().equals(placaMoto) ) {
                        System.out.println("No ingrese placas repetidas");
                        placaMoto = caracteres.nextLine();
                    }
                }
                objVehiculo[i]=new Motocicleta(cilindraje,marcaMoto,modeloMoto,añoMoto,propietarioMoto,placaMoto);
            }
        }

        System.out.println("Informacion de los Vehiculos");
        for (int i = 0; i < 10; i++) {
            System.out.println(objVehiculo[i].mostrarInformacion());
            System.out.println("************************************");
        }

    }
}
