import java.util.Scanner;

public class DesafioPAMelhor {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite uma razão para saber sua PA: ");
        int numero = num.nextInt();
        int contador = 1;
        System.out.print("Digite quantos termos você quer ver: ");
        int termo = num.nextInt();
        int progressao = 0;
        while (contador <= termo){
            progressao += numero;
            System.out.printf("%dº termo = %d %n",contador,  progressao);
            contador ++;
        }
    }
}
