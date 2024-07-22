package Java.questao03;

public class Converte {
    private Double numero;
    public Converte (Double numero){
        this.numero = numero;
    }
    public Double celsiusParaFahrenheit(){
        Double resultado = (numero*1.8)+32;
        return resultado;
    }
}
