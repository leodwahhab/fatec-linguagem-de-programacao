package Encaixa;
import java.util.Scanner;

public class Encaixa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o valor do parametro A (inteiro com 4 digitos): ");
        int a = scanner.nextInt();

        System.out.print("digite o valor do parametro B (inteiro com 2 digitos): ");
        int b = scanner.nextInt();

        encaixa(a, b);

        scanner.close();
    }

    public static void encaixa(int a, int b){
        System.out.println("A      B      Mensagem");
        System.out.println(a + "  " + b + "      " + (b == a%10%10 ? "encaixa" : "nao encaixa"));
    }

}
