import service.IPersonne;
import serviceImpl.PersonneImpl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IPersonne personne = new PersonneImpl();
        personne.afficher(personne.saisir());
    }
}