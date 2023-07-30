import java.util.HashMap;
import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = scanner.nextLine();
        findUniqueCharacters(str);
    }

    public static void findUniqueCharacters(String str) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        //Đếm số lần xuất hiện của từng ký tự trong chuỗi
        for (char c : str.toCharArray()
        ) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        //In ra các ký tự xuất hiện duy nhất 1 lần
        boolean hasUniqueCharacters = false;
        for (char c : str.toCharArray()
        ) {
            if (charCount.get(c) == 1) {
                System.out.printf("%s\t", c);
                hasUniqueCharacters = true;
            }
        }
        //Nếu không có ký tự nào xuất hiện duy nhất 1 lần
        if (!hasUniqueCharacters) {
            System.out.println("Không tồn tại ký tự xuất hiện duy nhất 1 lần trong chuỗi");
        }
    }
}
