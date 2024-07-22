package Java.questao01;

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        Double primeiroNumero = scan.nextDouble();
        
        System.out.println("Digite o segundo numero:");
        Double segundoNumero = scan.nextDouble();

        Calculadora calculadora = new Calculadora(); 

        System.out.printf("A soma é %.2f\n",calculadora.soma(primeiroNumero, segundoNumero));
        System.out.printf("A subtração é %.2f\n",calculadora.subtrai(primeiroNumero, segundoNumero));
        System.out.printf("A multiplicação é %.2f\n",calculadora.multiplica(primeiroNumero, segundoNumero));
        System.out.printf("A divisão é %.2f\n",calculadora.divide(primeiroNumero, segundoNumero));
    }
}