package com.mycompany.questao2.java;

import java.util.Scanner;

public class Questao2Java {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Digite o valor do seu salário");

        double MeuSalario = scanner.nextDouble();
        
        System.out.println("Digite o valor do salário mínimo atual");

        double minimo = scanner.nextDouble();
        

        double resultado = MeuSalario / minimo;

        System.out.println("Você recebe " + resultado + " salários mínimo");
        
        scanner.close();

    }
  
}

