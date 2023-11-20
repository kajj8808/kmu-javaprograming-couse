import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class WordQuiz {

    static public class Word {
        String key, value;

        public Word(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Vector<Word> wordDict = new Vector<Word>();

        wordDict.add(new Word("love", "그림"));
        wordDict.add(new Word("love", "감정"));
        wordDict.add(new Word("love", "아기"));
        wordDict.add(new Word("love", "오류"));
        wordDict.add(new Word("love", "사회"));
        wordDict.add(new Word("love", "인형"));
        wordDict.add(new Word("love", "곰"));
        wordDict.add(new Word("love", "보기"));
        wordDict.add(new Word("love", "눈"));
        wordDict.add(new Word("love", "거래"));
        wordDict.add(new Word("love", "사진"));
        wordDict.add(new Word("love", "인간"));
        wordDict.add(new Word("love", "조각상"));
        wordDict.add(new Word("love", "명품"));
        wordDict.add(new Word("love", "영어"));
        wordDict.add(new Word("love", "사랑"));
        wordDict.add(new Word("love", "동물"));

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("-1")) {
                break;
            }
        }
    }
}
