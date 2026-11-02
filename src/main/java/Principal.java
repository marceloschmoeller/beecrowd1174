
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num = 100;
        double vet[] = new double[num];

        for (int i = 0; i < num; i++) {
            vet[i] = leitor.nextDouble();
        }
        for (int i = 0; i < num; i++) {
            if (vet[i] <= 10) {
                System.out.println("A[" + i + "] = " + vet[i]);
            }
        }
    }
}
