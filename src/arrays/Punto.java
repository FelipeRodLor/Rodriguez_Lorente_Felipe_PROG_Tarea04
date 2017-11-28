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
public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {

        String representacion = x + " " + y;

        return representacion;

    }

    public double distancia(Punto punto2) {

        return (double) Math.sqrt(Math.pow(punto2.getX() - x, 2) + Math.pow(punto2.getY() - y, 2));

    }
}
