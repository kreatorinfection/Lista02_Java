package prjLista02;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("A pessoa é maior de idade");
        } else {
            System.out.println("A pessoa é menor de idade");
        }

        
    }
}
