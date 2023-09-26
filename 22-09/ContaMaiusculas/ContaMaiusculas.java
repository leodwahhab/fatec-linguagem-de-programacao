package ContaMaiusculas;
import java.util.Scanner;

public class ContaMaiusculas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = 0;

        System.out.println("digite uma frase: ");

        String frase = scanner.nextLine();

        for(int i = 0; i < frase.length(); i++){
            if(Character.isUpperCase(frase.charAt(i))){
                m++;
            }
        }   

        System.out.println("a frase '" + frase + "' contem " + m + " letras maiusculas");

        scanner.close();
    }
}
