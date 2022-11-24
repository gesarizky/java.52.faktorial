
import java.util.Scanner;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class faktorial {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai Faktorial  ");
        System.out.println(" *************************************************************");

        double f = sc.nextInt();

        int faktorial = 1;
        for (int i = 1; i <= f; i++) {
            faktorial *= i;
        }

        System.out.println(" *********************************************************** ");
        System.out.println(" Maka Nilai dari " + f + "! = " + faktorial);
        System.out.println(" *********************************************************** ");
    }
}
