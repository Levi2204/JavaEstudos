import java.util.Scanner;

public class desafioAno {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um ano para saber se ele é bissexto:");
        int ano = num.nextInt();
        if (ano % 4 == 0 || ano % 100 == 0 && ano % 400 == 0){
            System.out.printf("O ano %s é bissexto", ano);
        }else{
            System.out.printf("O ano %s não é bissexto", ano);
        }
    }
}
