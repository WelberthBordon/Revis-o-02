import java.util.Scanner;

public class Aprovação{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        
        if (nota >= 60) { // Considerando 60 como nota mínima para aprovação
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}