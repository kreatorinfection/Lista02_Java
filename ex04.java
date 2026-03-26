package prjLista02;

import java.util.Scanner;

public class ex04 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a idade: ");
	        int idade = scanner.nextInt();

	        if (idade >= 60) {
	            System.out.println("A pessoa tem 60 anos ou mais");
	        } else {
	            System.out.println("A pessoa tem menos de 60 anos");
	        }

	        
	    }
	}
