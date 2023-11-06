import java.util.Scanner;

public class DesafioViagem {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Bem vindo ao nosso programa de viagem");
        System.out.println("Iremos calcular o preço da sua viagem baseados no cálculo");
        System.out.println("0.50 por KM em viagens até 200km");
        System.out.println("0.45 por KM em viagens para viagens maior 200km");

        while (true){
            System.out.print("Digite quantos KM tem a sua viagem:");
            double km = num.nextDouble();

            if (km <= 0){
                System.out.println("Distância inválida");
            }else if (km <= 200){
                System.out.printf("Sua viagem custará %.2f reais%n",(km * 0.50));
                System.out.println("Boa viagem");
                break;
            }else{
                System.out.printf("Sua viagem custará %.2f reais%n", (km * 0.45));
                System.out.println("Boa viagem");
                break;
            }
        }

    }
}
