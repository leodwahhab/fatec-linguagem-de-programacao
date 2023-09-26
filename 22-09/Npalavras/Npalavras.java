package Npalavras;
import java.util.Scanner;

public class Npalavras {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um inteiro: ");
        int n = scanner.nextInt();
        
        String[] palavrasComALetra = new String[n];

        System.out.print("digite um caractere: ");
        char ch = scanner.next().charAt(0);

        for(int i = 0; i < n; i++){
            System.out.print("digite uma palavra que comece com '" + ch + "': ");
            palavrasComALetra[i] = scanner.next();

            if(palavrasComALetra[i].charAt(0) != ch){
                System.out.println("a palavra digitada nao comeca com '" + ch + "'!");
            }
        }

        for(int i = 0; i < n; i++){
            if(palavrasComALetra[i].charAt(0) == ch){
                System.out.println(i + "a palavra: " + palavrasComALetra[i]);
            }
        }

        scanner.close();
    }
}
