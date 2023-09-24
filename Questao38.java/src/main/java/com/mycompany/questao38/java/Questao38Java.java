package com.mycompany.questao38.java;

import java.util.Scanner;

public class Questao38Java {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");

        int numero = scanner.nextInt();
        scanner.close();

        scanner.close();

        boolean ehPrimo = verificarPrimo(numero);

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        // Verifique se o número é divisível por qualquer número de 2 até a raiz quadrada do número
        for (int i = 2; i <= Math.sqrt(numero); i++) {

            if (numero % i == 0) {
                return false; // Se for divisível, não é primo
            }

        }
        return true;

    }
}
