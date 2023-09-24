package com.mycompany.questao42.java;

import java.util.Random;
import java.util.Arrays;

public class Questao42Java {

    public static void main(String[] args) {

        Random rand = new Random();
        int totalGrupos = 40;

        for (int i = 0; i < totalGrupos; i++) {

            int[] grupo = gerarGrupoSorteado(rand);
            Arrays.sort(grupo); // Ordena os números em ordem crescente
            System.out.println("Grupo " + (i + 1) + ": " + Arrays.toString(grupo));
        }
    }

    public static int[] gerarGrupoSorteado(Random rand) {
        int[] grupo = new int[3];

        for (int i = 0; i < 3; i++) {
            grupo[i] = rand.nextInt(60); // Gera um número aleatório de 0 a 59
        }

        return grupo;

    }
}
