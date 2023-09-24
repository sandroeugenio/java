
package com.mycompany.questao26.java;

import java.util.Scanner;

public class Questao26Java {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro horário (HH:MM:SS): ");

        String horario1 = scanner.nextLine();

        System.out.print("Digite o segundo horário (HH:MM:SS): ");
        String horario2 = scanner.nextLine();

        scanner.close();

        scanner.close();

        long diferencaEmSegundos = calcularDiferencaEmSegundos(horario1, horario2);

        System.out.println("A diferença em segundos é: " + diferencaEmSegundos + " segundos.");
    }

    public static long calcularDiferencaEmSegundos(String horario1, String horario2) {

        long segundos1 = converterHorarioParaSegundos(horario1);

        long segundos2 = converterHorarioParaSegundos(horario2);

// Calcula a diferença em segundos
        long diferenca = Math.abs(segundos1 - segundos2);

        return diferenca;

    }

    public static long converterHorarioParaSegundos(String horario) {
        String[] partes = horario.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int segundos = Integer.parseInt(partes[2]);

        long totalSegundos = horas * 3600 + minutos * 60 + segundos;

        return totalSegundos;

    }
}
