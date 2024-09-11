package Bucles;

public class BreakContinue {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			
			// En este caso, llega a 50 por consola y rompe
			if (i == 50) {
				break;
			}
		}
		
		System.out.println("-------------------");
		
		for (int i = 0; i <= 100; i++) {
			
			// En este caso, llega a 50 por consola y lo salta
			if (i == 50) {
				continue;
			}
			
			System.out.println(i);
		}

	}

}
