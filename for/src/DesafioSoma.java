public class DesafioSoma {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 500; i >= 1; i-- ){
            if (i % 2 != 0){
                soma = soma + i;
            }
        }
        System.out.printf("A soma entre todos os números ímpares entre 1 e 500 é: %d", soma);
    }
}
