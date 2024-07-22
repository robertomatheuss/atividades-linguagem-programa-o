celsiusForFahrenheit :: Double -> Double
celsiusForFahrenheit celsius = (celsius*1.80)+32


main :: IO ()
main = do
    putStrLn "Digite uma temperatura em Celsius para ser convertida:"
    entrada <- getLine
    let celsius = read entrada :: Double

    let temperaturaFahrenheit = celsiusForFahrenheit celsius

    putStrLn ("Em Fahrenheit: " ++ show (temperaturaFahrenheit))