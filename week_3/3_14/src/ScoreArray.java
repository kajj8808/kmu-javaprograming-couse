import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) throws Exception {
        String course[] = { "Java", "C+", "HTML5" };
        int score[] = { 95, 88, 76 };
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("과목이름>>");
            String inputText = scanner.next();
            if (inputText.equals("그만")) {
                break;
            }
            boolean isFound = false;
            for (int i = 0; i < course.length; i++) {
                if (inputText.equals(course[i])) {
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                System.out.println("없는 과목입니다.");
            }

        }
        scanner.close();
    }
}
