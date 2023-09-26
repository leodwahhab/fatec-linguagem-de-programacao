import java.util.Scanner;

public class NumDivis{
    public static void main(String[] args){
        int num[] = new int[10];
        int divis[] = new int[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            System.out.print("\ndigite um numero para a posicao " + i + " do vetor num: ");
            num[i] = scanner.nextInt();
        }

        for(int i = 0; i < divis.length; i++){
            System.out.print("\ndigite um numero para a posicao " + i + " do vetor divis: ");
            divis[i] = scanner.nextInt();
        }

        scanner.close();

        for(int i = 0; i < num.length; i++){
            System.out.println("\nnumero: " + num[i]);
            for(int j = 0; j < divis.length; j++){
                if(num[i] % divis[j] == 0){
                    System.out.println("divisivel por " + divis[j] + " na posicao " + (j + 1));
                }
            }
        }
    }
}