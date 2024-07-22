#include <stdio.h>

int main(){
    int idade;
    printf("Digite sua idade: ");
    scanf("%d", &idade);

    if(idade <18)
        printf("O usuario tem menos de 18 anos. Portando: Menor de idade");
    else 
        printf("O usuario tem mais de 18 anos. Portando: Maior de idade");
    return 0;
}