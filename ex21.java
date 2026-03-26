package prjLista02;

import java.util.Scanner;

public class ex21 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a idade: ");
	        int idade = scanner.nextInt();

	        if (idade >= 18 && idade < 70) {
	            System.out.println("A pessoa pode tirar a carteira de motorista");
	        } else {
	            System.out.println("A pessoa não pode tirar a carteira de motorista");
	        }

	    
	    }
	}
