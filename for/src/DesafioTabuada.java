import java.util.Scanner;

public class DesafioTabuada {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número para saber a tabuada dele: ");
        int numero = num.nextInt();
        for (int i = 0; i <= 10; i ++){
            System.out.printf("%d X %d = %d %n", numero, i, numero * i);
        }
    }
}
