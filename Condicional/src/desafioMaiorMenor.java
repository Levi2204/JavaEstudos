import java.util.Scanner;

public class desafioMaiorMenor {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        int numUm = num.nextInt();
        System.out.print("Digite o segundo número:");
        int numDois = num.nextInt();
        System.out.print("Digite o terceiro número:");
        int numTres = num.nextInt();
        int maior = numUm;
        if (numDois > numUm && numDois > numTres){
            maior = numDois;
        }else if (numTres > numUm && numTres > numDois){
            maior = numTres;
        }
        int menor = numUm;
        if (numDois < numUm && numDois < numTres){
            menor = numDois;
        }else if (numTres < numUm && numTres < numDois){
            menor = numTres;
        }
        System.out.printf("O maior número é o %d e o menor é %d", maior, menor);
    }
}
