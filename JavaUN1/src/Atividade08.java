/* Atividade 08
 * Faça um Programa que pergunte quanto você ganha por hora e o
 * número de horas trabalhadas no mês. Calcule e mostre o total do seu
 * salário no referido mês.
 * Váriaveis: Double [valorHora, salario]; Int [horasTrabalhadas]
 */

import java.util.Scanner;

public class Atividade08 {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String Agrs[]){
        double valorHora, salario;
        int horasTrabalhadas;
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculo de salário mensal");
        System.out.printf("\n\tInforme o valor de horas trabalhadas no mês: ");
        horasTrabalhadas = scan.nextInt();

        System.out.printf("\tInforme o valor da hora trabalhada: ");
        valorHora = scan.nextDouble();
        salario = valorHora * horasTrabalhadas;

        System.out.println("O valor mensal é: " + salario);
        scan.close();
    }
}
