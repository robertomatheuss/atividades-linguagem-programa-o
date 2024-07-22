main :: IO ()
main = do
    putStrLn "Digite o primeiro número:"
    entrada1 <- getLine
    let num1 = read entrada1 :: Double

    putStrLn "Digite o segundo número:"
    entrada2 <- getLine
    let num2 = read entrada2 :: Double

    putStrLn ("Adição: " ++ show (num1 + num2))
    putStrLn ("Subtração: " ++ show (num1 - num2))
    putStrLn ("Multiplicação: " ++ show (num1 * num2))
    putStrLn ("Divisão: " ++ show (num1 / num2))
