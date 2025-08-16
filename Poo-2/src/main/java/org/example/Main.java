package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Instanciar uma classe.
//        Pessoa p1 = new Pessoa("Marta", 25);
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = ler.next();
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();

        Pessoa p1 = new Pessoa(nome, idade);

        Produto produto1 = new Produto("Arroz", 2.50);

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

        System.out.println("\nNome do produto: " + produto1.getNome());
        System.out.println("Preço do produto: " + produto1.getPrecoUnitario());

    }
}