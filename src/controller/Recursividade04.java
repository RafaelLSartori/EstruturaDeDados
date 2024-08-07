package controller;

public class Recursividade04 {
    public Recursividade04(){
        super();
    }
    int total = 0;
    public int vetorNegativo(int[] vet, int tamanho){
        //O ponto de parada foi pensado na mesma forma do exercício anterior com vetor, percorrendo todo ele.
        if(tamanho == 0){
            return total;
        }
        //Aqui eu faço a contagem dos números negativos.
        if(vet[tamanho - 1] < 0){
            total++;
        }
        //Chamada da função recursiva reduzindo o índice do vetor para percorrer ele todo.
        return vetorNegativo(vet, tamanho - 1);
    }
}
