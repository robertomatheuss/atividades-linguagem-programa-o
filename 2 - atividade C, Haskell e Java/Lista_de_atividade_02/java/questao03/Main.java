package Lista_de_atividade_02.java.questao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Double GAMEPRICE = 19.9;
        Integer quantidadeVendida;  
        Double bonus = 0.0;
        Double faturamentoPessoal;
        Double salario;
        Double salarioComBonus;
        
        try(Scanner scan = new Scanner(System.in)){
        

        System.out.println("Quantos jogos foram vendidos esse mês: ");
        quantidadeVendida = scan.nextInt();
        faturamentoPessoal =quantidadeVendida*GAMEPRICE;
        salario=faturamentoPessoal*0.5;
        
        while(quantidadeVendida >=15){
            bonus = bonus+(15*GAMEPRICE*0.08);
            quantidadeVendida -=15;
        }
        salarioComBonus = salario+bonus;

        System.out.printf("O valor arrecadado em vendas foi de: %.2f\n",faturamentoPessoal);
        System.out.printf("O valor ganho como bonus: %.2f\n",bonus);
        System.out.printf("O valor que recebera no mes é de: %.2f",salarioComBonus);
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
