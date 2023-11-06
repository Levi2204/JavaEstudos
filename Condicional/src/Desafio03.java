import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número para saber se ele é par ou ímpar:");
        double numero = num.nextDouble();
        if (numero % 2 == 0){
            System.out.println("Seu número é par");
        }else if (numero % 2 != 0){
            System.out.println("Seu número é ímpar");
        }else{
            System.out.println("Número inválido");
        }

    }
}
