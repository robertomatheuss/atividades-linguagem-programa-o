package javaa.gerenciamentoDeBiblioteca;

public class Livro{
    private String titulo;
    private String autor;
    private String anoPublicacao;
    private Integer quantidadeCopia;

    public Livro(String titulo,String autor,String anoPublicacao,Integer quantidadeCopia){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeCopia = quantidadeCopia;
    }

    public void obterInformacao(){
        System.out.println("O título do livro é "+ titulo);
        System.out.println("O autor do livro é "+ autor);
        System.out.println("O ano de publicação do livro é "+ anoPublicacao);
    }

    public void verificarTemCopia(){
        if(quantidadeCopia >= 0)
            System.out.println("Ainda tem "+ quantidadeCopia+ " cópias disponíveis");
        else
            System.out.println("Não tem mais copias disponíveis");
    }
    
    public void emprestaCopia(){quantidadeCopia--;};
    public void devolveCopia(){quantidadeCopia++;};
}