package prjLista02;

import java.util.Scanner;

public class ex17 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a idade: ");
	        int idade = scanner.nextInt();

	        if (idade >= 18) {
	            System.out.println("A pessoa é maior de idade");

	            if (idade > 60) {
	                System.out.println("Além disso, a pessoa tem mais de 60 anos");
	            }
	        } else {
	            System.out.println("A pessoa é menor de idade");
	        }

	       
	    }
	}