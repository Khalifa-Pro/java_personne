package service;

import entity.Personne;

public interface IPersonne {
    Personne saisir();
    void afficher(Personne personne);
}
