import hello.Test;

class NewWorld extends Test {
    @Override
    public void world() {
        System.out.println("Hello World");
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        NewWorld newWolrd = new NewWorld();
        newWolrd.world();
    }
}
