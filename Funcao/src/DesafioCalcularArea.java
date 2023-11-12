import java.util.Scanner;

public class DesafioCalcularArea {
    public static double area(double a, double b){
        return a * b;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Calculadora de área");
        System.out.print("Digite o comprimento do seu terreno: ");
        double comp = num.nextDouble();
        System.out.print("Digite a largura do seu terreno: ");
        double largura = num.nextDouble();
        double result = area(comp, largura);
        System.out.printf("O seu terreno tem uma área de %.2f m²", result);
    }
}
