import java.util.Scanner;

public class Desafioarea {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor para a: ");
        double a = entrada.nextDouble();
        System.out.print("Digite o valor para b: ");
        double b = entrada.nextDouble();
        System.out.print("Digite o valor para c: ");
        double c = entrada.nextDouble();
        System.out.printf("A área do triângulo é %.2f %n", (a * c)/2);
        System.out.printf("A área do circulo é %.2f %n", 3.14 * Math.pow(c, 2));
        System.out.printf("A área do trapézio é %.2f %n", ((a + b)* c)/2 );
        System.out.printf("A área do quadrado é %.2f %n", Math.pow(b, 2));
        System.out.printf("A área do retângulo é %.2f %n", a * b);
        entrada.close();
    }
}
