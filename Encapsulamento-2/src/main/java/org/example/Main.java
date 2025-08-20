package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Instanciar uma clsse.
        Cliente cliente1 = new Cliente("Marta", 25);
        Cliente cliente2 = new Cliente("Maria", 30);

        // Usando toString().
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}