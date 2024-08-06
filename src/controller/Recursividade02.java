package controller;

public class Recursividade02 {
    public Recursividade02(){
        super();
    }

    public int menorValorVetor(int[] vet, int menor, int tamanho) {

        if(tamanho == 0) {
            return menor;
        }
        if (vet[tamanho -1] < menor){
            menor = vet[tamanho -1];
        }
        return menorValorVetor(vet, menor, tamanho - 1);

    }
}
