package controller;

public class Recursividade02 {
    public Recursividade02(){
        super();
    }

    public int menorValorVetor(int[] vet, int menor, int tamanho) {

        //o ponto de parada termina quando o chega na posição 0 do vetor, para comparar todos os números.
        if(tamanho == 0) {
            return menor;
        }
        //nesta etapa, eu coleto o menor número conforme o índice vai mudando.
        if (vet[tamanho -1] < menor){
            menor = vet[tamanho -1];
        }
        //Aqui chamo a função recursiva diminuindo o tamanho do vetor.
        return menorValorVetor(vet, menor, tamanho - 1);

    }
}
