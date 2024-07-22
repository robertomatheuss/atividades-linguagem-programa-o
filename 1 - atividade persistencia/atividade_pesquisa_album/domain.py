from tkinter import * 

from gui import *
import db

def adicionaAlbum(nomeAlbum,nomeBanda,autorLançamento,anoLancamento):
    db.escreveArquivo(nomeAlbum,nomeBanda,autorLançamento,anoLancamento)
    
def coletaDados():
    linha = db.lerArquivo()
    del linha[-1]
    listaComElementos= []
    for elemento in linha:
        listaComElementos.append(elemento.split("|"))
    return listaComElementos