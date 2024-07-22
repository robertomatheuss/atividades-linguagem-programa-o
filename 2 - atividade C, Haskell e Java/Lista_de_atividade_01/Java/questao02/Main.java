package Java.questao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero:");
        Integer numero = scan.nextInt();
        
        Verifica resultado = new Verifica();
        System.out.printf("O numero é %s", resultado.verifica(numero));

    }
}
