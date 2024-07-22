mediaPonderada :: Float -> Float -> Float -> Float -> Float -> Float -> Float
mediaPonderada nota1 peso1 nota2 peso2 nota3 peso3 = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3)

main = do
    putStrLn "Insira a primeira nota:"
    input1 <- getLine
    let nota1 = read input1 :: Float
    
    putStrLn "Insira o peso da primeira nota:"
    input2 <- getLine
    let peso1 = read input2 :: Float
    
    putStrLn "Insira a segunda nota:"
    input3 <- getLine
    let nota2 = read input3 :: Float
    
    putStrLn "Insira o peso da segunda nota:"
    input4 <- getLine
    let peso2 = read input4 :: Float
    
    putStrLn "Insira a terceira nota:"
    input5 <- getLine
    let nota3 = read input5 :: Float
    
    putStrLn "Insira o peso da terceira nota:"
    input6 <- getLine
    let peso3 = read input6 :: Float
    
    let media = mediaPonderada nota1 peso1 nota2 peso2 nota3 peso3
    putStrLn ("A média ponderada das notas é: " ++ show media)
