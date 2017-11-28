/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.Entrada;

/**
 *
 * @author Felipillo
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        String matricula;
        Pattern patron = Pattern.compile("([0-9]{4})([[A-Z]&&[^AEIOUÑ]]{3})");
        Matcher emparejador;

        System.out.println("Intruduzca una matricula para validar si su formato es correcto: ");
        matricula = Entrada.cadena();
        emparejador = patron.matcher(matricula);

        while (!emparejador.matches()) {

            System.out.println("Matricula no valida, vuelve a introducir una matricula con formato valido: ");
            matricula = Entrada.cadena();
            emparejador = patron.matcher(matricula);

        }
        System.out.println("Matricula correcta, sus numeros son: " + emparejador.group(1));
        System.out.println("Sus letras son: " + emparejador.group(2));

    }
}
