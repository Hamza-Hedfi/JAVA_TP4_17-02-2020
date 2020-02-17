package com.deuterium.exercice2;

import javax.management.InvalidAttributeValueException;

public class Capitale extends Ville {

    private String nomPays;

    public Capitale(String nom, String nomPays) {
        super(nom);
        this.nomPays = nomPays.toUpperCase();
    }

    public Capitale(String nom, int nbHabitants, String nomPays) {
        super(nom, nbHabitants);
        this.nomPays = nomPays.toUpperCase();
    }

    @Override
    public String toString() {
        return "Capitale{" +
                "nomPays='" + nomPays + '\'' +
                ", nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }
}
