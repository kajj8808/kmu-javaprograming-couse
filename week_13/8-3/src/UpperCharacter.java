import java.io.FileReader;

public class UpperCharacter {
    public static void main(String[] args) throws Exception {
        try {
            // mac 환경에서 코딩을 해서 ini파일을 임시로 만들어 사용했습니다.
            FileReader fileReader = new FileReader("system.ini");

            while (true) {
                int bit = fileReader.read();
                if (bit == -1) {
                    break;
                }
                System.out.print(Character.toUpperCase((char) bit));
            }
            System.out.println();

            fileReader.close();
        } catch (Exception e) {
            System.out.println("error : " + e);
        }

    }
}
