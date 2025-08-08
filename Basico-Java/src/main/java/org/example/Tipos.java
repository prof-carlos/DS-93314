package org.example;

import java.util.Scanner;

public class Tipos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.next();

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = ler.nextDouble();
    }
}
