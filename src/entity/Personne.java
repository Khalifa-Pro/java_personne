package entity;

public class Personne {

    protected Long CNI;
    protected String nom;
    protected String prenom;

    public Personne() {
    }

    public Personne(Long CNI, String nom, String prenom) {
        this.CNI = CNI;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Long getCNI() {
        return CNI;
    }

    public void setCNI(Long CNI) {
        this.CNI = CNI;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
