/* Ler inteiros até que a soma deles atinja 1000
a) usando while
b) usando do-while */
import java.util.Scanner;
public class Soma1000 {
    public static void main (String args []) {
        Scanner scanner = new Scanner (System.in);
        
        // do {
        //     System.out.print ("Digite seus numero até bater 1000: ");
        //     numero = scanner.nextInt();
        //     soma = numero;
        //     soma = soma + numero;
        // } while (soma < 1000);

        // while (soma < 1000) {
        //     System.out.print ("Digite seus numeros até bater 1000: ");
        //     numero = scanner.nextInt();
        //     soma = soma + numero;
        // }
        int soma = 0;
        do {
            System.out.println("valor");
            int num = scanner.nextInt();
            soma += num;
        }while (soma <= 1000);
        System.out.println ("Você atingiu " + soma);
        scanner.close();
    }
}