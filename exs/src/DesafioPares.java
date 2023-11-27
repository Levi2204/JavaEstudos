import java.util.Scanner;

public class DesafioPares {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Esse programa vai mostrar apenas os números pares");
        System.out.print("Digite o número que vai ser iniciada a sequência:");
        int inicio = num.nextInt();
        System.out.print("Digite o número que vai terminar a sequência:");
        int fim = num.nextInt();
        for(int i = inicio; i <= fim; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
