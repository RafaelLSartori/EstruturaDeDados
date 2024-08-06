package view;

import controller.*;

public class Main {
    public static void main(String[] args) {

        //Exercício 4
        Recursividade04 m4 = new Recursividade04();
        int[] vet4 = {-12, -2, 3, -10, 5};
        int tamanho = vet4.length;
        int resposta4 = m4.vetorNegativo(vet4, tamanho);
        System.out.println(resposta4);

    }
}