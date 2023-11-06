import java.util.Scanner;

public class desafioSomaPergunta {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite 6 números para saber a soma dos pares que forem digitados");
        int soma = 0;
        for (int i = 1; i <= 6; i++){
            System.out.printf("Digite o %d º número:", i);
            int numero = num.nextInt();
            if (numero % 2 == 0){
                soma = soma + numero;
            }
        }
        System.out.printf("A soma de todos os números pares digitados é %d", soma);
    }
}
