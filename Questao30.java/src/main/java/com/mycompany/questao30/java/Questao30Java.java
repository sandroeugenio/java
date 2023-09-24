package com.mycompany.questao30.java;

import java.util.Scanner;

public class Questao30Java {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\"Informe as coordenadas dos vértices do primeiro retângulo:");
        double[][] retangulo1 = lerVertices(scanner);

        scanner.close();
        System.out.println("\"Informe as coordenadas dos vértices do segundo retângulo:");
        double[][] retangulo2 = lerVertices(scanner);
        scanner.close();

        double[] cantoSuperiorEsquerdo1 = encontrarCantoSuperiorEsquerdo(retangulo1);
        double[] cantoInferiorDireito1 = encontrarCantoInferiorDireito(retangulo1);

        double[] cantoSuperiorEsquerdo2 = encontrarCantoSuperiorEsquerdo(retangulo2);
        double[] cantoInferiorDireito2 = encontrarCantoInferiorDireito(retangulo2);

        // Verifique se há interseção entre os retângulos
        boolean interceptam = retangulosInterceptam(cantoSuperiorEsquerdo1, cantoInferiorDireito1,
                cantoSuperiorEsquerdo2, cantoInferiorDireito2);
        if (interceptam) {
            System.out.println("Os retângulos se interceptam.");
        } else {

            System.out.println("Os retângulos não se interceptam.");
        }
    }

    // Função para ler as coordenadas dos vértices de um retângulo
    public static double[][] lerVertices(Scanner scanner) {

        double[][] retangulo = new double[4][2];
        for (int i = 0; i < 4; i++) {
            System.out.print("Informe as coordenadas x e y do vértice " + (i + 1) + ": ");
            retangulo[i][0] = scanner.nextDouble();
            retangulo[i][1] = scanner.nextDouble();
        }
        return retangulo;
    }

// Função para encontrar o canto superior esquerdo do retângulo
    public static double[] encontrarCantoSuperiorEsquerdo(double[][] retangulo) {
        double minX = Double.MAX_VALUE;
        double minY = Double.MAX_VALUE;
        for (double[] ponto : retangulo) {
            minX = Math.min(minX, ponto[0]);
            minY = Math.min(minY, ponto[1]);
        }
        return new double[]{minX, minY};
    }

    // Função para encontrar o canto inferior direito do retângulo
    public static double[] encontrarCantoInferiorDireito(double[][] retangulo) {
        double maxX = Double.MIN_VALUE;
        double maxY = Double.MIN_VALUE;
        for (double[] ponto : retangulo) {
            maxX = Math.max(maxX, ponto[0]);
            maxY = Math.max(maxY, ponto[1]);

        }
        return new double[]{maxX, maxY};

    }
    // Função para verificar a interseção entre dois retângulos

    public static boolean retangulosInterceptam(double[] cantoSuperiorEsquerdo1, double[] cantoInferiorDireito1,
            double[] cantoSuperiorEsquerdo2, double[] cantoInferiorDireito2) {
        return !(cantoInferiorDireito1[0] < cantoSuperiorEsquerdo2[0]
                || cantoInferiorDireito1[1] < cantoSuperiorEsquerdo2[1]
                || cantoSuperiorEsquerdo1[0] > cantoInferiorDireito2[0]
                || cantoSuperiorEsquerdo1[1] > cantoInferiorDireito2[1]);

    }
}
