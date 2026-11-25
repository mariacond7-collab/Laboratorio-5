package main;

import modelo.Animal;
import modelo.Perro;
import modelo.Gato;
import modelo.Figura;
import modelo.Circulo;
import modelo.Rectangulo;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Laboratorio guiado ---");
        Animal miAnimal = new Animal();
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miAnimal.hacerSonido();
        miPerro.hacerSonido();
        miGato.hacerSonido();

        System.out.println("\n--- Desafio: areas de figuras ---");
        Figura[] figuras = {
            new Circulo(6),
            new Rectangulo(6, 4),
            new Circulo(4),
            new Rectangulo(7, 3)
        };

        for (Figura figura : figuras) {
            System.out.printf("%s - Area: %.2f%n",
                figura.getClass().getSimpleName(), figura.calcularArea());
        }
    }
}
