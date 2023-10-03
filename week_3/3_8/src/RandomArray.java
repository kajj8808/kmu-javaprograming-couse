import java.util.Scanner;

public class RandomArray {
    protected static boolean isUnique(int[] array, int item) {
        boolean unique = true;
        for (int j = 0; j < array.length; j++) {
            if (item == array[j]) {
                unique = false;
                break;
            }
        }
        return unique;
    }

    public static void main(String[] args) throws Exception {
        int ranNums[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개?");
        int inputNum = scanner.nextInt();
        scanner.close();
        int i = 0;
        while (true) {
            int ranNum = (int) (Math.random() * 100) + 1;
            if (isUnique(ranNums, ranNum)) {
                ranNums[i] = ranNum;
                i++;
            }
            if (inputNum == i) {
                break;
            }
        }
        for (int j = 0; j < inputNum; j++) {
            System.out.print(ranNums[j] + " ");
        }

    }
}
