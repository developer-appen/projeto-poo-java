package SubClasse;

import Interfaces.Corredor;
import Interfaces.Nadador;
import SuperClasse.Animal;

public class Humano extends Animal implements Corredor, Nadador {

    // Atributos específicos de "Humano"
    private String profissao;
    private String nacionalidade;
    private String tipoSanguineo;
    private String corPele;

    // Getters and Setters
    public String getProfissao() {
        return profissao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    // @Overload - Sobrecarga
    // 1 - Construtor (Caso essa pessoa seja um trabalhador(a)
    public Humano(String nome, int idade, String corPele, double altura, double peso, String profissao, String nacionalidade, String tipoSanguineo, String especie) {
        super(nome, idade, altura, peso, especie);
        this.corPele = corPele;
        this.profissao = profissao;
        this.nacionalidade = nacionalidade;
        this.tipoSanguineo = tipoSanguineo;
    }

    // 2 - Construtor (Caso essa pessoa não seja um trabalhador(a)
    public Humano(String nome, int idade, String corPele, double altura, double peso, String nacionalidade, String tipoSanguineo, String especie) {
        super(nome, idade, altura, peso, especie);
        this.corPele = corPele;
        this.nacionalidade = nacionalidade;
        this.tipoSanguineo = tipoSanguineo;
        this.profissao = "Não trabalha";
    }

    @Override
    public void exibirDados() {
        System.out.println("\nNome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nCor de pele: " + getCorPele() +
                "\nAltura: " + getAltura() + " m" +
                "\nPeso: " + getPeso() + " kg" +
                "\nProfissão: " + getProfissao() +
                "\nNacionalidade: " + getNacionalidade() +
                "\nTipo Sanguíneo: " + getTipoSanguineo() +
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
