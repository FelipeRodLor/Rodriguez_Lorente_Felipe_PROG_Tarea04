/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import utilidades.Entrada;

/**
 *
 * @author Felipillo
 */
public class Principal {

    public static void main(String[] args) {

        int numTriangulos;
        Triangulo triangulos[];
        double media;
        double perimetro;
        double sumaPer = 0;
        double supMed = 0;
        double infMed = 0;
        double mayor = 0;
        double menor = 999;

        System.out.println("¿Cuantos triangulos deseas generar?");
        numTriangulos = Entrada.entero();

        while (numTriangulos <= 0) {
            System.out.println("Numero incorrecto.Introduzca el numero de triangulos que deseas generar, el numero debe ser mayor que cero;");
            numTriangulos = Entrada.entero();
        }

        triangulos = new Triangulo[numTriangulos];

        for (int i = 0; i < numTriangulos; i++) {
            Punto puntoA = new Punto(Math.random() * 100, Math.random() * 100);
            Punto puntoB = new Punto(Math.random() * 100, Math.random() * 100);
            Punto puntoC = new Punto(Math.random() * 100, Math.random() * 100);

            triangulos[i] = new Triangulo(puntoA, puntoB, puntoC);

        }

        for (int i = 0; i < numTriangulos; i++) {
            perimetro = triangulos[i].perimetro();
            sumaPer = perimetro + sumaPer;
        }

        media = sumaPer / numTriangulos;
        System.out.println("El perimetro medio es; " + media);

        for (int i = 0; i < numTriangulos; i++) {

            if (triangulos[i].perimetro() > media) {
                supMed = supMed + 1;
            }
            if (triangulos[i].perimetro() < media) {
                infMed = infMed + 1;
            }
            if (triangulos[i].perimetro() > mayor) {
                mayor = triangulos[i].perimetro();
            }
            if (triangulos[i].perimetro() < menor) {
                menor = triangulos[i].perimetro();
            }
        }

        System.out.println("El triangulo con menor medida mide; " + menor);
        System.out.println("El triangulo con mayor medida mide; " + mayor);
        System.out.println("El numero de triangulos con perimetro inferior a la media es; " + (int) infMed);
        System.out.println("El numero de triangulos con perimetro superior a la media es; " + (int) supMed);

    }
}
