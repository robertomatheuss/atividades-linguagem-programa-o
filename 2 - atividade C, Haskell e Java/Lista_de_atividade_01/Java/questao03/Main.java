package Java.questao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero em Celsius para ser convertido em Fahrenheit:");
        Double numero = scan.nextDouble(); 

        Converte conversor = new Converte(numero);
        System.out.printf("O resultado da conversão do numero %.2f para Fahrenheit é: %.2f ",numero,conversor.celsiusParaFahrenheit());

    }
    
}
