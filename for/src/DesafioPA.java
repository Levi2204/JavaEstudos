import java.util.Scanner;

public class DesafioPA {
    public static void main(String[] args) {
        Scanner razao = new Scanner(System.in);
        System.out.print("Digite a razão de uma PA para saber os 10 primeiros termos: ");
        int numero = razao.nextInt();
        int soma = 0;
        for (int i = 1; i <=10; i++){
            soma = soma + numero;
            System.out.printf("O %d º termo da sua PA é: %d %n",i , soma);
        }
    }
}
