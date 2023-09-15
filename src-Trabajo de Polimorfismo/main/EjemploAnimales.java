package main;

import Animales.*;

public class EjemploAnimales {

    public static void main(String[] args) {
        System.out.println("Sonido Perro....................");
        Animal perro = new Perro("Pecas", "3", "omnivoro", "Bull Dog");
        perro.sonidoAnimal();
        System.out.println("Sonido Gato....................");
        Animal gato = new Gato("Pecas", "3", "omnivoro", "Atigrado");
        gato.sonidoAnimal();
        System.out.println("Sonido Ave....................");
        Ave ave = new Ave("Flautin", "2", "Carnivoro", "Condor");
        ave.sonidoAnimal();

    }
}
