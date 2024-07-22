package Lista_de_atividade_02.java.questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nascimento;
        String dataPassagem;
        String hasRG;
        String hasPassagem;
        Integer assento = 1;
        
        Scanner scan = new Scanner(System.in);  
        
        System.out.println("Qual é a quantidade de passageiros?");
        Integer quantidadePassageiros = scan.nextInt();
        
        int i =0;
        while(i < quantidadePassageiros){
            System.out.println("Tem RG:[S/N]");
            hasRG = scan.next();
            if(hasRG.equals("N")||hasRG.equals("n")){
                System.out.println("A saída é nessa direção");
                break;  
            }

            System.out.println("Tem Passagem:[S/N]");
            hasPassagem = scan.next();
            if(hasPassagem.equals("N")||hasPassagem.equals("n")){
                System.out.println("A recepção é nessa direção");
                break;  
            }    

            System.out.println("Digite sua data de nascimento: [DD/MM/AAAA]");
            nascimento = scan.next();        
            
            System.out.println("Digite a data de nascimento da sua passagem: [DD/MM/AAAA]");
            dataPassagem = scan.next();    
            
            if(!nascimento.equals(dataPassagem)){
                System.err.println("190");
                break;
            }
            System.out.println("O seu assento é A"+ assento+ ", Tenha um bom dia!");
            i++;
            assento++;
        }
    }
}