public class ThreeSixNine {
    protected static boolean isTreeSixNine(int num) {
        return num == 3 || num == 6 || num == 9;
    }

    public static void main(String[] args) throws Exception {
        int i = 0;
        int num1, num2;

        while (i < 100) {
            int count = 0;
            num1 = i / 10;
            num2 = i % 10;
            if (isTreeSixNine(num1)) {
                count++;
            }
            if (isTreeSixNine(num2)) {
                count++;
            }
            if (count > 0) {
                System.out.print(i + " 박수 ");
                for (int j = 0; j < count; j++) {
                    System.out.print("짝");
                }
                System.out.println();
            }
            i++;
        }
    }
}
