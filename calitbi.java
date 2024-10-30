import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {
        double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da transação do imóvel:"));
        double valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal do imóvel:"));
        double percentualITBI = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do ITBI:"));

        double valorBase = Math.max(valorTransacao, valorVenal);
        double impostoITBI = valorBase * (percentualITBI / 100);
        
        JOptionPane.showMessageDialog(null, "Imposto ITBI: R$ " + impostoITBI);
    }
}
