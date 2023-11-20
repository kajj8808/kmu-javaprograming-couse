import java.util.Stack;

interface IStack<T> {
    T pop();

    boolean push(T ob);

}

public class MyStck {
    static class MyStack<T> implements IStack<T> {
        Stack<T> stack = new Stack<T>();

        @Override
        public T pop() {
            return stack.isEmpty() ? null : stack.pop();
        }

        @Override
        public boolean push(T ob) {
            return stack.add(ob);
        }

    }

    public static void main(String[] args) throws Exception {
        IStack<Integer> stack = new MyStack<Integer>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        while (true) {
            Integer n = stack.pop();
            if (n == null)
                break;
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
