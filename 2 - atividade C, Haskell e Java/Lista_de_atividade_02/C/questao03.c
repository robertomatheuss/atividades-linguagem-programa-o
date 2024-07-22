#include <stdio.h>
#include <locale.h>

int main()
{
    system("cls");
    double game_price = 19.9;
    int quantidade_vendida;
    double bonus = 0.0;
    double faturamento_pessoal;
    double salario;
    double salario_com_bonus;

    printf("Quantos jogos foram vendidos esse mes: ");
    scanf("%d", &quantidade_vendida);
    faturamento_pessoal = quantidade_vendida*game_price;
    salario = faturamento_pessoal*0.5;

    while (quantidade_vendida >= 15)
    {
        bonus = bonus+(15*game_price*0.08);
        quantidade_vendida -=15;
    }
    salario_com_bonus = salario+bonus;
    printf("O valor arrecadado em vendas foi de: %.2lf\n", faturamento_pessoal);
    printf("O valor ganho como bonus foi de: %.2lf\n",bonus);
    printf("O valor que recebera no mes e de: %.2lf\n",salario_com_bonus);
    return 0;
}
