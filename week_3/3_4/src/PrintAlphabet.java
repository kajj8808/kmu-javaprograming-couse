import java.util.Scanner;

public class PrintAlphabet {
    public static void main(String[] args) throws Exception {
        char inputText;
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>> ");
        inputText = scanner.next().charAt(0);
        scanner.close();
        for (char targetText = inputText; targetText >= 'a'; targetText--) {
            char outputText = 'a';
            while (true) {
                if (targetText == outputText) {
                    System.out.println(targetText);
                    break;
                }
                System.out.print(outputText++);
            }
        }
    }
}
