import java.util.Scanner;

public class desafioMenu {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numUm = numero.nextInt();
        System.out.print("Digite o segundo número: ");
        int numDois = numero.nextInt();
        System.out.println("------------------------------------------------------------------------");
        while (true){
            System.out.println("Tabela de operações");
            System.out.println("1 - Soma\n2 - Multiplicação\n3 - Divisão\n4 - Trocar números\n5 - Sair do programa");
            int escolha = numero.nextInt();
            if (escolha == 1){
                System.out.println("O resultado é " + (numUm + numDois));
                System.out.println("------------------------------------------------------------------------");
            }else if (escolha == 2){
                System.out.println("O resultado é " + (numUm * numDois));
                System.out.println("------------------------------------------------------------------------");
            }else if (escolha == 3){
                System.out.println("O resultado é " + (numUm / numDois));
                System.out.println("------------------------------------------------------------------------");
            }else if (escolha == 4){
                System.out.println("Digite o primeiro número: ");
                numUm = numero.nextInt();
                System.out.print("Digite o segundo número: ");
                numDois = numero.nextInt();
                System.out.println("------------------------------------------------------------------------");
            }else{
                System.out.println("FIM");
                break;
            }


        }
    }
}
