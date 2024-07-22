typedef struct Departamento{
    char *nome;
    int id;
    char *localizacao;
}Departamento;

Departamento *criarDepartamento(char *nome,char *localizacao,int id){
    Departamento *novoDepartamento = (Departamento*)malloc(sizeof(Departamento));
   
    novoDepartamento->nome = strdup(nome);
    novoDepartamento->id = id;
    novoDepartamento->localizacao = strdup(localizacao);
    return novoDepartamento;
}
void liberarDepartamento(Departamento *departamento){
    free(departamento->nome);
    free(departamento->localizacao);
    free(departamento);
}
void apresentaDepartamento(Departamento *departamento){
    printf("Departamento: nome = %s, id = %d, localização = %s",departamento->nome,departamento->id,departamento->localizacao);
}   