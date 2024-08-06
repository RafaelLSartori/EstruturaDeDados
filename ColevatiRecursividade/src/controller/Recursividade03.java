package controller;

public class Recursividade03 {
    public Recursividade03(){
        super();
    }

    public int fatorial(int n , int fat){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fatorial(n-1, fat);
    }

}
