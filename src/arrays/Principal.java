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

    }

}
