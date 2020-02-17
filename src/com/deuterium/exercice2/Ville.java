package com.deuterium.exercice2;

import jdk.jshell.spi.ExecutionControl;

public class Ville {
    protected String nom;
    protected int nbHabitants;

    public Ville(String nom) {
        this.nom = nom.toUpperCase();
    }

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        if (nbHabitants > 0) {
            this.nbHabitants = nbHabitants;
        } else {
            this.nbHabitants = 0;
        }
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbHabitants(int nbHabitants) {
        if (nbHabitants > 0) {
            this.nbHabitants = nbHabitants;
        } else {
            this.nbHabitants = 0;
        }
    }

    public boolean nbHabitantsConnu() {
        return nbHabitants > 0;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }

    public String categorie() {
        return new String("Cette méthode n'est pas définit dans l'exercice");
    }
}
