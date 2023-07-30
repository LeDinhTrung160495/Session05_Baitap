import java.util.Scanner;

public class Baitap8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi 1:");
        String str1=scanner.nextLine();
        System.out.println("Nhập vào chuỗi 2:");
        String str2=scanner.nextLine();
        String combinedString= combineString(str1,str2);
        System.out.println("Chuỗi sau khi kết hơp: "+combinedString);
    }
    public static String combineString(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        if(len1==len2){
            return str1+str2;
        }
        if (len1>len2){
            String cutStr1=str1.substring(len1-len2);
            return cutStr1+str2;
        }
        String cutStr2=str2.substring(len2-len1);
        return str1+cutStr2;
    }
}
