package ExamenB;

public class Ej2 {

	public static void main(String[] args) {
		String[][] m = {
				{"1", "22", "333"},
				{"666666", "666666", "55555"},
				{"7777777", "666666", "88888888"}
			};
			
			for (int i = 0; i < m.length; i++) {
				
				for (int j = 0; j < m[i].length; j++) {
					
					if (m[i][j].length() > 5) {
						System.out.print(m[i][j].length() + " ");
					} else {
						System.out.print("X ");
					}
					
				}
				
				System.out.println();
			}

	}

}
