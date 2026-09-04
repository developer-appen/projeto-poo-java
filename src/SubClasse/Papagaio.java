package SubClasse;

import Interfaces.Voador;
import SuperClasse.Animal;

public class Papagaio extends Animal implements Voador {

    // Atributos específicos de "Papagaio"
    private String corPenas;
    private boolean viveEmCativeiro;

    // Getters and Setters
    public String getCorPenas() {
        return corPenas;
    }

    public boolean isViveEmCativeiro() {
        return viveEmCativeiro;
    }

    public void setViveEmCativeiro(boolean viveEmCativeiro) {
        this.viveEmCativeiro = viveEmCativeiro;
    }

    // Construtor
    public Papagaio(String nome, int idade, double altura, double peso, String corPenas, boolean viveEmCativeiro, String especie) {
        super(nome, idade, altura, peso, especie);
        this.corPenas = corPenas;
        this.viveEmCativeiro = viveEmCativeiro;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nNome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nAltura: " + getAltura() + " m" +
                "\nPeso: " + getPeso() + " kg" +
                "\nCor das penas: " + getCorPenas() +
                "\nVive em cativeiro? " + isViveEmCativeiro() +
                "\nEspécie: " + getEspecie());
    }

    @Override
    public void voar() {
        System.out.println("\n" + getNome() + " está voando!");
    }
}
