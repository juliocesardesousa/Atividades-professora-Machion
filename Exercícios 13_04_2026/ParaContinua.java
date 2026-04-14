//construir um laço SENTINELA que executa até que o usuário digite PARE
import java.util.Scanner;
public class ParaContinua {
    public static void main (String args []) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite PARE se quiser parar: ");
        String ordem = scanner.nextLine();
        // do {
        //     System.out.print ("Digite PARE se quiser para: ");
        //     ordem = scanner.nextLine();
        // } while (!(ordem.toUpperCase().equals("PARE")));
        
        while (!(ordem.toUpperCase().equals("PARE"))) {
            System.out.print ("Digite PARE se quiser parar: ");
            ordem = scanner.nextLine();
        }
        
        scanner.close();
    }
}