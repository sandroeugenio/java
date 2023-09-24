package com.mycompany.questao10.java;

import java.util.Scanner;

public class Questao10Java {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do salário bruto: ");

        double salarioBruto = scanner.nextDouble();

        System.out.print("Informe o valor dos descontos: ");
        double descontos = scanner.nextDouble();

        System.out.print("Quanto quer solicitar de empréstimo: ");
        double valorEmprestimo = scanner.nextDouble();

        double salarioLiquido = salarioBruto - descontos;

        double valorMaxEmprestimo = 0.3 * salarioLiquido;

        if (valorEmprestimo <= valorMaxEmprestimo) {
            System.out.println("Empréstimo aprovado. Você pode solicitar um empréstimo de até R$" + valorMaxEmprestimo);
        } else {
            System.out.println("Empréstimo negado. O valor solicitado excede o limite de R$" + valorMaxEmprestimo);

        }
        scanner.close();
    }
}
