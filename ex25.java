package prjLista02;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (!(numero == 0)) { 
            System.out.println("Número diferente de zero");
        } else {
            System.out.println("Número igual a zero");
        }

       
    }
}