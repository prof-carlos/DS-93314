package org.example;

import org.example.ex1.Funcionario;
import org.example.ex1.Setor;
import org.example.ex1.Sexo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(
                1,
                "Marta",
                22,
                3500.0,
                Setor.VENDAS,
                Sexo.FEMININO);

        System.out.println(funcionario1.toString());
    }
}