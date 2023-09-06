public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        while (true) {
            System.out.println("Hello, World! " + count);
            count++;
            if (count > 10) {
                break;
            }
        }
    }
}
