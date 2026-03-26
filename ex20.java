package prjLista02;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("A pessoa é maior de idade");

            if (idade >= 65) {
                System.out.println("A pessoa pode se aposentar");
            } else {
                System.out.println("A pessoa ainda não pode se aposentar");
            }
        } else {
            System.out.println("A pessoa é menor de idade");
        }

        
    }
}
