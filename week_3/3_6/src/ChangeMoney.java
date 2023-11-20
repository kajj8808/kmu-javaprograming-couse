import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int num = scanner.nextInt();
        scanner.close();
        int[] coins = { 0, 0, 0, 0, 0, 0, 0, 0 };
        // 50,000원권, 10,000원권, 1,000원권, 500원 동전, 100원 동전, 50원 동전, 10원 동전, 1원 동전
        while (true) {
            if (num >= 50000) {
                num = num - 50000;
                coins[0] = coins[0] + 1;
                continue;
            } else if (num >= 10000) {
                num = num - 10000;
                coins[1] = coins[1] + 1;
                continue;
            } else if (num >= 1000) {
                num = num - 1000;
                coins[2] = coins[2] + 1;
                continue;
            } else if (num >= 500) {
                num = num - 500;
                coins[3] = coins[3] + 1;
                continue;
            } else if (num >= 100) {
                num = num - 100;
                coins[4] = coins[4] + 1;
                continue;
            } else if (num >= 50) {
                num = num - 50;
                coins[5] = coins[5] + 1;
                continue;
            } else if (num >= 10) {
                num = num - 10;
                coins[6] = coins[6] + 1;
                continue;
            } else if (num >= 1) {
                num = num - 1;
                coins[7] = coins[7] + 1;
                continue;
            } else {
                break;
            }
        }
        if (coins[0] != 0) {
            System.out.println("50000원 짜리 : " + coins[0] + "개");
        }
        if (coins[1] != 0) {
            System.out.println("10000원 짜리 : " + coins[1] + "개");
        }
        if (coins[2] != 0) {
            System.out.println("1000원 짜리 : " + coins[2] + "개");
        }
        if (coins[3] != 0) {
            System.out.println("500원 짜리 : " + coins[3] + "개");
        }
        if (coins[4] != 0) {
            System.out.println("100원 짜리 : " + coins[4] + "개");
        }
        if (coins[5] != 0) {
            System.out.println("50원 짜리 : " + coins[5] + "개");
        }
        if (coins[6] != 0) {
            System.out.println("10원 짜리 : " + coins[6] + "개");
        }
        if (coins[7] != 0) {
            System.out.println("1원 짜리 : " + coins[7] + "개");
        }

    }
}
