
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți numărul N pentru șirul Fibonacci: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Șirul Fibonacci până la " + n + " este: ");
        while (a <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}