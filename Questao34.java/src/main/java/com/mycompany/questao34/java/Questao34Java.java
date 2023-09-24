package com.mycompany.questao34.java;

import java.util.Random;

public class Questao34Java {

    public static void main(String[] args) {

        //instância um objeto da classe Random usando o construtor padrão
        Random gerador = new Random();

        //imprime sequência de 50 números inteiros aleatórios
        for (int i = 0; i < 50; i++) {
            System.out.println(gerador.nextInt());
        }

    }
}
