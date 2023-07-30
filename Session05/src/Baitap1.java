import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào str1: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập vào str2: ");
        String str2 = scanner.nextLine();
        String str1ConcatStr2 = str1.concat(str2);
        if (str1.length() != str2.length()) {
            System.out.println("No");
        } else {
            if (isPalindrome(str1ConcatStr2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
