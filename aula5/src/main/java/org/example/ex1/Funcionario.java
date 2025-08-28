package org.example.ex1;

public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private double salario;
    private Setor setor;
    private Sexo sexo;

    public Funcionario(int id, String nome, int idade, double salario, Setor setor, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", setor=" + setor.getNome() +
                ", sexo=" + sexo.getTexto() +
                '}';
    }
}
