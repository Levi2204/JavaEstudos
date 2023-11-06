import java.util.Scanner;

public class DesafioPAWhile {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite uma razão para saber os 10 primeiros termos de sua PA: ");
        int numero = num.nextInt();
        int contador = 1;
        int progressao = 0;
        while (contador <= 10){
            progressao += numero;
            System.out.printf("%dº termo = %d %n",contador,  progressao);
            contador ++;
        }
    }
}
