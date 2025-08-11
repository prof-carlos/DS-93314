package org.example;

import java.util.Scanner;

public class LacoFor2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];
        double soma = 0;

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();

        for (int i = 0; i < 2; i++) {
            do {
                System.out.println("Digite a " + i+1 + "ª nota: ");
                notas[i] = ler.nextDouble();
            } while (notas[i] < 0 || notas[i] >10);
            soma += notas[i];
        }

        double media = soma / 2;

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
        for (double nota: notas) {
            System.out.println("Primeira nota: " + nota);
            System.out.println("Segunda nota: " + nota);
        }
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);

        ler.close();

    }
}
