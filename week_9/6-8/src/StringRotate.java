import java.util.Scanner;

public class StringRotate {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        String str = scanner.nextLine();
        String temp = "";
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            temp += str.substring(0, 1);
            str = str.substring(1, str.length());
            System.out.println(str + temp);
        }
        scanner.close();
    }
}
