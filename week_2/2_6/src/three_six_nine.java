import java.util.Scanner;

public class three_six_nine {
    public static void main(String[] args) throws Exception {
        int a, b, c;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = a / 10;
        c = a % 10;
        if (b == 3 || b == 6 || b == 9) {
            count++;
        }
        if (c == 3 || c == 6 || c == 9) {
            count++;
        }
        if (count > 0) {
            System.out.print("박수");
            for (int i = 0; i < count; i++) {
                System.out.print("짝");
            }
            System.out.println();
        }

        scanner.close();
    }
}
