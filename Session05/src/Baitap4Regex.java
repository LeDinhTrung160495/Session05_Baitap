import java.util.Scanner;

public class Baitap4Regex {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();
        if(checkContainsDigit(input)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    public static boolean checkContainsDigit(String input){
        String regexPattern = ".*\\d.*";
        return input.matches(regexPattern);
    }
}
