def main():
    while True:
        askAddOrRead =int(input("1 - Para adicionar pessoa\n" +
                                "2 - Para ler arquivo\n" +
                                "3 - Para pesquisar pelo sexo\n" +
                                "4 - Para pesquisar pelo nome: \n" +
                                "Selecionar: "))

        if askAddOrRead == 1:
            formAddPersonInFile()
        elif(askAddOrRead == 2):
            readFilePerson()       
        elif(askAddOrRead == 3):
            askSexo = input("Qual o sexo que você quer pesquisar:[M/F] ").upper()
            searchPersonForSexo(askSexo)
        elif(askAddOrRead == 4):
            askName = input("Qual o nome que você quer pesquisar: ").upper()
            searchPersonForName(askName)
        else:
            break   

def formAddPersonInFile():
    while True:
        namePerson = input("Qual é o nome da pessoa?[0 - Para encerrar o programa] ")
        if(namePerson == "0"):
            break
        else:
            agePerson = input("Qual é a idade da pessoa? ")
            sexPerson = input("Qual é o sexo da pessoa?[M/F] ").upper()
            telephonePerson = input("Qual é o telefone da pessoa: ")
            fileAddPerson = open("person.txt","a")
            fileAddPerson.write("Nome: "+namePerson+"|" + "Idade :"+agePerson+" anos"+"|"+"Sexo :"+sexPerson+"|"+"Telefone :"+ telephonePerson+"|\n")
            break

def readFilePerson():
    filePerson = open("linguagem-programacao-LNPG/atividade_persistencia/person.txt","r")
    fileReadPerson = filePerson.read()    
    listElements = fileReadPerson.split("|")
    
    for elemento in listElements:
        if("Sexo :M" in elemento):
            elemento = "Sexo :Masculino"
        if("Sexo :F" in elemento):
            elemento = "Sexo :Feminino"
        print(elemento)

def searchPersonForSexo(sexo):
    if sexo == "M":
        sexo ="Sexo :M"
    elif sexo == "F":
        sexo = "Sexo :F"
    devolveListaPronta()
    for linha in listLineAndElementSeparated:
        if(linha[2] == sexo):
            print(linha)
        elif (linha[2] == sexo):
            print(linha)
                    
def searchPersonForName(name):
    devolveListaPronta()
    for linha in listLineAndElementSeparated:
        capitalLine=linha[0].upper()
    
        if name in capitalLine:
            print(linha)

def devolveListaPronta():
    filePerson = open("linguagem-programacao-LNPG/atividade_persistencia/person.txt","r")
    fileReadPersonAndSeparatedLine = filePerson.read().split("\n")
    del fileReadPersonAndSeparatedLine[-1]
    for linha in fileReadPersonAndSeparatedLine:
        listLineAndElementSeparated.append(linha.split("|"))
    for ult in listLineAndElementSeparated:
        ult.pop(-1)

listLineAndElementSeparated = []

main()