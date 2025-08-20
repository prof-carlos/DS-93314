package org.example;

public class Cliente {
    // Atributos (variáveis da classe).
    private String nome;
    private int idade;

    // Construtor (Metodo de inicialização).
    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos de acesso.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
