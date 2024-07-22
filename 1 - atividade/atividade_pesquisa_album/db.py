fileData = "Albuns.txt"

def escreveArquivo(nomeAlbum,nomeBanda,autorLançamento,anoLancamento):
    fileAddData = open(fileData,"a")
    fileAddData.write(f"{nomeAlbum}|{anoLancamento}|{nomeBanda}|{autorLançamento}\n")
    fileAddData.close()

def lerArquivo():
    file = open(fileData,"r")
    linhaLida = file.read().split("\n")
    return linhaLida