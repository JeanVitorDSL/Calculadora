import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        String operacao;
        Boolean continuar;

        do {
            System.out.println("Digite um valor: ");
            valorUm = in.nextDouble();

            System.out.println("Digite a operacao(+, -, /, *): ");
            operacao = in.next();

            System.out.println("Digite dois valor: ");
            valorDois = in.nextDouble();

            Double resultado = realizarCalculo(valorUm, valorDois, operacao);
            System.out.println("Resultado: " + resultado);

            continuar = verificarNovaOperacao();
        } while (continuar);

    }

    public static boolean verificarNovaOperacao() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja realizar uma nova operação? (Sim ou não)");
        return sc.nextLine().toUpperCase(Locale.ROOT).equals("SIM");
    }

    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao) {
        Double respostaCalculo = 0.00;
        switch (operacao) {
            case "+":
                respostaCalculo = valorUm + valorDois;
                break;
            case "-":
                respostaCalculo = valorUm - valorDois;
                break;
            case "/":
                if (valorDois != 0) {
                    respostaCalculo = valorUm / valorDois;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            case "*":
                respostaCalculo = valorUm * valorDois;
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
        return respostaCalculo;
    }
}
