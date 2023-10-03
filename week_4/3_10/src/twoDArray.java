
public class twoDArray {
    public static void main(String[] args) throws Exception {
        int arr[][] = new int[4][4];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (count == 10) {
                    break;
                }
                arr[i][j] = (int) (Math.random() * 10) + 1;
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
