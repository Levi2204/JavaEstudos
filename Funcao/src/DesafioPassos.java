import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioPassos {
    public static List<Integer> intervalo(int a , int b, int c) {
        List<Integer> valores = new ArrayList<>();
        for(int i = a; i <= b ; i += c){
            valores.add(i);
        }
        return valores;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o inicio, o fim, e os passos que será usada");
        System.out.println("Exemplo: 0 a 10 no passo de 1:");
        for(int j = 0 ; j <= 10; j++){
            System.out.println(j);
        }
        System.out.print("Digite o início: ");
        int inicio = num.nextInt();
        System.out.print("Digite o fim: ");
        int fim = num.nextInt();
        System.out.print("Digite o passo: ");
        int passo = num.nextInt();
        List<Integer> resultado = intervalo(inicio,fim,passo);
        System.out.println("Valores no intervalo");
        for (int valor : resultado){
            System.out.println(valor);
        }
    }
}
