package com.mycompany.questao22.java;

import java.util.Scanner;

public class Questao22Java {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe a primeira dia de aniversário");
        int dia1 = scanner.nextInt();

        System.out.println("informe o mês de aniversário");
        int mes1 = scanner.nextInt();

        System.out.println("informe a segunda dia de aniversário");
        int dia2 = scanner.nextInt();

        System.out.println("informe o mês de aniversário");
        int mes2 = scanner.nextInt();

        if ((dia1 == dia2) && (mes1 == mes2)) {

            System.out.println("O primeira dia de aniversário " + dia1 + " e igual ao segundo");
            System.out.println("O primeiro mes de aniversario " + mes1 + " e igual ao segundo");
            System.out.println("Dia e Mês são iguais");

        } else {
            System.out.println("são diferentes.");

        }
        scanner.close();
    }
}
