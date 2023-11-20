import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorBig {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> nums = new Vector<Integer>();
        System.out.print("정수(-1이 입력될 때까지)>> ");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            nums.add(num);

        }
        int max = Collections.max(nums);
        System.out.println("가장 큰 수는 " + max);
        scanner.close();
    }
}
