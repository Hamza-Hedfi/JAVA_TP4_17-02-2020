package com.deuterium.exercice1;

public class Cercle_v1 {
    private Point centre;
    private double rayon;

    public Cercle_v1(double x, double y, double rayon) {
        centre = new Point(x, y);
        this.rayon = rayon;
    }

    public void deplaceCentre(double dx, double dy) {
        centre.deplace(dx, dy);
    }

    public void changeRayon(double nvRayon) {
        rayon = nvRayon;
    }

    public Point getCentre() {
        return centre;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "centre=" + centre +
                ", rayon=" + rayon +
                '}';
    }
}
