package com.mycompany.questao54.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao54Java {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor inicial em reais: ");
        double valorInicial = scanner.nextDouble();

        System.out.print("Informe o valor final em reais: ");
        double valorFinal = scanner.nextDouble();

        System.out.print("Informe o incremento em reais: ");
        double incremento = scanner.nextDouble();

        System.out.print("Informe o valor de 1 dólar: ");
        double valorDolar = scanner.nextDouble();

        System.out.println("Tabela de Conversão de Reais para Dólares:");
        System.out.println("=========================================");
        System.out.println("Reais (R$) \t Dólares (USD)");
        System.out.println(
                "-----------------------------------------");

        DecimalFormat formatoMonetario = new DecimalFormat("#,##0.00");

        System.out.println("\nTabela de Conversão de Reais para Dólares:");
        System.out.println("=========================================");
        System.out.println("Reais (R$)\tDólares (USD)");
        System.out.println("-----------------------------------------");

        for (double reais = valorInicial; reais <= valorFinal; reais += incremento) {

            double dolares = reais / valorDolar;
            System.out.println("\t\t" + formatoMonetario.format(dolares));

        }

    }
}
