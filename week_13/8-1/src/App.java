import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class WordFileReader {
    ArrayList<String> words = new ArrayList<>();

    public WordFileReader() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("words.txt"));
            while (true) {
                String word = bufferedReader.readLine();
                if (word == null)
                    break;
                this.words.add(word);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("error : " + e);
        }
    }

    public String getRandomWord() {
        Random random = new Random();
        int randomIndex = random.nextInt(this.words.size());
        return this.words.get(randomIndex);
    }

    public ArrayList<String> makeHideList(String word, int hideSize) {
        ArrayList<String> hideList = new ArrayList<>();
        Random random = new Random();
        for (int index = 0; index < word.length(); index++) {
            hideList.add("-");
        }

        int hideCount = 0;
        while (true) {
            int randomIndex = random.nextInt(word.length());
            if (hideList.get(randomIndex) == "-") {
                hideList.set(randomIndex, word.split("")[randomIndex]);
                hideCount++;
            }
            if (hideSize == hideCount) {
                break;
            }
        }

        return hideList;
    }
}

public class App {
    // 숨겨진 값들을 - 으로 출력합니다.
    static void printHidedWord(String originalWord, ArrayList<String> hideList) {
        String splitedWord[] = originalWord.split("");
        for (int i = 0; i < hideList.size(); i++) {
            if (splitedWord[i].equals(hideList.get(i))) {
                System.out.print("-");
                continue;
            }
            System.out.print(splitedWord[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        WordFileReader wordFileReader = new WordFileReader();

        System.out.println("지금부터 행맨 게임을 시작합니다.");

        while (true) {
            String word = wordFileReader.getRandomWord();
            ArrayList<String> hideList = wordFileReader.makeHideList(word, 2);
            int outCount = 0;
            printHidedWord(word, hideList);
            while (true) {
                System.out.print(">> ");
                String input = scanner.nextLine();

                boolean isCurrent = false;
                for (int i = 0; i < hideList.size(); i++) {
                    if (hideList.get(i).equals(input)) {
                        hideList.set(i, "-");
                        isCurrent = true;
                    }
                }
                if (!isCurrent) {
                    outCount++;
                }
                if (outCount == 4) {
                    System.out.println("5번 실패 하였습니다.");
                    System.out.println(word);
                    break;
                }
                printHidedWord(word, hideList);

                boolean isDone = true;
                for (int i = 0; i < hideList.size(); i++) {
                    if (!hideList.get(i).equals("-")) {
                        isDone = false;
                    }
                }
                if (isDone) {
                    break;
                }
            }
            System.out.print("Next(y/n)?");
            String isContinue = scanner.nextLine();
            if (isContinue.equals("y")) {
                continue;
            } else {
                break;
            }
        }
        scanner.close();
    }
}
