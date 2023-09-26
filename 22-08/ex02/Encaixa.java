import java.util.Scanner;

public class Encaixa {
    public static void main(String[] args){
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        Scanner scanner = new Scanner(System.in);
        String s = "";

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("digite um numero de 4 digitos para a posicao " + i + " do vetor A: ");
            vetorA[i] = scanner.nextInt();
            s = Integer.toString(vetorA[i]);
            if(s.length() < 4){
                System.out.println("vc nao digitou um numero de 4 digitos. digite AGORA um numero de 4 digitos para a posicao " + i + " do vetor A: ");
                vetorA[i] = scanner.nextInt();
            }
        }

        for(int i = 0; i < vetorB.length; i++){
            System.out.print("digite um numero de 2 digitos para a posicao " + i + " do vetor B: ");
            vetorB[i] = scanner.nextInt();
            s = Integer.toString(vetorB[i]);
            if(s.length() < 2){
                System.out.println("vc nao digitou um numero de 2 digitos. digite AGORA um numero de 4 digitos para a posicao " + i + " do vetor B: ");
                vetorB[i] = scanner.nextInt();
            }
        }

        scanner.close();

        System.out.println("VetorA  VetorB  Mensagem");
        for(int i = 0; i < vetorA.length; i++){
            System.out.println(" " + vetorA[i] + "    " + vetorB[i] + "    " + (vetorA[i] % 100 == vetorB[i] ? "Encaixa" : "Não encaixa"));
        }

    }
}
