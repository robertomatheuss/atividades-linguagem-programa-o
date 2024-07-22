#include <stdio.h>
#include <string.h>
#include <stdbool.h>

typedef struct {
    char *titulo;
    char *autor;
    char *anoPublicacao;
    int quantidadeCopia;
}Livro;

Livro *criaLivro(char *titulo,char *autor,char *anoPublicacao,int quantidadeCopia){
    Livro *novoLivro = (Livro*)malloc(sizeof(Livro));
    novoLivro->titulo=titulo;
    novoLivro->autor=autor;
    novoLivro->anoPublicacao=anoPublicacao;
    novoLivro->quantidadeCopia=quantidadeCopia;
    return novoLivro;
}

void obterInformacao(Livro *livro){
    printf("O titulo do livro e: %s\n",livro->titulo);
    printf("O autor do livro e: %s \n",livro->autor);
    printf("O ano de publicacao e: %s\n",livro->anoPublicacao);
}

void verificaTemCopia(Livro *livro){
    if(livro->quantidadeCopia > 0){
        printf("Ainda tem %d cópias disponíveis", livro->quantidadeCopia);
    }else{
        printf("Não tem mais copias disponíveis");
    }
}
void emprestaCopia(Livro *livro){livro->quantidadeCopia--;};
void devolveCopia(Livro *livro){livro->quantidadeCopia++;};