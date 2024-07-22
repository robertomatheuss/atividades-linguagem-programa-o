package Java.questao04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade para saber se você é maior de idade: ");
        Integer numero = scan.nextInt(); 

        VerificaMaioridade resultado = new VerificaMaioridade();
        System.out.printf("Você é de %s",resultado.verifica(numero));

    }
}
