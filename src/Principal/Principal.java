package Principal;

import Interfaces.Corredor;
import SubClasse.Cachorro;
import SubClasse.Humano;
import SubClasse.Papagaio;
import SubClasse.Peixe;
import SuperClasse.Animal;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Animal> listaAnimais = new ArrayList<>();

        // Instânciando os objetos a partir das subclasses
        Humano human1 = new Humano("Marcos", 22, "Negro", 1.76, 118, "Desenvolvedor", "Brasileiro", "O+", "Homo sapiens");

        Cachorro dog1 = new Cachorro("Thor", "Golden Retriever", 5, "Dourado", 0.60, 30, "Canis lupus familiaris");

        Papagaio parrot1 = new Papagaio("Loro", 8, 0.35, 0.45, "Verde", false, "Amazona aestiva");

        Peixe fish1 = new Peixe("Nemo", 3, 0.15, 0.20, "Amphiprion ocellaris", "Salgada", 15, 2.5, true);

        // Guardando os objetos dentro de uma lista
        listaAnimais.add(human1);
        listaAnimais.add(dog1);
        listaAnimais.add(parrot1);
        listaAnimais.add(fish1);

        // Exibindo os dados para cada objeto, chamando o método exibirDados()
        for (int i = 0; i < listaAnimais.size(); i++) {
            listaAnimais.get(i).exibirDados();
        }

        ArrayList<Corredor> listaCorredores = new ArrayList<>();

        listaCorredores.add(dog1);
    }
}
