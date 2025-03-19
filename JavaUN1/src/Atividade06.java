/* Atividade 06
 * Faça um Programa que peça o raio de um círculo, calcule e mostre
 * sua área.
 * Variáveis: Double [raio, area]
 */

import java.util.Scanner;

public class Atividade06 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String Args[]){
        double raio,area;
        Scanner scan = new Scanner(System.in);
        System.out.println("Calcule a área de uma circunferência");

        System.out.printf("\n\tDigite o raio da circunferência em metros: ");
        raio = scan.nextDouble();

        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("\tA área da circunfêrencia é: %.1f", area);
        
        scan.close();
    }
}
