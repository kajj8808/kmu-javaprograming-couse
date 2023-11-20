import java.util.HashMap;
import java.util.Scanner;

public class HashMapNotation {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> nations = new HashMap<String, Integer>();
        System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000)");
        while (true) {
            System.out.print("나라 이름, 인구 >> ");
            String input = scanner.nextLine();
            if (input.equals("그만")) {
                break;
            }
            String[] splitInput = input.split(" ");
            nations.put(splitInput[0], Integer.parseInt(splitInput[1]));
        }

        while (true) {
            System.out.print("인구 검색 >> ");
            String input = scanner.nextLine();
            if (input.equals("그만")) {
                break;
            }
            try {
                int num = nations.get(input);
                System.out.println(input + "의 인구는 " + num);
            } catch (Exception e) {
                System.out.println(input + "나라는 없습니다.");
            }
        }
        scanner.close();
    }
}
