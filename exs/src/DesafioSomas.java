import java.util.Scanner;

public class DesafioSomas {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite o fim da sequência: ");
        int fim = num.nextInt();
        int soma = 0;
        for(int i = 0; i <= fim; i++){
            System.out.println(soma += i);
        }
    }
}
