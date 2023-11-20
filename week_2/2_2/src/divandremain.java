import java.util.Scanner;

public class divandremain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수(10~99)입력 : ");
        int number = scanner.nextInt();
        scanner.close();
        if (number % 10 == number / 10) {
            System.out.println("십의 자리와 일의 자리가 같습니다.");
        } else {
            System.out.println("십의 자리와 일의 자리가 같지 않습니다.");
        }

    }
}
