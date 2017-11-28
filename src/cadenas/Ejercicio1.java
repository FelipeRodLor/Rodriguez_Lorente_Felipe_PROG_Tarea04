/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import utilidades.Entrada;

/**
 *
 * @author Felipillo
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        String palabra;
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        do {
            System.out.println("Introduzca una palablra:");
            palabra = Entrada.cadena();
            palabra = palabra.toUpperCase();
        } while (palabra.length() < 0);

        for (int i = palabra.length() - 1; i >= 0; i--) {

            switch (palabra.charAt(i)) {

                case 'A':
                    contadorA = contadorA + 1;
                    break;

                case 'E':
                    contadorE = contadorE + 1;
                    break;

                case 'I':
                    contadorI = contadorI + 1;
                    break;

                case 'O':
                    contadorO = contadorO + 1;
                    break;

                case 'U':
                    contadorU = contadorU + 1;
                    break;

            }
        }
        if (contadorA > 0 && contadorE > 0 && contadorI > 0 && contadorO > 0 && contadorU > 0) {
            System.out.println("La palabra es panvólica, tiene las cinco vocales.");
        } else {
            System.out.println("La palabra no es panvolica, no tiene las cinco vocales.");
        }
    }

}
