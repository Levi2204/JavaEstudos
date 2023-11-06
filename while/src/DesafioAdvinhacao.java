import java.util.Random;
import java.util.Scanner;

public class DesafioAdvinhacao {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        Random maquina = new Random();
        int palpite = 0;
        int [] escolha = {1,2,3,4,5,6,7,8,9,10};
        int index = maquina.nextInt(9);
        int escolhido = escolha [index];
        System.out.println("O computador pensou em um número, tente advinhar qual é");
        while (true){
            System.out.println("Escolha um número entre 1 e 10");
            int usuario = texto.nextInt();
            if (usuario >= 11){
                System.out.println("Digite um valor entre 1 e 10");
            }else if(usuario > escolhido){
                System.out.println("Você digitou um valor acima. Tente novamente");
                palpite = palpite + 1;
            }else if(usuario < escolhido){
                System.out.println("Você digitou um valor abaixo. Tente novamente");
                palpite = palpite + 1;
            }else{
                System.out.println("Parabéns. Você acertou");
                palpite = palpite + 1;
                System.out.printf("Você precisou de %d tentativas para acertar", palpite);
                break;
            }

        }
    }
}
