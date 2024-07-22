newtype Livro = Livro (String, String, String, Int)

inicializaLivro:: String->String->String->Int->Livro
inicializaLivro titulo autor anoPublicacao quantidadeCopia = Livro(titulo, autor, anoPublicacao, quantidadeCopia)

obterInformacao :: Livro -> IO()
obterInformacao(Livro (titulo,autor,anoPublicacao,_)) = do
    putStrLn $ "O titulo do livro é " ++show titulo
    putStrLn $ "O autor do livro é " ++show autor
    putStrLn $ "O ano de publicação do livro é "++ show anoPublicacao

verificarTemCopia :: Livro ->IO()
verificarTemCopia(Livro (_,_,_,quantidadeCopia)) = do
    if quantidadeCopia > 0 
    then putStrLn $ "Ainda tem "++ show quantidadeCopia ++ " cópias disponíveis"
    else putStrLn $ "Não tem mais cópias disponíveis"

emprestaCopia :: Livro -> Livro
emprestaCopia (Livro (titulo,autor,anoPublicacao,quantidadeCopia)) = Livro(titulo,autor,anoPublicacao,quantidadeCopia-1)

devolveCopia :: Livro -> Livro
devolveCopia (Livro (titulo,autor,anoPublicacao,quantidadeCopia)) = Livro(titulo,autor,anoPublicacao,quantidadeCopia+1)
