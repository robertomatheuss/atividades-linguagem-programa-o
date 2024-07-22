package javaa.empregadosDepartamento;

public class Empregado{
    private String nome;
    private Integer id;
    private String cargo;
    private Integer salario;
    private Departamento departamento;

    public Empregado(String nome,Integer id,String cargo,Integer salario,Departamento departamento){
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
        departamento.adicionaEmpregado(this);
    }

    public void atualizaInformacaoPessoal(String nome,String cargo,Integer salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void tranfereDepartamento(Departamento novoDepartamento){
        this.departamento = novoDepartamento;        
    }
    public void obterInformacaoDepartamento(){
        System.out.println(departamento);
    }
    @Override
    public String toString() {
        return "Empregado:"+
                "nome = "+nome+
                ", id = "+ id+
                ", cargo = "+cargo+
                ", salário = "+ salario+
                ", departamento = " +departamento.getNome();
    }
}