package org.example.enums;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marta", Pedido.ABERTO, Cargos.GERENTE, Estado.BAHIA);

        System.out.println(cliente1.toString());
        System.out.println("Salário: " + cliente1.getCargos().getValor());
        System.out.println("Estado: " + cliente1.getEstado().getNomeEstado());
    }
}