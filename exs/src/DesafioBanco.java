import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("Bem vindo ao nosso sistema de banco");
        System.out.print("Digite seu nome: ");
        String nome = str.nextLine();
        int saldo = 0;
        while (true){
            System.out.println("Olá, " + nome + " digite a operação que você quer fazer");
            System.out.print("""
                    1 - Ver saldo
                    2 - Depositar
                    3 - Sacar
                    4 - Sair
                    Digite qual operação você quer realizar: """);
            String escolha = num.next();
            switch (escolha){
                case "1":
                    System.out.println("------------------------------------------");
                    System.out.printf("Seu saldo é de %d reais %n", saldo);
                    System.out.println("------------------------------------------");
                    break;
                case "2":
                    System.out.print("Diggite o valor que você quer depositar: ");
                    double valor = num.nextDouble();
                    if (valor < 0){
                        System.out.println("------------------------------------------");
                        System.out.println("Valor inválido");
                        System.out.println("------------------------------------------");
                        break;
                    } else{
                        saldo += valor;
                        System.out.println("------------------------------------------");
                        System.out.printf("Seu novo saldo é de %d %n", saldo);
                        System.out.println("------------------------------------------");
                        break;
                    }
                case "3":
                    System.out.print("Digite o valor do saque: ");
                    double saque = num.nextDouble();
                    if (saque > saldo){
                        System.out.println("------------------------------------------");
                        System.out.println("Valor inválido");
                        System.out.println("------------------------------------------");
                        break;
                    }else{
                        saldo -= saque;
                        System.out.println("------------------------------------------");
                        System.out.printf("Seu novo saldo é de %d %n", saldo);
                        System.out.println("------------------------------------------");
                        break;
                    }
                case "4":
                    System.out.println("------------------------------------------");
                    System.out.println("Fim do programa");
                    System.out.println("------------------------------------------");
                    num.close();
                    str.close();
                    System.exit(0);
                default:
                    System.out.println("------------------------------------------");
                    System.out.println("Opção inválida");
                    System.out.println("------------------------------------------");
            }
        }
    }
}
