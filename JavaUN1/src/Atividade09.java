/* Atividade 09
 * Faça um Programa que peça a temperatura em graus Farenheit,
 * transforme e mostre a temperatura em graus Celsius.
 * °C = (5 * (F-32) / 9).
 * Variáveis: Double [celcius, fahrenheit]
 */

import java.util.Scanner;

public class Atividade09{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String Args[]){
        double celcius, fahrenheit;
        Scanner scan = new Scanner(System.in);
        System.out.println("Conversor de temperatura [Fahrenheit >> Celcius]");

        System.out.printf("\n\tDigite a temperatura em Fahrenheit (°C): ");
        fahrenheit = scan.nextDouble();

        celcius = (5 * (fahrenheit - 32) / 9);
        System.out.printf("\n\t%.1f°C é equivalente a %.1f°F", fahrenheit, celcius);
        
        scan.close();
    }
}