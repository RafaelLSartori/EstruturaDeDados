package controller;

public class Recursividade05 {
    public Recursividade05(){
        super();
    }

    public double serie(double n){
        //Ponto de parada pensando que 1/1 = 1
        if(n == 1){
            return 1;
        } else {
            //chamada da função recursiva variando apenas o denominador, já que o númerador se mantém sem alteração.
            return 1/n + serie(n - 1);
        }
    }
}
