import System.IO

main :: IO ()
main = do
    putStrLn "Digite um numero para saber se é impar ou par:"
    entrada1 <- getLine
    let num1 = read entrada1 :: Int

    if even num1
        then putStrLn "O numero é par" 
        else putStrLn "O numero é impar"