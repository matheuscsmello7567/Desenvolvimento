
/* Atividade 14
 * João Papo-de-Pescador, homem de bem, comprou um
 * microcomputador para controlar o rendimento diário de seu trabalho.
 * Toda vez que ele traz um peso de peixes maior que o estabelecido
 * pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
 * pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
 * você faça um programa que leia a variável peso (peso de peixes) e
 * verifique se há excesso. Se houver, gravar na variável excesso e na
 * variável multa o valor da multa que João deverá pagar. Caso contrário
 * mostrar tais variáveis com o conteúdo ZERO.
 * Variáveis: double [peso, multa, excesso]
 */
import java.util.Scanner;

public class Atividade14 {

    public static void calculaPesoPesca(double peso) {
        double pesoExtra, multa = 4.00;
        if (peso > 50) {

            pesoExtra = peso - 50;
            multa = pesoExtra * multa;

            System.out.printf("\n\tMulta a ser paga: %.1f R$ \n\t%.2f Kg(s) excedente(s)", multa, pesoExtra);
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] Args) {
        double peso;
        Scanner scan = new Scanner(System.in);

        Atividade11.LimpaTela();
        System.out.println("Insira o peso total da mercadoria");
        System.out.printf("\tPeso: ");

        peso = scan.nextDouble();
        calculaPesoPesca(peso);

        scan.close();
    }
}
