newtype Peca = Peca (String,String,Int,Int)

inicializaPeca :: String->String->Int->Int->Peca
inicializaPeca tipo cor posicaoX posicaoY = Peca (tipo,cor,posicaoX,posicaoY)

obterInformacao:: Peca -> IO()
obterInformacao (Peca(tipo,cor,posicaoX,posicaoY)) = do
    putStrLn $ "O tipo de peça é " ++show tipo
    putStrLn $ "A cor da peça é " ++show cor
    putStrLn $ "a posição da peça é: x="++ show posicaoX++", y="++show posicaoY 

moverPeca :: Peca ->Int-> Int->Peca
moverPeca (Peca (tipo,cor,posicaoX,posicaoY)) novaPosicaoX novaPosicaoY = Peca(tipo,cor,novaPosicaoX,novaPosicaoY)    

capturaPecaAdversaria :: Peca -> Int -> Int -> Peca -> Peca
capturaPecaAdversaria pecaAdversaria posicaoX posicaoY minhaPeca =
    if posicaoX == getPosicaoX pecaAdversaria && posicaoY == getPosicaoY pecaAdversaria
    then moverPeca minhaPeca posicaoX posicaoY 
    else minhaPeca

getPosicaoX :: Peca -> Int
getPosicaoX  (Peca (_,_,posicaoX,_))= posicaoX 

getPosicaoY :: Peca -> Int
getPosicaoY  (Peca (_,_,_,posicaoY))= posicaoY 