import java.util.Scanner;

public class DesafioValidacao {
    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);
        while (true){
            System.out.print("Digite qual é o seu sexo (Digite M ou F):");
            String sexo = escolha.nextLine();
            String correto = sexo.toLowerCase();
            if (correto.equals("m")){
                System.out.println("Você é um homem");
                break;
            }else if (correto.equals("f")){
                System.out.println("Você é uma mulher");
                break;
            }else{
                System.out.println("Opção inválida");
            }
        }
    }
}
