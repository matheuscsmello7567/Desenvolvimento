/* Atividade 10
 * Faça um Programa que peça a temperatura em graus Celsius,
 * transforme e mostre em graus Farenheit.
 */
import java.util.Scanner;

public class Atividade10{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String Args[]){
        double celcius, fahrenheit;
        Scanner scan = new Scanner(System.in);
        System.out.println("Conversor de temperatura [Celcius >> Fahrenheit]");

        System.out.printf("\n\tDigite a temperatura em Celcius (°C): ");
        celcius = scan.nextDouble();

        fahrenheit = (celcius * 9/5) + 32;
        System.out.printf("\n\t%.1f°C é equivalente a %.1f°F", celcius, fahrenheit);
        
        scan.close();
    }
}
