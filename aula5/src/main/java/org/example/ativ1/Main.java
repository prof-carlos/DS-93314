package org.example.ativ1;

import org.example.ex1.Sexo;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 =
                new Pessoa(1, "Marta", 32, "65135", Sexo.FEMININO,
                new Endereco("Rua A", "23", "Bloco B", "5462135", "Salvador", UnidadeFederativa.BAHIA));

        System.out.println(pessoa1.toString());
    }
}
