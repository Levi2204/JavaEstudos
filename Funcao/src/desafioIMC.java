import java.util.Scanner;

public class desafioIMC {
    public static double imc(double a, double b){
        return a / (Math.pow(b, 2));
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Calculadora de IMC");
        System.out.print("Digite seu peso: ");
        double peso = num.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = num.nextDouble();
        double resultado = imc(peso, altura);
        if (resultado <= 18.4){
            System.out.printf("Seu imc é %.2f %n", resultado);
            System.out.println("Você está abaixo do peso");
        }else if (resultado >= 18.5 && resultado <= 24.9){
            System.out.printf("Seu imc é %.2f", resultado);
            System.out.println("Você está no peso normal");
        }else if(resultado >= 25 && resultado <= 29.9){
            System.out.printf("Seu imc é %.2f", resultado);
            System.out.println("Você está com sobrepeso");
        }else if (resultado >=30 && resultado <= 34.9){
            System.out.printf("Seu imc é %.2f", resultado);
            System.out.println("Você está com obesidade grau I");
        }else if (resultado >= 35 && resultado <= 39.9){
            System.out.printf("Seu imc é %.2f", resultado);
            System.out.println("Você está com obesidade grau II");
        }else{
            System.out.printf("Seu imc é %.2f", resultado);
            System.out.println("Você está com obesidade grau III");
        }

    }
}
