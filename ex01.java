package prjLista02;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 20) {
            System.out.println("O número é maior que 20");
        } else {
            System.out.println("O número não é maior que 20");
        }

        
    }
}