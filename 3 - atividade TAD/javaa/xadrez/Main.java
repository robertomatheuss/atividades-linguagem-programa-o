package javaa.xadrez;

public class Main {
    public static void main(String[] args) {
        //cria tabuleiro
        Peca[][] tabuleiro= new Peca[8][8]; 
        //adiciona peças
        Peca peca = new Peca("rei", "preto", 1, 1);
        Peca pecaAdversaria = new Peca("peao", "branco", 8, 8);
        //adiciona peças no tabuleiro
        tabuleiro[peca.getPosicaoX()-1][peca.getPosicaoY()-1]= peca;
        tabuleiro[pecaAdversaria.getPosicaoX()-1][pecaAdversaria.getPosicaoY()-1]= pecaAdversaria;
        //print um tabuleiro
        for(Peca[] linha : tabuleiro){
            for(Peca pecaFor : linha){
                if(pecaFor != null)
                System.out.print(pecaFor.getTipo()+" "+pecaFor.getCor()+" "+pecaFor.getStatusPeca() + "   |   ");
                else
                System.err.print("null   |   ");
            }
            System.out.println();
        }
        //mata a peça
        peca.capturaPecaAdversaria(pecaAdversaria, 8, 8);
        //Informação da peça viva       
        peca.obterInformacao();
        //Informação da peça morta
        pecaAdversaria.obterInformacao();
    }
}