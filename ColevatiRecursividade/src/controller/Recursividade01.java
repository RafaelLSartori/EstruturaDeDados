package controller;

public class Recursividade01 {
    public Recursividade01(){
        super();
    }

    public int somaNaturais(int n){

        if (n < 0){
            return 0;
        } else{
            return n + somaNaturais(n - 1);
        }
    }
}
