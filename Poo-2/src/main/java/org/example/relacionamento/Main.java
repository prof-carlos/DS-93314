package org.example.relacionamento;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "23");
        Cliente cliente1 = new Cliente("Marta", 25, endereco1);

        Cliente cliente2 = new Cliente("Maria", 30,
                new Endereco("Rua B", "40"));

        System.out.println(cliente1.toString());
        System.out.println(cliente2);
    }
}
