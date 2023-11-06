import java.util.Scanner;

public class DesafioSomaWhile {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double soma = 0;
        while (true){
            System.out.print("Digite um número para somar todos os termos (Digite 0 para sair): ");
            double numero = num.nextDouble();
            if (numero == 0){
                System.out.println("A soma de todos os números digitados é " + soma);
                break;
            }else{
                soma += numero;
            }
        }
    }
}
