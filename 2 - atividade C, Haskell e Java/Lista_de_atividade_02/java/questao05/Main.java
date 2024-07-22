import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //[numero de ipca][{mes/ano IPCA}]
        String[][] ipcaLista = new String[20][2];
        try(Scanner scan = new Scanner(System.in)) {
            //Entrada
            int indicaIndiceIpca =1;
            while (indicaIndiceIpca < 21) {
                System.out.println("Informe o mês o ano e o IPCA respectivo: [Informe na ordem]");           
                String entrada = scan.nextLine().replace(',', '.'); 
                String[] separada=entrada.split(" ");
                if(entrada.equals("*"))
                    break;
                for(int elemento=0;elemento< separada.length;elemento++){
                    ipcaLista[indicaIndiceIpca -1][elemento]=separada[elemento];
                }
                indicaIndiceIpca++;
            }        
        } catch (Exception e) {
            System.out.println(e.getMessage());     
            e.printStackTrace();       
            
        }
        //Saída
        Double menorNumero = 10000.0;
        String menoIpca = "";
        String maiorIpca = "";
        Double maiorNumero = 0.0;
        Double soma = 0.0;
        Double quantidade = 0.0;
        for(String[] numeroIpca : ipcaLista){
            for(int i =0;i< numeroIpca.length;i++){
                if(numeroIpca[i] == null)
                    break;
                Double numero=Double.valueOf(numeroIpca[1]).doubleValue();
                if(numero<menorNumero){
                    menorNumero = numero;
                    menoIpca = numeroIpca[0];
                }
                if(numero>maiorNumero){
                    maiorNumero = numero;
                    maiorIpca = numeroIpca[0];
                }        
                quantidade++;
                soma += numero;           
            }
        }
        System.out.printf("A média é: %.2f\n", soma/quantidade);
        System.out.println("O menor ipca e seu respectivo mês foi: "+menorNumero+ " "+menoIpca);
        System.out.println("O maior ipca e seu respectivo mês foi: "+maiorNumero+ " "+ maiorIpca);
    }
}