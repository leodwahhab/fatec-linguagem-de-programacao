package ContaEspacos;
import java.util.Scanner;


public class ContaEspacos {
    public static void main(String[] args){
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite uma frase: ");
        String frase = scanner.nextLine();

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == ' '){
                n++;
            }
        }

        System.out.println("a frase '" + frase + "' contem " + n + " espacos");

        scanner.close();

    }
    
}
