package com.mycompany.questao18.java;

import java.util.Scanner;
import java.time.LocalDate;

public class Questao18Java {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia do aniversário (1-31): ");
        int diaAniversario = scanner.nextInt();

        System.out.print("Digite o número do mês do aniversário (1-12): ");
        int mesAniversario = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        scanner.close();

        scanner.close();

        scanner.close();

        // Verificar se a data de aniversário é válida
        if (dataAniversarioEhValida(diaAniversario, mesAniversario)) {

            LocalDate dataAtual = LocalDate.now();
            int anoAtual = dataAtual.getYear();

            // Calcular a idade atual
            int idade = anoAtual - anoNascimento;

// Determinar o trimestre do aniversário
            int trimestre = (mesAniversario - 1) / 3 + 1;

            // Determinar o signo do zodíaco
            String signo = determinarSigno(mesAniversario, diaAniversario);

            // Exibir as informações
            System.out.println("Data de aniversário válida.");
            System.out.println("Idade atual: " + idade + " anos.");
            System.out.println("Trimestre do aniversário: " + trimestre + "º trimestre.");
            System.out.println("Signo do zodíaco: " + signo);

        } else {
            System.out.println("Data de aniversário inválida.");
        }
    }

    public static boolean dataAniversarioEhValida(int dia, int mes) {
        // Verificar se o mês é válido

        if (mes < 1 || mes > 12) {

            return false;
        }

// Verificar se o dia é válido com base no mês
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)) {
            return false;
        } else if (mes == 2) {
            // Fevereiro com validação para anos bissextos

            boolean bissexto = LocalDate.now().isLeapYear();
            if ((bissexto && (dia < 1 || dia > 29)) || (!bissexto && (dia < 1 || dia > 28))) {

                return false;
            }
        } else if (dia < 1 || dia > 31) {
            return false;
        }

        return true;

    }

    public static String determinarSigno(int mes, int dia) {
        String[] signos = {"Aquário", "Peixes", "Áries", "Touro", "Gêmeos", "Câncer",
            "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio"
        };

        int[] limites = {
            20, 19, 21, 20, 21, 21,
            22, 23, 23, 22, 22, 20
        };

        if (dia <= limites[mes - 1]) {
            return signos[mes - 1];

        } else {
            return signos[mes % 12];
        }
    }
}
