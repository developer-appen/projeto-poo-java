package SuperClasse;

public abstract class Animal {

    // Atributos
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String especie;

    // Construtor
    public Animal(String nome, int idade, double altura, double peso, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.especie = especie;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getEspecie() {
        return especie;
    }

    // Somente faz sentido um "Animal" trocar de nome, altura e peso...
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            System.out.println("\nAltura inválida!");
        } else {
            this.altura = altura;
        }
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            System.out.println("\nPeso inválido!");
        } else {
            this.peso = peso;
        }
    }

    // Metodos abstratos
    public abstract void exibirDados();

    // Metodos concretos
    public void crescerAltura(double valor) {
        if (valor <= 0) {
            System.out.println("\nValor inválido!");
            return;
        }

        setAltura(this.altura + valor);

        System.out.println("\n" + this.nome + " cresceu!");
        System.out.println("Altura atual: " + this.altura);
    }

    public void diminuirAltura(double valor) {
        if (valor <= 0) {
            System.out.println("\nValor inválido!");
            return;
        }

        setAltura(this.altura - valor);

        System.out.println("\n" + this.nome + " diminuiu!");
        System.out.println("Altura atual: " + this.altura);
    }
    public void perderPeso(double valor) {
        if (valor <= 0) {
            System.out.println("\nValor inválido!");
            return;
        }

        setPeso(this.peso - valor);

        System.out.println("\n" + this.nome + " emagreceu!");
        System.out.println("Peso atual: " + this.peso);
    }

    public void ganharPeso(double valor) {
        if (valor <= 0) {
            System.out.println("\nValor inválido!");
            return;
        }

        setPeso(this.peso + valor);

        System.out.println("\n" + this.nome + " engordou!");
        System.out.println("Peso atual: " + this.peso);
    }
}
