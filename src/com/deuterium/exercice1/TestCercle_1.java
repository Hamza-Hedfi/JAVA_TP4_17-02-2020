package com.deuterium.exercice1;

public class TestCercle_1 {
    public static void main(String[] args) {
        Cercle_v1 c = new Cercle_v1(3, 8, 2.5);
        System.out.println(c);
        c.deplaceCentre(1, 0.5);
        c.changeRayon(5.25);
        System.out.println(c);
        Point pt = c.getCentre();
        System.out.println(pt);
    }

}
