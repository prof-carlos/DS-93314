package org.example.enums;

public enum Cargos {
    PROGRAMADOR(3500),
    GERENTE(5000);

    private double valor;

    Cargos(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
