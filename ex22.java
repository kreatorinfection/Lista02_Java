package prjLista02;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        System.out.print("Digite a frequência do aluno (em %): ");
        double frequencia = scanner.nextDouble();

        if (nota >= 6 && frequencia >= 75) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado");
        }

        scanner.close();
    }
}
