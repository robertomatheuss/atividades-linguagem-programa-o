#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define QUANTIDADE_DE_QUESTOES 10
#define QUANTIDADE_DE_ALUNOS 2
#define MAX_STRING_LENGTH 50

int main() {
    int gabarito[QUANTIDADE_DE_QUESTOES];
    char alunos[QUANTIDADE_DE_ALUNOS][MAX_STRING_LENGTH];
    int notas[QUANTIDADE_DE_ALUNOS];
    
    // Entrada
    printf("Informe o gabarito:\n");
    for (int i = 0; i < QUANTIDADE_DE_QUESTOES; i++) {
        printf("Gabarito da %d alternativa: ", i + 1);
        scanf("%d", &gabarito[i]);
    }

    // Entrada das notas dos alunos
    for (int i = 0; i < QUANTIDADE_DE_ALUNOS; i++) {
        printf("\nInforme o nome do aluno %d: ", i + 1);
        scanf("%s", alunos[i]);
        notas[i] = 0;

        for (int j = 0; j < QUANTIDADE_DE_QUESTOES; j++) {
            int escolha;
            printf("Informe a resposta da %dª questão para %s: ", j + 1, alunos[i]);
            scanf("%d", &escolha);
            
            if (escolha == gabarito[j]) {
                notas[i]++;
            }
        }
    }
    
    // Ordem alfabética
    printf("\nLista dos alunos em ordem alfabética:\n");
    for (int i = 0; i < QUANTIDADE_DE_ALUNOS; i++) {
        printf("Aluno: %s, Nota: %d\n", alunos[i], notas[i]);
    }

    // Exibição das duas melhores notas
    printf("\nDuas melhores notas:\n");
    for (int i = 0; i < 2; i++) {
        int index = 0;
        int maxNota = 0;
        
        for (int j = 0; j < QUANTIDADE_DE_ALUNOS; j++) {
            if (notas[j] > maxNota) {
                maxNota = notas[j];
                index = j;
            }
        }
        
        printf("Aluno: %s, Nota: %d\n", alunos[index], notas[index]);
        notas[index] = -1; 
    }

    // Exibição das duas piores notas
    printf("\nDuas piores notas:\n");
    for (int i = 0; i < 2; i++) {
        int index = 0;
        int minNota = QUANTIDADE_DE_QUESTOES;
        
        for (int j = 0; j < QUANTIDADE_DE_ALUNOS; j++) {
            if (notas[j] < minNota && notas[j] >= 0) {
                minNota = notas[j];
                index = j;
            }
        }
        
        printf("Aluno: %s, Nota: %d\n", alunos[index], notas[index]);
        notas[index] = QUANTIDADE_DE_QUESTOES + 1; // Para não considerar essa nota novamente
    }

    // Alunos com mais de 50% de acerto
    printf("\nAlunos com mais da metade das questões certas:\n");
    for (int i = 0; i < QUANTIDADE_DE_ALUNOS; i++) {
        if (notas[i] > QUANTIDADE_DE_QUESTOES / 2) {
            printf("Aluno: %s, Nota: %d\n", alunos[i], notas[i]);
        }
    }

    return 0;
}
