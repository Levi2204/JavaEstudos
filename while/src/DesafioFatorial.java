import java.util.Scanner;

public class DesafioFatorial {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número para saber seu fatorial: ");
        int numero = num.nextInt();
        int resultado = 1;
        while (numero >= 1){
            resultado = resultado * numero;
            numero --;
        }
        System.out.println("O resultado do número fatorial é:" + resultado);
    }
}
