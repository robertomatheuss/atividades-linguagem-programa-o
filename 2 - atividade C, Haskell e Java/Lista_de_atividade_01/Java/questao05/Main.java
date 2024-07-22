package Java.questao05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<Integer>();
        List<Integer> pesos = new ArrayList<Integer>();
        for(int x =1; x <4;x++) {
            System.out.println("Digite o "+x+"° numero e seu respectivo peso");
            System.out.print("Numero:");
            Integer numero = scan.nextInt();
            System.out.print("Peso:");
            Integer peso = scan.nextInt();
            numeros.add(numero);
            pesos.add(peso);
        }

        CalculaMedia media = new CalculaMedia();
        System.out.println("A média ponderada é: "+ media.calculaMedia(numeros, pesos));
        
    }
}
