import java.util.Scanner;

public class AtividadeWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 2002;
        int senha;
        
        //Loop até que a senha correta seja inserida
        while (true) {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
            
            if (senha == senhaCorreta) {
                System.out.println("Acesso Permitido");
                break; // Sai do loop se a senha estiver correta
            } else {
                System.out.println("Senha invalida");
            }
        }
        sc.close();
    }
}