

package com.mycompany.questao58.java;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Questao58Java {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a data no formato (dd/MM/yyyy): ");
        String dataString = scanner.nextLine();

        LocalDate data = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("Informe a quantidade de dias a serem adicionados: ");
        int quantidadeDias = scanner.nextInt();

        LocalDate dataResultante = data.plusDays(quantidadeDias);

        System.out.println("Data resultante: " + dataResultante.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        scanner.close();

    }
}
