package controller;

public class Recursividade05 {
    public Recursividade05(){
        super();
    }

    public double serie(double n){
        if(n == 1){
            return 1;
        } else {
            return 1/n + serie(n - 1);
        }
    }
}
