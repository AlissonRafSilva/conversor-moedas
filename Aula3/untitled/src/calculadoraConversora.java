import java.util.Scanner;

public class calculadoraConversora {
    static final double DOLAR = 0.17;
    static final double EURO = 0.16;
    static final double LIBRA = 0.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 4) {

            System.out.println("======= Menu =======");
            System.out.println("(1) Converter para Dolar");
            System.out.println("(2) Converter para Euro");
            System.out.println("(3) Converter para Libra");
            System.out.println("(4) Sair");
            System.out.println("====================");

            opcao = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Informe o valor a converter: ");
            double valorReal = scanner.nextDouble();

            switch (opcao) {
                case 1:
                    double valorEmDolar = conversorDeReal(valorReal, DOLAR);
                    System.out.printf("O valor convertido é de %.2f \n", valorEmDolar);
                    break;
                case 2:
                    double valorEmEuro = conversorDeReal(valorReal, EURO);
                    System.out.printf("O valor convertido é de %.2f \n", valorEmEuro);
                    break;
                case 3:
                    double valorEmLibra = conversorDeReal(valorReal, LIBRA);
                    System.out.printf("O valor convertido é de %.2f \n", valorEmLibra);
                    break;
                case 4:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente!");
                    break;
            }
        }


        scanner.close();
    }

    static double conversorDeReal(double valorEmReal, double valorDaMoeda) {
        return valorEmReal * valorDaMoeda;
}



}