import java.util.Scanner;

public class DesafioTabuadaWhile {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int contador = 0;
        System.out.print("Digite um número para saber sua tabuada: ");
        int numero = num.nextInt();
        while (contador <= 10){
            System.out.printf("%d X %d = %d %n", contador, numero, contador * numero);
            contador++;
        }
    }
}
