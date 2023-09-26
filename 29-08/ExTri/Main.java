import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int v[][][] = new int[3][3][3];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < v.length; i++){
			for(int j = 0; j < v[i].length; j++){
				for(int z = 0; z < v[i][j].length; z++){
					System.out.print("\nDigite um valor para o indice [" + i + "][" + j + "][" + z + "]: ");
					v[i][j][z] = scanner.nextInt();
				}
			}
		}
		
		for(int i = 0; i < v.length; i++){
			System.out.print("\n");
			
			for(int j = 0; j < v[i].length; j++){
				System.out.print("\n");
				
				for(int z = 0; z < v[i][j].length; z++){	
					System.out.print("[" + i + "][" + j + "][" + z + "]=" + v[i][j][z] + " | ");
				}
			}
		}
	}
}