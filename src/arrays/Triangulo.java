/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Felipillo
 */
public class Triangulo {

    private Punto puntoA;
    private Punto puntoB;
    private Punto puntoC;

    public Triangulo(Punto puntoA, Punto puntoB, Punto puntoC) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
        this.puntoC = puntoC;

    }

    public Punto getPuntoA() {
        return puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public Punto getPuntoC() {
        return puntoC;
    }
}
