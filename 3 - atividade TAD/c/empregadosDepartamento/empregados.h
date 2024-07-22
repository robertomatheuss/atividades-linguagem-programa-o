#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char *nome;
    int id;
    char *cargo;
    int salario;
    struct Departamento *departamento;
} Empregado;

Empregado *criarEmpregado(char *nome, int id, char *cargo,int salario){
    Empregado *novoEmpregado = (Empregado*)malloc(sizeof(Empregado));
    novoEmpregado-> nome = strdup(nome);
    novoEmpregado->id = id;
    novoEmpregado-> cargo = strdup(cargo);
    novoEmpregado->salario = salario;
    return novoEmpregado;
}

void liberarEmpregado(Empregado *empregado){
    free(empregado->nome);
    free(empregado->cargo);
    free(empregado->departamento);
    free(empregado);
}

void atualizaInformacaoPessoal(Empregado *empregado,char *nome,char *cargo,int salario){
    empregado->nome = nome;
    empregado->cargo = cargo;
    empregado->salario = salario;
}

void obterInformacaoDepartamento(Departamento *departamento){
   apresentaDepartamento(departamento);
}

void informacaoEmpregado(Empregado *empregado){
    printf("Empregado: nome=%s, id=%d, cargo=%s ,salario=%d",empregado->nome,empregado->id,empregado->cargo,empregado->salario);
}