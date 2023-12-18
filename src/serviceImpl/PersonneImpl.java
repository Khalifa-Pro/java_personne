package serviceImpl;

import entity.Personne;
import service.IPersonne;

import java.util.Scanner;

public class PersonneImpl implements IPersonne {
    @Override
    public Personne saisir() {
        Personne personne = new Personne();
        Scanner scan = new Scanner(System.in);

        System.out.print("Entrer votre numero d'indentité national: ");
        personne.setCNI(scan.nextLong());
        scan.nextLine();
        System.out.print("Entrer votre nom: ");
        personne.setNom(scan.nextLine());

        System.out.print("Entrer votre prenom: ");
        personne.setPrenom(scan.nextLine());

        return personne;
    }

    @Override
    public void afficher(Personne personne) {
        System.out.println("================================================");
        System.out.println("CNI: "+personne.getCNI());
        System.out.println("NOM: "+personne.getNom().toUpperCase());
        System.out.println("PRENOM: "+personne.getPrenom());
        System.out.println("================================================");
    }
}
