import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.print("Digite um número para saber se ele é impár ou par: ");
        int numero = valor.nextInt();
        if (numero % 2 == 0){
            System.out.println("Esse número é par");
        }else{
            System.out.println("Esse número é impar");
        }
    }
}
