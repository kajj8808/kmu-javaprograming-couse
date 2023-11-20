import java.util.Scanner;

public class median {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, result = 0;
        System.out.println("정수 3개 입력.");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();
        if (a > b && c > a || a > c && b > a) {
            result = a;
        }
        if (b > a && c > b || b > c && a > b) {
            result = b;
        }
        if (c > a && b > c || c > b && a > c) {
            result = c;
        }
        System.out.println("result " + result);
    }
}
