import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) throws Exception {
        File src = new File("a.jpg");
        File dest = new File("copy.jpg");
        System.out.println(src.getPath() + "를" + dest.getPath() + "로 복사합니다.");
        System.out.println("10%마다 *를 출력합니다.");
        float fileSize = src.length();
        int tenPercentSize = (int) fileSize / 10;

        try {
            FileInputStream inputStream = new FileInputStream(src);
            FileOutputStream outputStram = new FileOutputStream(dest);
            while (true) {
                int temp = inputStream.read();
                if (temp == -1) {
                    break;
                }
                outputStram.write((byte) temp);
                if (dest.length() % tenPercentSize == 0) {
                    System.out.print("*");
                }
            }
            System.out.println();
            inputStream.close();
            outputStram.close();

        } catch (Exception e) {
            System.out.println("파일 복사 오류." + e);
        }

    }
}
