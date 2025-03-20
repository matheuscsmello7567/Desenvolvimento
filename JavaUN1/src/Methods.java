/* Arquivo para armazenamento de métodos reutilizáveis
 * Métodos
 * -> LimpaTela() / LimpaTelaReply()
 * Método que limpa o terminal para melhor visualização
 */
public class Methods {
    
    public static void LimpaTela() {
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public static void LimpaTelaReply() {
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Tela limpa!");
        }
    }

}
