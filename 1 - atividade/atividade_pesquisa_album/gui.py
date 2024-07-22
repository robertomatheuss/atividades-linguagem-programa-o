from tkinter import * 
from tkinter import messagebox,ttk

import domain 

def main():
   
   def pegaDadosParaAdicionar(x):
      nomeAlbum= textNomeAlbum.get()
      nomeBanda = textNomeBanda.get()
      autorLançamento = simOuNao.get()
      try:
            anoLancamento = int(textAnoLancamento.get())
      except:
            messagebox.showinfo(title="Não é numero",message="Digite um numero inteiro")
      domain.adicionaAlbum(nomeAlbum,nomeBanda,autorLançamento,anoLancamento)
      textNomeAlbum.delete(0,"end")
      textAnoLancamento.delete(0,"end")
      textNomeBanda.delete(0,"end")
      simOuNao.set("sim")
   
   def criaTela():
      windows = Toplevel()
      windows.title("Adicionar álbum")
      windows.geometry("700x380")
      windows.configure(background="#111111")
      labelTituloDoPrograma = Label(windows, text="Veja aqui seus álbuns", font="Arial 20",background="#1dd05d",foreground="#000000",width=20,borderwidth=3, relief="ridge")
      labelTituloDoPrograma.place(x=200,y=20)
      return windows
   
   def criaTreeview(window):
      apresentaTudo=ttk.Treeview(window,columns=("NomeAlbum","AnoLancamento","NomeBanda","AlbumLancamento"),show="headings")
      apresentaTudo.column("NomeAlbum",minwidth=80,width=140)
      apresentaTudo.column("AnoLancamento",minwidth=80,width=140)
      apresentaTudo.column("NomeBanda",minwidth=80,width=140)
      apresentaTudo.column("AlbumLancamento",minwidth=80,width=140)
      apresentaTudo.heading("NomeAlbum",text="Nome do album")
      apresentaTudo.heading("AnoLancamento",text="Ano de lançamento")
      apresentaTudo.heading("NomeBanda",text="Nome da Banda/Artista")
      apresentaTudo.heading("AlbumLancamento",text="Lançamento do artista")
      apresentaTudo.place(x=80,y=130)
      return apresentaTudo  
   
   def telaDadosCadastrados(x):    
     windowsLeitura = criaTela()
     listaComElementos = domain.coletaDados()  
     apresenta = criaTreeview(windowsLeitura)
     for (NomeAlbum,AnoLancamento,NomeBanda,AlbumLancamento) in listaComElementos:
            apresenta.insert("","end", values=(NomeAlbum,AnoLancamento,NomeBanda,AlbumLancamento))

   def telaBuscaAlbumNome(x):
      def apresentaBusca(x):
            apresenta = criaTreeview(windowsBuscaNome)  
            for (NomeAlbum,AnoLancamento,NomeBanda,AlbumLancamento) in listaComElementos:
                  if textBusca.get() in NomeAlbum:
                        apresenta.insert("","end", values=(NomeAlbum,AnoLancamento,NomeBanda,AlbumLancamento))
      windowsBuscaNome = criaTela()
      listaComElementos = domain.coletaDados()
      
      labelBuscaPorNome = Label(windowsBuscaNome, text="Faça uma pesquisa pelo nome:", font="Arial 12",background="#111111",foreground="#f7f7f7")
      labelBuscaPorNome.place(x=80, y=75)
      textBusca = Entry(windowsBuscaNome,text="Busca Nome", bd=3,width=25)
      textBusca.place(x=320,y=75)
      
      botaoBuscar = Button(windowsBuscaNome,text="Busca pelo nome", font="Arial 10",background="#1dd05d",foreground="#000000",width=15, 
            borderwidth=3, relief="ridge")
      botaoBuscar.bind('<Button-1>',apresentaBusca)
      botaoBuscar.place(x = 500, y= 75)

   def telaBuscaAlbumAno(x):
      def apresentaBusca(x):
        apresenta = criaTreeview(windowsBuscaAno)
        for (NomeAlbum,AnoLancamento,NomeBanda,AlbumLancamento) in listaComElementos:
            if momentoDoAno.get() == "Igual a":
               if int(textBusca.get()) == int(AnoLancamento):
                  apresenta.insert("","end", values=(NomeAlbum,AnoLancamento,NomeBanda,AlbumLancamento))
            elif momentoDoAno.get() == "Anterior a":
               if int(textBusca.get()) > int(AnoLancamento):
                  apresenta.insert("","end", values=(NomeAlbum,AnoLancamento,NomeBanda,AlbumLancamento))
            elif momentoDoAno.get() == "Posterior a":
               if int(textBusca.get()) < int(AnoLancamento):
                  apresenta.insert("","end", values=(NomeAlbum,AnoLancamento,NomeBanda,AlbumLancamento))
      windowsBuscaAno = criaTela()
      listaComElementos = domain.coletaDados()
      
      labelBuscaPorNome = Label(windowsBuscaAno, text="Faça uma pesquisa pelo nome:", font="Arial 12",background="#111111",foreground="#f7f7f7")
      labelBuscaPorNome.place(x=80, y=75)
      textBusca = Entry(windowsBuscaAno,text="Busca ano", bd=3,width=25)
      textBusca.place(x=320,y=75)
      
      botaoBuscar = Button(windowsBuscaAno,text="Busca pelo ano", font="Arial 10",background="#1dd05d",foreground="#000000",width=15, 
            borderwidth=3, relief="ridge")
      botaoBuscar.bind('<Button-1>',apresentaBusca)
      botaoBuscar.place(x = 500, y= 75)

      momentoDoAno = StringVar()
      momentoDoAno.set("Anterior a")
      buttonRadioAnterior = Radiobutton(windowsBuscaAno,text="Anterior a",variable=momentoDoAno,value="Anterior a", font="Arial 12",background="#111111",foreground="#f7f7f7")
      buttonRadioAnterior.place(x=200,y=105)
      buttonRadioPosterior = Radiobutton(windowsBuscaAno, text="Posterior a", variable=momentoDoAno, value="Posterior a", font="Arial 12",background="#111111",foreground="#f7f7f7")
      buttonRadioPosterior.place(x=300,y=105)
      buttonRadioIgual = Radiobutton(windowsBuscaAno, text="Igual a", variable=momentoDoAno, value="Igual a", font="Arial 12",background="#111111",foreground="#f7f7f7")
      buttonRadioIgual.place(x=410,y=105)

   windows = Tk()
   windows.title("Adicionar álbum")
   windows.geometry("530x390")
   windows.configure(background="#111111")

   labelTituloDoPrograma = Label(windows, text="Adicionador de álbum", font="Arial 20",background="#1dd05d",foreground="#000000",width=20, 
         borderwidth=3, relief="ridge")
   labelTituloDoPrograma.place(x=100,y=20)

   labelNomeAlbum = Label(windows, text="Nome do álbum: ", font="Arial 12",background="#111111",foreground="#f7f7f7")
   labelNomeAlbum.place(x=50,y=70)
   textNomeAlbum = Entry(windows,text="Nome Album", bd=3)
   textNomeAlbum.place(x=320,y=70)
   
   labelAnoLancamento = Label(windows, text="Ano de lançamento: ", font="Arial 12",background="#111111",foreground="#f7f7f7")
   labelAnoLancamento.place(x=50,y=100)
   textAnoLancamento = Entry(windows,text="Ano Lançamento", bd=3)
   textAnoLancamento.place(x=320,y=100)

   labelAnoLancamento = Label(windows, text="Nome da banda/artista: ", font="Arial 12",background="#111111",foreground="#f7f7f7")
   labelAnoLancamento.place(x=50, y=130)
   textNomeBanda = Entry(windows,text="Nome Banda", bd=3)
   textNomeBanda.place(x=320,y=130)

   labelAlbumLancamento = Label(windows, text="O álbum é o lançamento do artista: ", font="Arial 12",background="#111111",foreground="#f7f7f7")
   labelAlbumLancamento.place(x=50, y = 160)

   simOuNao = StringVar()
   simOuNao.set("sim")
   buttonRadioNao = Radiobutton(windows,text="Sim",variable=simOuNao,value="sim", font="Arial 12",background="#111111",foreground="#f7f7f7")
   buttonRadioNao.place(x=320,y=160)
   buttonRadioSim = Radiobutton(windows, text="Não", variable=simOuNao, value="nao", font="Arial 12",background="#111111",foreground="#f7f7f7")
   buttonRadioSim.place(x=380,y=160)

   botaoEnviar = Button(windows,text="Enviar novo álbum", font="Arial 13",background="#1dd05d",foreground="#000000",width=20, 
         borderwidth=3, relief="ridge")
   botaoEnviar.bind('<Button-1>', pegaDadosParaAdicionar)
   botaoEnviar.place(x = 154, y= 220)

   abrirJanelaLer = Button(windows,text="Todas as pastas", font="Arial 13",background="#1dd05d",foreground="#000000",width=20, 
         borderwidth=3, relief="ridge")
   abrirJanelaLer.bind('<Button-1>', telaDadosCadastrados)
   abrirJanelaLer.place(x = 154, y= 260)

   abrirJanelaBuscaNome = Button(windows,text="Buscar pasta pelo nome", font="Arial 13",background="#1dd05d",foreground="#000000",width=20, 
         borderwidth=3, relief="ridge")
   abrirJanelaBuscaNome.bind('<Button-1>', telaBuscaAlbumNome)
   abrirJanelaBuscaNome.place(x = 154, y= 300)

   abrirJanelaBuscaAno = Button(windows,text="Buscar pasta pelo ano", font="Arial 13",background="#1dd05d",foreground="#000000",width=20, 
         borderwidth=3, relief="ridge")
   abrirJanelaBuscaAno.bind('<Button-1>', telaBuscaAlbumAno)
   abrirJanelaBuscaAno.place(x = 154, y= 340)
   windows.mainloop()
   

if __name__ == "__main__":
   main()