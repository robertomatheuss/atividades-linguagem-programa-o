package Java.questao05;

import java.util.List;

public class CalculaMedia {
    public Integer calculaMedia(List<Integer> numeros,List<Integer> pesos){
        Integer resultado = ((numeros.get(0)*pesos.get(0))+(numeros.get(1)*pesos.get(1))+(numeros.get(2)*pesos.get(2)))/(pesos.get(0)+pesos.get(1)+pesos.get(2));
        return resultado;
    }
}
