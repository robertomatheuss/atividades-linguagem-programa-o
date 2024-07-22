package javaa.empregadosDepartamento;

import java.util.ArrayList;

public class Departamento {

    private String nome;
    private Integer id;
    private String localizacao;
    private ArrayList<Empregado> listEmpregados = new ArrayList<>();
    
    public Departamento(String nome,Integer id,String localizacao){
        this.nome = nome;
        this.id = id;
        this.localizacao=localizacao;
    }
    public void adicionaEmpregado(Empregado empregado){
        listEmpregados.add(empregado);
    }

    public void removeEmpregado(Empregado empregado){
        listEmpregados.remove(empregado);
    }

    public void apresentaListaEmpregados(){
        System.out.println("Lista de empregados: ");
        for(Empregado empregado: listEmpregados){
            System.out.println(empregado);
        }
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Departamento:"+
                "nome = "+nome+
                ", id = "+ id+
                ", localizacao = "+localizacao;
    }
}