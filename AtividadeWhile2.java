import java.util.Scanner;

public class AtividadeWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        while (true) {
        System.out.print("Informe o tipo de combustível (1. álccol, 2. Gasolina, 3. Dieswel, 4. Fim): ");
        int codigo = sc.nextInt();
        
        if (codigo == 1) {
            alcool++;
        } else if (codigo == 2) {
            gasolina++;
        }else if (codigo == 3) {
            diesel++;
        }else if (codigo == 4) {
            System.out.println("Muito obrigado");
            break;
        }else {
            System.out.println("Código inválido. Tente novamente.");
        }
    }
        System.out.println("Quantidade de cliente por tipo de combustível:");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        sc.close();
    }
}