package controller;

public class Recursividade04 {
    public Recursividade04(){
        super();
    }
    int total = 0;
    public int vetorNegativo(int[] vet, int tamanho){
        if(tamanho == 0){
            return total;
        }
        if(vet[tamanho - 1] < 0){
            total++;
        }

        return vetorNegativo(vet, tamanho - 1);
    }
}
