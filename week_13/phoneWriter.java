import java.io.FileWriter;
import java.util.Scanner;

public class phoneWriter {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            // mac환경에서 작업을하여 temp폴더를 만들어 코딩하였습니다.
            FileWriter fileWriter = new FileWriter("temp/phone.txt");
            System.out.println("전화번호 입력 프로그램입니다.");
            while (true) {
                System.out.print("이름 전화번호 >> ");
                String input = scanner.nextLine();
                if (input.equals("그만"))
                    break;
                fileWriter.write(input, 0, input.length());
                fileWriter.write("\r\n", 0, 2);
            }
            scanner.close();
            fileWriter.close();
            System.out.println("/temp/phone.txt에 저장하였습니다.");
        } catch (Exception e) {
            System.out.println("error : " + e);
        }
    }
}
