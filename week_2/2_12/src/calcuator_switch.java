import java.util.Scanner;

public class calcuator_switch {
    public static void main(String[] args) throws Exception {
        double num1, num2, result = 0;
        char symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1 : ");
        num1 = scanner.nextDouble();
        System.out.print("num2 : ");
        num2 = scanner.nextDouble();
        System.out.print("choice ones ( + , - , * , / ) : ");
        symbol = scanner.next().charAt(0);
        scanner.close();
        switch (symbol) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num1 == 0 || num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    System.exit(1);
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("옮바른 symbol을 입력해 주세요.");
                break;
        }
        System.out.println("result : " + result);
    }
}
