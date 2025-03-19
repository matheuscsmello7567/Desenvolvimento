/* Atividade 05
 * Faça um Programa que converta metros para centímetros.
 * variáveis: Double [metro, centimetro]
 */

import java.util.Scanner;

public class Atividade05 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String Args[]){
        Scanner scan = new Scanner(System.in);
        double metro, centimetro;
        System.out.println("Conversor de metros em centímetros");
        
        System.out.printf("\n\tDigite o valor em metros: ");
        metro = scan.nextDouble();
        centimetro = metro * 100;

        System.out.println("\tO valor em centímetros é: " + centimetro);
        scan.close();
    }
}
