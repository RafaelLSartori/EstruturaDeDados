package controller;

public class Recursividade03 {
    public Recursividade03(){
        super();
    }

    public int fatorial(int n){
        //O ponto de parada: Fatorial de 0 e 1 é sempre 1.
        if(n == 0 || n == 1){
            return 1;
        }
        //Chamada da função recursiva multiplicando o n com seu antecessor.
        return n * fatorial(n-1);
    }

}
