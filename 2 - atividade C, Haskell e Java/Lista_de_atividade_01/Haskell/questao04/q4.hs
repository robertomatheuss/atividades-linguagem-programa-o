main :: IO ()
main = do
    putStrLn "Digite sua Idade:"
    entrada <- getLine
    let idade = read entrada :: Int

    if idade >= 18
        then putStrLn ("Você é de maior")
        else putStrLn ("Você é de menor")