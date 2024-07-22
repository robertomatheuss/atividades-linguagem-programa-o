#include <stdio.h>

int calculaMedia(int numeros[],int pesos[]);

int main(){
    int numeros[3];
    int pesos[3];
    for(int x =1; x <4;x++) {
        printf("Digite o numero %d e seu respectivo peso\n",x);
        printf("Numero:");
        int numero;
        scanf("%d",&numero);
        fflush(stdin);

        printf("Peso:");
        int peso;
        scanf("%d",&peso);
        numeros[x-1] = numero;
        pesos[x-1] = peso;
        }

        printf("%d",calculaMedia(numeros,pesos));
    return 0;
}

int calculaMedia(int numeros[],int pesos[]){
    int resultado = ((numeros[0]*pesos[0])+(numeros[1]*pesos[1])+(numeros[2]*pesos[2]))/(pesos[0]+pesos[1]+pesos[2]);
    return resultado;
}