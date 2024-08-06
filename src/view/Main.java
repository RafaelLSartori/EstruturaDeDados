package view;

import controller.Recursividade01;
import controller.Recursividade02;

public class Main {
    public static void main(String[] args) {

        //Exercício 1
        Recursividade01 m1 = new Recursividade01();
        int n = 7;
        int resposta1 = m1.somaNaturais(n);
        System.out.println(resposta1);

        //Exercício 2
        Recursividade02 m2 = new Recursividade02();
        int[] vet = {12, 3, 2, 10, 5};
        int menor = vet[4];
        int tamanho = vet.length;
        int resposta2 = m2.menorValorVetor(vet, menor, tamanho);
        System.out.println(resposta2);

    }
}