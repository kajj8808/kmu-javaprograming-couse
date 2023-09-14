import java.util.Scanner;

public class Classname {
    public static void main(String[] args) throws Exception {
        double num1, num2, result = 0.0;
        char symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1 : ");
        num1 = scanner.nextDouble();
        System.out.print("num2 : ");
        num2 = scanner.nextDouble();
        System.out.print("choice ones ( + , - , * , / ) : ");
        symbol = scanner.next().charAt(0);
        scanner.close();
        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '/') {
            if (num1 == 0 || num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                System.exit(1);
            } else {
                result = num1 / num2;
            }
        } else {
            System.out.println("옮바른 symbol을 입력해 주세요.");
        }
        System.out.println("result : " + result);

    }
}
