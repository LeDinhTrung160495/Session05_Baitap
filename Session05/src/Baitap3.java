import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String input = scanner.nextLine();
        String reversedString = reverseString(input);
        System.out.println("Chuỗi đảo ngược: "+reversedString);
    }
    public static String reverseString(String input){
        StringBuilder reversedString = new StringBuilder();
        for (int i = input.length()-1; i >=0; i--) {
            reversedString.append(input.charAt(i));
        }
        return reversedString.toString();
    }
}
