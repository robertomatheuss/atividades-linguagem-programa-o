newtype Departamento = Departamento(String,Int,String,Maybe [Empregado])

inicializaDepartamento :: String->Int->String->Maybe [Empregado]->Departamento
inicializaDepartamento nome id localizacao empregados= Departamento(nome,id,localizacao,empregados)

toStringDepartamento :: Departamento -> String
toStringDepartamento (Departamento(nome,id,localizacao,empregados))="Departamento: nome = "++nome++
    ", id = "++show id++
    ", localização = "++localizacao

newtype Empregado = Empregado (String,Int,String,Int,Departamento)

inicializaEmpregado :: String->Int->String->Int->Departamento->Empregado
inicializaEmpregado nome id cargo salario departamento= Empregado(nome,id,cargo,salario,departamento)

toStringEmpregado :: Empregado -> String
toStringEmpregado (Empregado(nome,id,cargo,salario,departamento)) ="Empregado:nome = "++nome++
    ", id = "++show id++
    ", cargo = "++cargo++
    ", salário = "++show salario++
    "\n"++  toStringDepartamento departamento;

atualizaInformacaoPessoal :: Empregado->String->String->Int->Empregado
atualizaInformacaoPessoal (Empregado(nome,id,cargo,salario,departamento)) novoNome novoCargo novoSalario= Empregado(novoNome,id,novoCargo,novoSalario,departamento)

obterInformacaoDepartamento:: Empregado->String
obterInformacaoDepartamento (Empregado(_,_,_,_,departamento))= toStringDepartamento departamento