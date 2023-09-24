package com.mycompany.questao46.java;

import java.util.ArrayList;
import java.util.List;

class Pessoa {

    private String sexo;
    private int idade;

    public Pessoa(String sexo, int idade) {
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

public class Questao46Java {

    public static void main(String[] args) {

        List<Pessoa> listaDePessoas = new ArrayList<>();

        // Suponha que você tenha preenchido a lista com informações sobre as 200 pessoas
        int homensMaioresDeIdade = 0;
        int mulheresMaioresDeIdade = 0;

        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa.getSexo().equals("M") && pessoa.getIdade() >= 18) {
                homensMaioresDeIdade++;
            } else if (pessoa.getSexo().equals("F") && pessoa.getIdade() >= 18) {
                mulheresMaioresDeIdade++;
            }
        }

        System.out.println(
                "Homens maiores de idade: " + homensMaioresDeIdade);
        System.out.println("Mulheres maiores de idade: " + mulheresMaioresDeIdade);

    }
}
