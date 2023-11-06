import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți numerele separate prin spațiu: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        System.out.println("Numerele prime din șir sunt: ");
        for (String numberStr : numbers) {
            int number = Integer.parseInt(numberStr);
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
