package components;

public class CadastroComponent {

    public void limparTerminal() {
        System.out.print("\033[H\033[2J"); // Sequência ANSI para limpar o terminal
        System.out.flush();
    }
}
