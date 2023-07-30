import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();
        String normalizedString = normalizeString(input);
        System.out.println("Chuỗi sao khi được chuẩn hóa: "+normalizedString);
    }
    public static String normalizeString(String input){
        //Mỗi từ cách nhau bằng một khoảng trắng
        String oneWhitespaceString = input.replaceAll("\\s+"," ");
        //Loại bỏ khoảng trắng ở đầu và cuối chuỗi
        String trimedString = oneWhitespaceString.trim();
        //Ký tự đầu tiên của mỗi từ được viết hoa, các ký tự khác viết thường
        StringBuilder normalizedString = new StringBuilder();
        String[]words = trimedString.split("\\s+");
        for (String word:words) {
            if(!word.isEmpty()){
                String firstLetter = word.substring(0,1).toUpperCase();
                String restOfWord = word.substring(1).toLowerCase();
                normalizedString.append(firstLetter).append(restOfWord).append(" ");
            }
        }
        return normalizedString.toString();
    }
}
