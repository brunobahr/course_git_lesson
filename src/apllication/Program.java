package apllication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		if (x>y) {
			System.out.println("O n�mero " + x + " � o maior");
		}
		else if (x<y) {
			System.out.println("O n�mero " + y + " � o maior");
		}else {
			System.out.println("Os n�meros s�o iguais.");
		}
		
		sc.close();

	}

}
