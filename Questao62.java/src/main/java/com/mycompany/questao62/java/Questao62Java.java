package com.mycompany.questao62.java;

import java.util.Scanner;

public class Questao62Java {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas para a pirâmide: ");

        int numLinhas = scanner.nextInt();

        for (int i = 1; i <= numLinhas; i++) {
            // Loop para imprimir o número atual i vezes na mesma linha

            for (int j = 1; j <= i; j++) {
                System.out.print(String.format("%02d ", i));

            }
// Avança para a próxima linha
        }

        scanner.close();

    }
}
