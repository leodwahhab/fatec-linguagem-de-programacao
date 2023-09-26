import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int v[][][] = new int[3][3][3];
		int somaPares = 0;
		int somaImpares = 0;
		
		for(int i = 0; i < v.length; i++){
			for(int j = 0; j < v[i].length; j++){
				for(int z = 0; z < v[i][j].length; z++){
					v[i][j][z] = i + j + z;
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
		
		for(int i = 0; i < v.length; i++){
			for(int j = 0; j < v[i].length; j++){
				for(int z = 0; z < v[i][j].length; z++){	
					if(v[i][j][z] % 2 == 0){
						somaPares += v[i][j][z];
					}
					else{
						somaImpares += v[i][j][z];
					}
				}
			}
		}
		
		System.out.println("\na soma dos elementos pares eh: " + somaPares);
		System.out.println("a soma dos elementos impares eh: " + somaImpares);
	}
}