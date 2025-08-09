package org.example;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int QUANTIDADE_NOTAS = 2;
        double[] notas = new double[QUANTIDADE_NOTAS];

        double media = 0;
        double soma = 0;

        for (int i = 0; i < QUANTIDADE_NOTAS; i++) {
            do {
                System.out.println("Digite a " + (i + 1) + " nota: ");
                notas[i] = ler.nextDouble();
            } while (notas[i] < 0 || notas[i] > 10);

            soma += notas[i];
        }

        media = soma / QUANTIDADE_NOTAS;

        System.out.println("\nExibindo as notas: ");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        System.out.println("Média: " + media);
        ler.close();
    }
}
