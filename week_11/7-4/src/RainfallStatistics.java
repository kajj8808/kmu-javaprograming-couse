import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Collectors;

public class RainfallStatistics {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> nums = new Vector<Integer>();
        while (true) {
            System.out.print("강수량 입력(0 입력시 종료) >> ");
            int inputNum = Integer.parseInt(scanner.nextLine());
            if (inputNum == 0) {
                break;
            }
            nums.add(inputNum);
            int sum = 0;
            for (Integer num : nums) {
                System.out.print(num + " ");
                sum += num;
            }
            System.out.println();
            System.out.println("현재 평균 " + sum / nums.size());
        }
    }
}
