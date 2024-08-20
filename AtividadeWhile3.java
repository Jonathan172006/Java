import java.util.Scanner;

public class AtividadeWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        int pares = 0;
        int  impares = 0;
        
        // o loop continuará enquanto o número for positivo
        while (numero >= 0) {
            System.out.print("Digite um número inteiro positivo (ou um negativo para encerrar):");
            numero = sc.nextInt();
            
            if (numero >= 0) {
                if (numero % 2 == 0) {
                pares++; // Conta números pares
            } else {
                impares++; // Conta números impares
            }
        }
    }    
        // Exibe os resultados
        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números impares: " + impares);
        
        sc.close();
    }
}