# ⚡ JAVA POO — ANIMAL SYSTEM

<p align="center">
  <strong>🐾 Um projeto Java focado em Programação Orientada a Objetos</strong>
</p>

<p align="center">
  <em>Explorando abstração • herança • polimorfismo • interfaces • coleções</em>
</p>

---

## 🧬 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de **praticar e consolidar conceitos fundamentais de Programação Orientada a Objetos (POO) utilizando Java**.

A aplicação simula um pequeno sistema de gerenciamento de animais, utilizando diferentes comportamentos e características para representar cada tipo de animal.

A estrutura foi pensada para demonstrar como diferentes classes podem compartilhar comportamentos através de **herança e interfaces**, mantendo responsabilidades bem definidas.

---

## 🧠 Conceitos Aplicados

Durante o desenvolvimento, foram trabalhados conceitos importantes do paradigma orientado a objetos:

```text
                    ┌─────────────────────┐
                    │       ANIMAL        │
                    │   <<abstract>>      │
                    └──────────┬──────────┘
                               │
              ┌────────────────┼────────────────┐
              │                │                │
        ┌─────▼─────┐    ┌─────▼─────┐    ┌─────▼─────┐
        │  HUMANO   │    │ CACHORRO  │    │  PAPAGAIO │
        └───────────┘    └───────────┘    └───────────┘
                               │
                         ┌─────▼─────┐
                         │   PEIXE   │
                         └───────────┘
```

### 🔹 Abstração

A classe `Animal` funciona como uma **classe abstrata**, concentrando características e comportamentos comuns entre os animais.

### 🔹 Herança

As classes:

- `Humano`
- `Cachorro`
- `Papagaio`
- `Peixe`

herdam características da classe `Animal`.

### 🔹 Polimorfismo

Os diferentes tipos de animais podem ser tratados através de uma referência do tipo `Animal`, permitindo que cada classe implemente seu próprio comportamento.

### 🔹 Encapsulamento

Os atributos das classes são privados e acessados através de métodos, mantendo maior controle sobre os dados.

### 🔹 Interfaces

Foram criadas interfaces para representar **capacidades** dos animais:

| Interface | Capacidade |
|---|---|
| `Corredor` | Correr |
| `Nadador` | Nadar |
| `Voador` | Voar |

Isso permite que diferentes classes compartilhem comportamentos sem depender diretamente de uma hierarquia de herança.

---

## 🐾 Estrutura dos Animais

### 👨 Humano

Implementa:

- `Corredor`
- `Nadador`

Possui informações como:

- Nome
- Idade
- Altura
- Peso
- Profissão
- Nacionalidade
- Tipo sanguíneo
- Cor da pele
- Espécie

---

### 🐕 Cachorro

Implementa:

- `Corredor`
- `Nadador`

Possui informações como:

- Nome
- Idade
- Altura
- Peso
- Raça
- Cor do pelo
- Espécie

---

### 🦜 Papagaio

Implementa:

- `Voador`

Possui informações como:

- Nome
- Idade
- Altura
- Peso
- Cor das penas
- Vive em cativeiro
- Espécie

---

### 🐠 Peixe

Implementa:

- `Nadador`

Possui informações como:

- Nome
- Idade
- Altura
- Peso
- Tipo de água
- Profundidade máxima
- Velocidade de nado
- Presença de escamas
- Espécie

---

## ⚙️ Funcionalidades

O projeto atualmente permite:

- 🐾 Criar diferentes tipos de animais
- 📋 Armazenar animais em uma coleção
- 🔍 Exibir informações dos animais
- 🏃 Executar comportamentos específicos
- 🏊 Trabalhar com diferentes capacidades
- 🦜 Representar comportamentos através de interfaces
- ⚖️ Alterar peso dos animais
- 📏 Alterar altura dos animais
- 🛡️ Realizar validações através de métodos de acesso

---

## 🗂️ Estrutura do Projeto

```text
src/
│
├── Interfaces/
│   ├── Corredor.java
│   ├── Nadador.java
│   └── Voador.java
│
├── Principal/
│   └── Principal.java
│
├── SubClasse/
│   ├── Cachorro.java
│   ├── Humano.java
│   ├── Papagaio.java
│   └── Peixe.java
│
└── SuperClasse/
    └── Animal.java
```

---

## 🛠️ Tecnologias

<p align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)

![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)

![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

</p>

---

## 🧪 Tecnologias e Conceitos Estudados

```text
Java
│
├── Programação Orientada a Objetos
│   ├── Classes
│   ├── Objetos
│   ├── Encapsulamento
│   ├── Herança
│   ├── Abstração
│   └── Polimorfismo
│
├── Interfaces
│
├── Collections
│   └── ArrayList
│
└── Controle de fluxo
```

---

## 🚀 Execução

### 1️⃣ Clone o repositório

```bash
git clone https://github.com/developer-appen/projeto-poo-java.git
```

### 2️⃣ Abra o projeto

Abra o projeto em uma IDE compatível com Java, como:

- IntelliJ IDEA
- Eclipse
- Visual Studio Code

### 3️⃣ Execute

Localize a classe:

```text
Principal.java
```

e execute o método:

```text
main()
```

---

## 🎯 Objetivo de Aprendizado

Este projeto faz parte da minha evolução no desenvolvimento **Backend com Java**.

O objetivo não é apenas construir uma aplicação funcional, mas utilizar o projeto como laboratório para compreender, na prática, como os conceitos de orientação a objetos são aplicados na construção de software.

> **Aprender programação não é apenas escrever código.  
> É entender como e por que cada parte do código existe.**

---

## 🔮 Próximos Passos

A evolução planejada para este projeto inclui:

- [ ] Aprofundar Collections
- [ ] Implementar `Set`
- [ ] Implementar `Map`
- [ ] Trabalhar com `Iterator`
- [ ] Tratamento de exceções
- [ ] Exceções personalizadas
- [ ] Generics
- [ ] Lambda
- [ ] Stream API
- [ ] Organização em camadas
- [ ] JDBC
- [ ] Maven
- [ ] Evolução para Spring Boot
- [ ] Criação de APIs REST

---

## 📚 Conhecimentos Aplicados

```text
                    JAVA
                      │
             ┌────────┴────────┐
             │                 │
            POO             Collections
             │                 │
      ┌──────┼──────┐          │
      │      │      │       ArrayList
   Herança  Abstração       Polimorfismo
      │      │      │
      └──────┼──────┘
             │
         Interfaces
             │
      ┌──────┼──────┐
      │      │      │
   Correr  Nadar   Voar
```

---

## 👨‍💻 Desenvolvedor

**Marcos Vinicius**

🎯 Foco atual: **Java Backend Development**

📚 Estudante de **Análise e Desenvolvimento de Sistemas — FIAP**

💻 GitHub:  
https://github.com/marcos-thebest

---

<p align="center">

### ⚡ Código hoje. Evolução amanhã. Backend no futuro.

</p>

<p align="center">
  <sub>Projeto desenvolvido para fins de estudo e evolução em Java.</sub>
</p>