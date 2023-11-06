package ro.uoradea;
import java.util.Scanner;
public class PalindromeCheck {
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un cuvânt: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("Cuvântul este palindrom.");
        } else {
            System.out.println("Cuvântul nu este palindrom.");
        }
    }
}