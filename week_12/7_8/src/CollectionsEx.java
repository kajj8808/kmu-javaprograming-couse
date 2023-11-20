import java.util.HashMap;
import java.util.Scanner;

public class CollectionsEx {

    static protected void printProduct(HashMap<String, Integer> productHashMap) {
        for (String key : productHashMap.keySet()) {
            Integer value = productHashMap.get(key);
            System.out.print("(" + key + "," + value + ")");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> productHashMap = new HashMap<String, Integer>();

        System.out.println("** 포인트 관리 프로그램 입니다. **");
        while (true) {
            System.out.print("이름과 포인트 입력>> ");

            String term = scanner.nextLine();
            if (term.equals("그만")) {
                break;
            }

            String[] lineDatas = term.split(" ");

            String key = lineDatas[0];
            Integer value = Integer.parseInt(lineDatas[1]);

            if (productHashMap.get(key) != null) {
                productHashMap.put(key, productHashMap.get(key) + value);

            } else {
                productHashMap.put(key, value);
            }
            printProduct(productHashMap);
        }

        scanner.close();

    }
}
