import java.util.HashSet;
import java.util.Scanner;

public class Baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();
        String removedString = removeDuplicateString(input);
        System.out.println("Chuỗi sau khi được xóa các ký tự xuất hiện nhiều hơn 1 lần trong chuỗi và chỉ giữ lại ký tự đầu tiên: "+removedString);
    }
    public static String removeDuplicateString(String input){
        StringBuilder removedString = new StringBuilder();
        HashSet<Character>seenCharacters=new HashSet<Character>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(!seenCharacters.contains(currentChar)){
                seenCharacters.add(currentChar);
                removedString.append(currentChar);
            }
        }
        return removedString.toString();
    }
}
