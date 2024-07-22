#include <stdio.h>

int main(){
    int numero1,numero2,soma,subtrai,multiplica,divide;
    
    printf("Digite o primeiro numero: ");
    scanf("%d",&numero1);

    printf("Digite o segundo numero: ");
    scanf("%d", &numero2);
    
    soma = numero1 + numero2;
    subtrai = numero1 - numero2;
    multiplica = numero1 * numero2;
    divide = numero1 / numero2;
    
    printf("O resultado das operacoes com os numeros %d e o %d :\n",numero1,numero2);
    
    printf("Soma: %d\n",soma);
    printf("Subtracao: %d\n",subtrai);
    printf("Multiplicacao: %d\n",multiplica);
    printf("Divisao: %d\n",divide);

    return 0;
}