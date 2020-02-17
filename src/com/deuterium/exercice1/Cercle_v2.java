package com.deuterium.exercice1;

public class Cercle_v2 extends Point {
    private double rayon;

    public Cercle_v2(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public void deplaceCentre(double dx, double dy) {
        super.deplace(dx, dy);
    }

    public void changeRayon(double nvRayon) {
        rayon = nvRayon;
    }

    public Point getCentre() {
//        return new Point(getX(), getY());
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "centre=" + super.toString() +
                ", rayon=" + rayon +
                '}';
    }
}
