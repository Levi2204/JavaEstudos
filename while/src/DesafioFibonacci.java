import java.util.Scanner;

public class DesafioFibonacci {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite quantos termos da sequência de fibonacci você quer ver: ");
        int qnts = num.nextInt();
        int contador = 0;
        int termoUm = 1;
        int termoDois = 1;
        int termoUmAnt = 1;
        while (contador <= qnts){
            termoUmAnt = termoUm;
            termoUm = termoUm + termoDois;
            termoDois = termoUmAnt;
            System.out.print(termoUm  + "-->");
            contador ++;
        }
        System.out.println("FIM");
    }
}
