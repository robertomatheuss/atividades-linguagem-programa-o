#include <stdio.h>

float celsiusForFahrenheit(float celsius);

int main(){
    float celsius;
    float result;
    printf("Digite uma temperatura em Celsius: ");
    scanf("%f", &celsius);

    result = celsiusForFahrenheit(celsius);
    printf("Sua temperatura em Fahrenheit: %.2f", result);
    return 0;
}

float celsiusForFahrenheit(float celsius){
    float fahrenheit = celsius*1.80+32;
  
    return fahrenheit;
}