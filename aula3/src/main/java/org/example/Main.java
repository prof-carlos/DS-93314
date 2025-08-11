package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();

        double nota1;
        double nota2;

        do {
            System.out.println("Digite a primeira nota: ");
            nota1 = ler.nextDouble();
        } while (nota1 <0 || nota1 >10);

        do {
            System.out.println("Digite a segunda nota: ");
            nota2 = ler.nextDouble();
        } while (nota2 < 0 || nota2 >10);

        double media = (nota1 + nota2) / 2;

        String resultado;

        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media >= 5){
            resultado = "Verificação suplementar";
        } else {
            resultado = "Reprovado";
        }

        System.out.println("\n= APRESENTADO DADOS =");
        System.out.println("Nome: " + nome);
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);

        ler.close();
    }
}