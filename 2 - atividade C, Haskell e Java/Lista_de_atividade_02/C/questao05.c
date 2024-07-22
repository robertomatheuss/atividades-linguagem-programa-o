#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_IPCA 20
#define MAX_STRING_LENGTH 50

int main() {
    char ipcaLista[MAX_IPCA][2][MAX_STRING_LENGTH];
    int indicaIndiceIpca = 0;
    
    while (indicaIndiceIpca < MAX_IPCA) {
        printf("Informe o mes, ano e IPCA respectivo (ou '*' para sair): ");
        char entrada[MAX_STRING_LENGTH];
        fgets(entrada, MAX_STRING_LENGTH, stdin);
        entrada[strcspn(entrada, "\n")] = '\0'; 
        
        if (strcmp(entrada, "*") == 0)
            break;
        
        char *token = strtok(entrada, " ");
        int elemento = 0;
        while (token != NULL && elemento < 2) {
            strcpy(ipcaLista[indicaIndiceIpca][elemento], token);
            token = strtok(NULL, " ");
            elemento++;
        }
        
        indicaIndiceIpca++;
    }
    
    // Cálculos
    double menorNumero = 10000.0;
    char menoIpca[MAX_STRING_LENGTH] = "";
    char maiorIpca[MAX_STRING_LENGTH] = "";
    double maiorNumero = 0.0;
    double soma = 0.0;
    double quantidade = 0.0;
    
    for (int i = 0; i < indicaIndiceIpca; i++) {
        double numero = atof(ipcaLista[i][1]);
        if (numero < menorNumero) {
            menorNumero = numero;
            strcpy(menoIpca, ipcaLista[i][0]);
        }
        if (numero > maiorNumero) {
            maiorNumero = numero;
            strcpy(maiorIpca, ipcaLista[i][0]);
        }
        quantidade++;
        soma += numero;
    }
    
    // Saída
    printf("A media e: %.2f\n", soma / quantidade);
    printf("O menor IPCA e seu respectivo mes/ano foi: %.2f %s\n", menorNumero, menoIpca);
    printf("O maior IPCA e seu respectivo mes/ano foi: %.2f %s\n", maiorNumero, maiorIpca);
    
    return 0;
}
