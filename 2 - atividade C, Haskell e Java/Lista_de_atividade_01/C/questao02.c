#include <stdio.h>
#include <string.h>
#include <locale.h>

int parOuImpar();

int main(){
    setlocale(LC_ALL, "Portuguese");

    int numero;
    int result;
    printf("Digite um numero para descobrir se par ou impar: ");
    scanf("%d", &numero);

    result = parOuImpar(numero);
    if(result == 0 )
        printf("Par!!!");
    else
        printf("Impar!!");
    return 0;
}

int parOuImpar(int numero){
    if(numero%2 == 0)
        return 0;//"0" Para true
    else 
        return 1;//"1" Para false 
}