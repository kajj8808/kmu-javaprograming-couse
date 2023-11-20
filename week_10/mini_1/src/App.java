import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("**숫자 맞추기 게임을 시작합니다**");

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int ranNum = (int) (Math.random() * 100 + 1);

        // 0 ~ 100 사이의 값. 잘못된 입력 -> 잘못된 입력이다 출력
        while (true) {
            System.out.print("0과 100 사이의 숫자를 입력 : ");
            int inputNum = scanner.nextInt();
            if (inputNum < 0 || inputNum > 100) {
                System.out.println("잘못된 값입니다. 다시 입력해주세요.");
                continue;
            }
            count++;
            if (ranNum == inputNum) {
                System.out.println("정답입니다.");
                System.out.println(count + "번 만에 맞추셨습니다.");
                break;
            } else if (ranNum > inputNum) {
                System.out.println(inputNum + "이 난수 보다 작습니다.");
            } else {
                System.out.println(inputNum + "이 난수 보다 큽니다.");
            }
        }
        scanner.close();

    }
}
