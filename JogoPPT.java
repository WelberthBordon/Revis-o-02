import java.util.Scanner;

public class JogoPPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha: pedra, papel ou tesoura");
        String escolhaUsuario = scanner.next().toLowerCase();
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String escolhaComputador = opcoes[(int) (Math.random() * 3)];
        System.out.println("Computador escolheu: " + escolhaComputador);

        if (escolhaUsuario.equals(escolhaComputador)) {
            System.out.println("Empate!");
        } else if ((escolhaUsuario.equals("pedra") && escolhaComputador.equals("tesoura")) ||
                   (escolhaUsuario.equals("papel") && escolhaComputador.equals("pedra")) ||
                   (escolhaUsuario.equals("tesoura") && escolhaComputador.equals("papel"))) {
            System.out.println("Você ganhou!");
        } else {
            System.out.println("Você perdeu!");
        }
    }
}