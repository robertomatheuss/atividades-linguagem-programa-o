#include <stdio.h>
#include <math.h>
#include <locale.h>

int main()
{
    system("cls");
    setlocale(LC_ALL, "Portuguese");
    
    int quantidade_de_termos;
    int sinal =-1;
    double somatoriaS = 0.0;
    double dividendo = 1.0;

    printf("Qual a quantidade de termos da serie que voce quer:");
    scanf("%d",&quantidade_de_termos);

    for(int i = 1;i <= quantidade_de_termos; i++){
        if(sinal> 0){
            somatoriaS = somatoriaS+(1.0/pow(dividendo,3.0));
            sinal = -1;
        }else{
            somatoriaS = somatoriaS-(1.0/pow(dividendo,3.0));
            sinal = 1;
        }
        dividendo = dividendo+2 ;
    }
    double pi = cbrt(somatoriaS * 32);
    printf("O valor de pi: %.5lf", pi);

    return 0;
}
