package SubClasse;

import Interfaces.Nadador;
import SuperClasse.Animal;

public class Peixe extends Animal implements Nadador {

    // Atributos específicos de "Peixe"
    private String tipoAgua;
    private double profundidadeMaxima;
    private double velocidadeNado;
    private boolean possuiEscamas;

    // Getters and Setter
    public String getTipoAgua() {
        return tipoAgua;
    }

    public double getProfundidadeMaxima() {
        return profundidadeMaxima;
    }

    public double getVelocidadeNado() {
        return velocidadeNado;
    }

    public boolean isPossuiEscamas() {
        return possuiEscamas;
    }

    public void setVelocidadeNado(double velocidadeNado) {
        this.velocidadeNado = velocidadeNado;
    }

    // Construtor
    public Peixe(String nome, int idade, double altura, double peso, String especie, String tipoAgua, double profundidadeMaxima, double velocidadeNado, boolean possuiEscamas) {
        super(nome, idade, altura, peso, especie);
        this.tipoAgua = tipoAgua;
        this.profundidadeMaxima = profundidadeMaxima;
        this.velocidadeNado = velocidadeNado;
        this.possuiEscamas = possuiEscamas;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nNome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nAltura: " + getAltura() + " m" +
                "\nPeso: " + getPeso() + " kg" +
                "\nTipo da água: " + getTipoAgua() +
                "\nProfundidade Máxima: " + getProfundidadeMaxima() + " m" +
                "\nVelocidade de Nado: " + getVelocidadeNado() + " km" +
                "\nPossui Escamas? " + isPossuiEscamas() +
                "\nEspécie: " + getEspecie());
    }

    @Override
    public void nadar() {
        System.out.println("\n" + getNome() + " está nadando!");
    }
}
