import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        String sexo = JOptionPane.showInputDialog("Digite seu sexo (M/F):").toUpperCase();
        int anosContribuicao = Integer.parseInt(JOptionPane.showInputDialog("Digite os anos de contribuição:"));

        int idadeAposentadoria = (sexo.equals("M")) ? 65 : 60;
        int tempoAposentadoria = (sexo.equals("M")) ? 35 : 30;

        String resultado;
        if (idade >= idadeAposentadoria && anosContribuicao >= tempoAposentadoria) {
            resultado = "Você já pode se aposentar.";
        } else {
            int anosFaltando = Math.max(0, idadeAposentadoria - idade);
            int contribFaltando = Math.max(0, tempoAposentadoria - anosContribuicao);
            resultado = "Faltam " + anosFaltando + " anos de idade e " + contribFaltando + " anos de contribuição.";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
