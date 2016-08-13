/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movistarlistip;

/**
 *
 * @author Aleix
 */
public class GrupCanal {
    String nom;

    public GrupCanal() {
    }

    public GrupCanal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "GrupCanal{" + "nom=" + nom + '}';
    }
    
}
