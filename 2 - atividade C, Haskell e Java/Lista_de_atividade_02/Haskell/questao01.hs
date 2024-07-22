import Data.List (elem)
import Data.Char (toUpper)

main :: IO ()
main = do
    putStrLn "Qual é a quantidade de passageiros?"
    quantidadePassageiros <- readLn
    checkPassageiros quantidadePassageiros 1

checkPassageiros :: Int -> Int -> IO ()
checkPassageiros 0 _ = return ()
checkPassageiros quantidadePassageiros assento = do
    putStrLn "Tem RG:[S/N]"
    hasRG <- getLine
    if elem (toUpper (head hasRG)) "N"
        then do
            putStrLn "A saída é nessa direção"
            return ()
        else do
            putStrLn "Tem Passagem:[S/N]"
            hasPassagem <- getLine
            if elem (toUpper (head hasPassagem)) "N"
                then do
                    putStrLn "A recepção é nessa direção"
                    return ()
                else do
                    putStrLn "Digite sua data de nascimento: [DD/MM/AAAA]"
                    nascimento <- getLine
                    putStrLn "Digite a data de nascimento da sua passagem: [DD/MM/AAAA]"
                    dataPassagem <- getLine
                    if nascimento /= dataPassagem
                        then do
                            putStrLn "190"
                            return ()
                        else do
                            putStrLn $ "O seu assento é A" ++ show assento ++ ", Tenha um bom dia!"
                            checkPassageiros (quantidadePassageiros - 1) (assento + 1)
