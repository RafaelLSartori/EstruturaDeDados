package view;

import controller.*;

public class Main {
    public static void main(String[] args) {

        //Exercício 2
        Recursividade02 m2 = new Recursividade02();
        int[] vet2 = {12, 3, 2, 10, 5};
        int menor = vet2[4];
        int tamanho = vet2.length;
        int resposta2 = m2.menorValorVetor(vet2, menor, tamanho);
        System.out.println("Menor valor do vetor: " + resposta2);

    }
}