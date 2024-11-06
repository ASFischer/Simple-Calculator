package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		
		double result;
		double x, y;
		int operation;
		
		do {
		
		System.out.println("Simple Calculator:");
		System.out.println("-------//--------");
		System.out.println("Addition - 1");
		System.out.println("-----------------");
		System.out.println("Subtraction - 2");
		System.out.println("-----------------");
		System.out.println("Division - 3");
		System.out.println("-----------------");
		System.out.println("Multiplication - 4");
		System.out.println("-----------------");
		System.out.println("Close - 5");
		
		operation = sc.nextInt();
		
		switch (operation) {
		
		case 1:
			System.out.println("Digite o x e y:");
			x = sc.nextDouble();
			y = sc.nextDouble();
			result = x + y;
			System.out.println("Resultado = " + result);
			break;
			
		case 2:
			System.out.println("Digite o x e y:");
			x = sc.nextDouble();
			y = sc.nextDouble();
			result = x - y;
			System.out.println("Resultado = " + result);
			break;
			
		case 3:
			System.out.println("Digite o x e y:");
			x = sc.nextDouble();
			y = sc.nextDouble();
			result = x / y;
			if (x == 0 || y == 0) { 
				System.out.println("Operação inválida.");
			} else {
			System.out.println("Resultado = " + result);
			}
			break;
			
		case 4:
			System.out.println("Digite o x e y:");
			x = sc.nextDouble();
			y = sc.nextDouble();
			result = x * y;
			if (x == 0 || y == 0) { 
				System.out.println("Operação inválida.");
			} else {
			System.out.println("Resultado = " + result);
			}
			break;
			
		case 5:
			System.out.println("Adeus!");
			break;
		}
		
		if (operation != 5){
			System.out.println("Press Enter to continue:");
			sc.nextLine();
			sc.nextLine();
		}
		
		} while (operation != 5);
		
		sc.close();
	}
}
