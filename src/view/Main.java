package view;

import controller.*;

public class Main {
    public static void main(String[] args) {

        //Exercício 3
        Recursividade03 m3 = new Recursividade03();
        int fat = 1;
        int n3 = 4;
        int resposta3 = m3.fatorial(n3, fat);
        System.out.println(resposta3);

    }
}