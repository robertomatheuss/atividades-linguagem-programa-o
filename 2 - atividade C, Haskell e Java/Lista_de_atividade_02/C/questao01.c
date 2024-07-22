#include <stdio.h>
#include <string.h>
#include <locale.h>

int main()
{
    system("cls");
    setlocale(LC_ALL, "Portuguese");

    char nascimento[11];
    char data_passagem[11];
    char has_rg[5];
    char has_passagem[5];
    int assento =1;
    int quantidade_passageiro;

    printf("Digite a quantidade de passageiros: ");
    scanf("%d",&quantidade_passageiro);

    int i = 0;
    while (i < quantidade_passageiro)
    {
        printf("Tem RG:[S/N]");
        scanf("%s", has_rg);
        int verifica_rg_minusculo = strcmp(has_rg,"n");
        int verifica_rg_maiuculo = strcmp(has_rg,"N");
        if (verifica_rg_maiuculo == 0||verifica_rg_minusculo ==0){
            printf("A saida e nessa direcao");
            break;;
        }        

        printf("Tem passagem:[S/N]");
        scanf("%s", has_passagem);
        int verifica_passagem_minusculo = strcmp(has_passagem,"n");
        int verifica_passagem_maiuculo = strcmp(has_passagem,"N");

        if (verifica_passagem_maiuculo == 0||verifica_passagem_minusculo ==0){
            printf("A recepcao e nessa direcao");
            break;;
        }  

        printf("Digite sua data de nascimento: [DD/MM/AAAA]");
        scanf("%s",nascimento);     

        printf("Digite a data de nascimento da sua passagem: [DD/MM/AAAA]");
        scanf("%s", data_passagem);

        int verifica_datas = strcmp(nascimento,data_passagem);
        if(!verifica_datas == 0){
            printf("190");
            break;;
        }

        printf("O seu assento se localiza em: A%d, Tenha um bom dia!\n",assento);
        assento++;
        i++;
    }
    return 0;
}
