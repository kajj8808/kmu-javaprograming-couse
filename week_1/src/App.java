public class App {

    public static void hello_app() {
        System.out.println("Hello");
    }

    public static void main(String[] args) throws Exception {

        hello_app();
        int a = 1;
        boolean b = 10 > a ? true : false;
        char c1 = '1', c2 = '2', c3 = '3';
        System.out.println(a + " hello " + c1 + c2 + c3 + b);
        try {

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
