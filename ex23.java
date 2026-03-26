package prjLista02;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade >= 60 || idade < 10) {
            System.out.println("A pessoa pode usar o atendimento prioritário");
        } else {
            System.out.println("A pessoa não pode usar o atendimento prioritário");
        }

        scanner.close();
    }
}