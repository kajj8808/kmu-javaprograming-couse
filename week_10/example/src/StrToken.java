import java.util.StringTokenizer;

public class StrToken {
    public static void main(String[] args) throws Exception {
        String query = "name=kitae&addr=seoul&age=21";
        StringTokenizer st = new StringTokenizer(query, "&=");
        for (int i = 0; i <= st.countTokens(); i++) {
            System.out.println(st.nextToken());

        }

    }
}
