import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        
        System.out.print("Digite a porcentagem de desconto: ");
        double percentualDesconto = scanner.nextDouble();
        
        double desconto = valorProduto * (percentualDesconto / 100);
        double precoFinal = valorProduto - desconto;
        
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Preço final: R$ " + precoFinal);
        
        scanner.close();
    }
}
