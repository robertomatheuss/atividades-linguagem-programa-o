package javaa.xadrez;

public class Peca {
    private String tipo;
    private String cor;
    private String statusPeca;//"vivo" ou "morto"
    private int posicaoX;
    private int posicaoY;

    public Peca(String tipo,String cor,int posicaoX,int posicaoY){
        this.tipo = tipo;
        this.cor = cor;
        statusPeca = "vivo";
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public boolean verificaStatusPeca(){
        if(statusPeca.equals("vivo"))
            return true;
        else
            return false;
    }

    public void moverPeca(int posicaoX,int posicaoY){
        if(verificaStatusPeca()){
            this.posicaoX = posicaoX;
            this.posicaoY = posicaoY;
        }else{ 
            System.out.println("A peça já morreu");   
        }
    }

    public void capturaPecaAdversaria(Peca pecaAdversaria,int posicaoX,int posicaoY){
        if(pecaAdversaria.posicaoX == posicaoX && pecaAdversaria.posicaoY == posicaoY){
            moverPeca(posicaoX, posicaoY);
            pecaAdversaria.statusPeca = "morto";
        }else{ 
            System.out.println("A peça não foi capturada");   
        }
    };
    public void obterInformacao(){
        if(statusPeca.equals("vivo")){
            System.out.println("O tipo da peça é "+ tipo);
            System.out.println("A cor da peça é "+ cor);
            System.out.println("A posição da peça é: x ="+posicaoX+", y = "+posicaoY );
        }else{
            System.out.println("A peça está "+ statusPeca);
        }
    };

    public int getPosicaoX() {
        return posicaoX;
    }
    public int getPosicaoY() {
        return posicaoY;
    }
    public String getTipo() {
        return tipo;
    }
    public String getCor() {
        return cor;
    }
    public String getStatusPeca() {
        return statusPeca;
    }
}