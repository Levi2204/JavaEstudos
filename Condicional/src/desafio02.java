import java.util.Scanner;
public class desafio02 {
    public static void main(String[] args) {
        Scanner velocidade = new Scanner(System.in);
        System.out.print("Digite a velocidade do carro: ");
        double valor = velocidade.nextDouble();

        if (valor >= 80){
            System.out.println("Você é gay, foi multado, otário");
            System.out.println("O valor da multa é de " + (valor - 80)*7);
        }else{
            System.out.println("Você não foi multado, é macho pra crlh");
            System.out.println("Sua velocidade era de " + (valor) + "km/h");
        }
    }
}
