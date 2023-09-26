package Histograma;
import java.util.Scanner;

public class Histograma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite uma frase: ");
        String frase = scanner.nextLine();
        int a = 0;
        String hA = "";
        int e = 0;
        String hE = "";
        int i = 0;
        String hI = "";
        int o = 0;
        String hO = "";
        int u = 0;
        String hU = "";

        for(int x = 0; x < frase.length(); x++){
            switch(frase.charAt(x)){
                case 'a':
                    a++;
                    hA += "*";
                    break;

                case 'e':
                    e++;
                    hE += "*";
                    break;

                case 'i':
                    i++;
                    hI += "*";
                    break;

                case 'o':
                    o++;
                    hO += "*";
                    break;

                case 'u':
                    u++;
                    hU += "*";
                    break;
            }
        }

        System.out.println("linha de texto: '" + frase + "'");
        System.out.println("Histograma: \n" +
            "a: " + hA + " (" + a + ")\n" +
            "e: " + hE + " (" + e + ")\n" +
            "i: " + hI + " (" + i + ")\n" +
            "o: " + hO + " (" + o + ")\n" +
            "u: " + hU + " (" + u + ")");

        scanner.close();
   }
}
