//sortear um numero de 1 a 10 e pedir para o usuário acertar
import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        Random random = new Random();
        int sorteado = random.nextInt(10) + 1;
        int chute;
        int contador = 0;
        do {
            System.out.print("Querido usuário, adivinhe um número de 1 a 10: ");
            chute = sc.nextInt();
            contador++;
            if (chute > sorteado) {
                System.out.println("Chute um numero menor!");
                System.out.println("");
            }
            else if (contador >= 3) {
                System.out.println("");
            }
            else {
                System.out.println("Chute um numero maior!");
                System.out.println("");
            }
            
        } while (chute != sorteado && contador < 3);
        if (chute == sorteado) {
            System.out.println("Parábens, você acertou! " + chute + " era o numero sorteado!");
        }
        else {
            System.out.println("Não foi desta vez, seu FRACASSADO. O numero sorteado era: " + sorteado);
        }
        sc.close();

    }
}