import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();
        if(input.contains("Academy")){
            String replacedString = input.replace("Academy","Học viện");
            System.out.println("Chuỗi sau khi được thay thế: "+replacedString);
        }else {
            System.out.println("Chuỗi không tồn tại 'Academy'");
        }
    }
}
