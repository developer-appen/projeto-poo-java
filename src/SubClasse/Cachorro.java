package SubClasse;

import Interfaces.Corredor;
import Interfaces.Nadador;
import SuperClasse.Animal;

public class Cachorro extends Animal implements Corredor, Nadador {

    // Atributo específico de "Cachorro"
    private String raca;
    private String corPelo;

    // Getter
    public String getRaca() {
        return raca;
    }

    public String getCorPelo() {
        return corPelo;
    }

    // Construtor
    public Cachorro(String nome, String raca, int idade, String corPelo, double altura, double peso, String especie) {
        super(nome, idade, altura, peso, especie);
        this.raca = raca;
        this.corPelo = corPelo;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nNome: " + getNome() +
                "\nRaça: " + getRaca() +
                "\nIdade: " + getIdade() +
                "\nCor do pelo: " + getCorPelo() +
                "\nAltura: " + getAltura() + " m" +
                "\nPeso: " + getPeso() + " kg" +
                "\nEspécie: " + getEspecie());
    }

    @Override
    public void correr() {
        System.out.println("\n" + getNome() + " está correndo!");
    }

    @Override
    public void nadar() {
        System.out.println("\n" + getNome() + " está nadando!");
    }
}
