import java.util.Scanner;
public class Somar {
    public static void main(String []args){
        int n1;
        int n2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha dois numeors para o programa somar: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        int soma = n1 + n2;
        System.out.println("O resultado da soma dos numeros e: " + soma);
        scan.close();
    }
}
