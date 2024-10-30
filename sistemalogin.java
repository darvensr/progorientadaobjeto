import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorreto = "java8";
        String senhaCorreta = "java8";
        int tentativas = 3;

        while (tentativas > 0) {
            System.out.print("Digite seu usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso concedido!");
                break;
            } else {
                tentativas--;
                System.out.println("Usuário ou senha incorretos. Tentativas restantes: " + tentativas);
            }
        }

        if (tentativas == 0) {
            System.out.println("Número máximo de tentativas atingido.");
        }

        scanner.close();
    }
}
