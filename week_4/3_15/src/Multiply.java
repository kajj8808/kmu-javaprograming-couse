import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        while (true) {
            try {
                System.out.print("곱하고자 하는 두 수 입력>> ");
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("실수는 입력하면 안됩니다.");
                continue;
            }
        }
        scanner.close();
        System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
    }

}
