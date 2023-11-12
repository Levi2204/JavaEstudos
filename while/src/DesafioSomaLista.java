import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioSomaLista {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        List<Integer> listaUm = new ArrayList<>();
        double soma = 0;
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;
        while (true){
            System.out.print("Digite um número para fazer a média e todos os números: ");
            int numero = num.nextInt();
            listaUm.add(numero);
            System.out.println("Deseja adicionar mais algum número(S/N):");
            String escolha = str.nextLine();
            String corrigido = escolha.toLowerCase();

            if (corrigido.equals("s")){
                //vazio
            }else if (corrigido.equals("n")){
                break;
            }else{
                System.out.println("Opção inválida");
            }
        }
        for (double numero : listaUm){
            soma += numero;
        }
        for (int numero : listaUm) {
            if (numero > maiorValor) {
                maiorValor = numero;
            }else if (numero < menorValor){
                menorValor = numero;
            }
        }

        int tamanhoLista = listaUm.size();

        System.out.printf("A média de todos os números digitados é: %.2f %n", (soma/tamanhoLista));
        System.out.println("O maior valor é " + maiorValor);
        System.out.println("O menor valor é " + menorValor);
        System.out.println("FIM");
    }
}
