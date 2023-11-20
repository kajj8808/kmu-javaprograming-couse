public class Main {
    /** 게임이 끝났는지 체크합니다. (Bear가 이겼는지 여부) */
    static boolean gameEndCheck(Fish fish, Bear bear) {
        boolean isEnd = false;
        if (fish.getX() == bear.getX() && fish.getY() == bear.getY()) {
            isEnd = true;
        }
        return isEnd;
    }

    /** board를 출력합니다. */
    static void printGameBoard(String[][] board, Fish fish, Bear bear) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == bear.getY() && j == bear.getX()) {
                    System.out.print(bear.getShape());
                } else if (i == fish.getY() && j == fish.getX()) {
                    System.out.print(fish.getShape());
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int rows = 10;
        int cols = 20;
        /** rows 가 10 , cols가 20 인 보드를 생성합니다. */
        String[][] board = new String[rows][cols];

        Fish fish = new Fish(5, 6, 1);
        Bear bear = new Bear(0, 0, 1);

        System.out.println("**Bear의 Fish 먹기 게임을 시작합니다.**");
        fish.setFishPatten();
        printGameBoard(board, fish, bear);
        while (true) {
            bear.move();
            if (gameEndCheck(fish, bear)) {
                printGameBoard(board, fish, bear);
                System.out.println("Bear Wins!!");
                break;
            }
            // 잡히지 않았으면 움직입니다.
            fish.move();
            printGameBoard(board, fish, bear);
        }
    }
}
