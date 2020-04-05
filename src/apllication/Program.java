package apllication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		if (x>y) {
			System.out.println("O número " + x + " é o maior");
		}
		else if (x<y) {
			System.out.println("O número " + y + " é o maior");
		}else {
			System.out.println("Os números são iguais.");
		}
		
		sc.close();

	}

}
