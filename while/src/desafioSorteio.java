import java.util.Random;
import java.util.Scanner;

public class desafioSorteio {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random sorteio = new Random();
        int [] numeros = {1,2,3,4,5};
        int sorteador = sorteio.nextInt(5);
        int numSorteado = numeros[sorteador];
        while (true){
            System.out.print("A máquina pensou em um número entre 1 e 5. Tente adivinhar: ");
            int escolha = num.nextInt();
            if (escolha > 5 || escolha <= 0){
                System.out.println("Número inválido. Digite um número entre 1 e 5");
            }else if (escolha == numSorteado){
                System.out.println("Parabéns, você acertou");
                break;
            }else if (escolha != numSorteado){
                System.out.println("Você errou. Tente novamente");
            }

        }
    }
}
