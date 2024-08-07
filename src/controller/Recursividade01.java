package controller;

public class Recursividade01 {
    public Recursividade01(){
        super();
    }

    public int somaNaturais(int n){

        //o ponto de para é descrito no enunciado como "se o número for negativo, retorna 0".
        if (n < 0){
            return 0;
        } else{
            //o número "n" se soma com o "n-1", que seria ele -1 até entrar no ponto de parada"
            return n + somaNaturais(n - 1);
        }
    }
}
