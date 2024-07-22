package Java.questao04;

public class VerificaMaioridade {
    public String verifica(Integer numero){
        if(numero >= 18){
            return "Maior";
        }else{
            return "Menor";
        }
    }
}