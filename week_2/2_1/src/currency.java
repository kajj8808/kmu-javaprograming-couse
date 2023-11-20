import java.util.Scanner;

public class currency {
    static final int ONE_DOLLAR = 1100;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원화 입력: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(number / ONE_DOLLAR + "$");
    }
}
