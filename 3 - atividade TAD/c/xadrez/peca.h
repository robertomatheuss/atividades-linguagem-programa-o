#include <stdio.h>
#include <string.h>
#include <stdbool.h>

typedef struct {
    char *tipo;
    char *cor;
    char *statusPeca;
    int posicaoX;
    int posicaoY;
}Peca;

Peca *criarPeca(char *tipo,char *cor,int posicaoX,int posicaoY){
    Peca *novaPeca = (Peca*)malloc(sizeof(Peca));
    novaPeca->tipo=strdup(tipo);
    novaPeca->cor = strdup(cor);
    novaPeca->statusPeca = strdup("vivo");
    novaPeca->posicaoX = posicaoX;
    novaPeca->posicaoY=posicaoY;
    return novaPeca;
}

void liberarPeca(Peca *peca) {
    free(peca->tipo);
    free(peca->cor);
    free(peca->statusPeca);
    free(peca);
}

bool verificaStatusPeca(Peca *statusPeca){
    int resultado = strcmp(statusPeca, "vivo");
    if(resultado == 0){
        return true;
    }else{
        return false;
    }
}

void moverPeca(Peca *peca,int posicaoX,int posicaoY){
    if(verificaStatusPeca(peca->statusPeca)){
        peca->posicaoX = posicaoX;
        peca->posicaoY = posicaoY;
    }else{
        printf("A peça já morreu");
    }
}

void capturarPecaAdversaria(Peca *peca,Peca *pecaAdversaria,int posicaoX,int posicaoY){
    if(pecaAdversaria->posicaoX == posicaoX && pecaAdversaria->posicaoY == posicaoY){
        moverPeca(peca,posicaoX,posicaoY);
        pecaAdversaria->statusPeca = "morto";
    }else{
        printf("A peça não foi capturada");
    }
}

void obterInformacao(Peca *peca){
    if(strcmp(peca->statusPeca,"vivo")==0){
        printf("O tipo da peça é %s\n", peca->tipo);
        printf("A cor da peça é %s\n", peca->cor);
        printf("A posição da peça é: x = %d, y = %d\n", peca->posicaoX, peca->posicaoY);
    } else {
        printf("A peça está %s\n", peca->statusPeca);
    }
}