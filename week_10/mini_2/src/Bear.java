import java.util.Scanner;

public class Bear extends GameObject {

    public Bear(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }

    private boolean checkPositionError(String position, int num) {
        boolean error = false;
        if (num < 0 || num > 10 && position.equals("x")) {
            error = true;
        }
        if (num < 0 || num > 20 && position.equals("y")) {
            error = true;
        }
        if (error) {
            System.out.println("보드 안에서 움직여주세요!");
        }
        return error;
    }

    @Override
    protected void move() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("왼쪽(a) , 아래(s) , 위 (d) , 오른쪽 (f) >> ");
        String moveCommand = scanner.nextLine();

        int newX, newY;
        switch (moveCommand) {
            case "a":
                newX = getX() - this.distance;
                super.x = checkPositionError("x", newX) ? getX() : newX;
                break;
            case "s":
                newY = getY() + this.distance;
                super.y = checkPositionError("y", newY) ? getY() : newY;
                break;
            case "d":
                newY = getY() - this.distance;
                super.y = checkPositionError("y", newY) ? getY() : newY;
                break;
            case "f":
                newX = getX() + this.distance;
                super.x = checkPositionError("x", newX) ? getX() : newX;
                break;
            default:
                System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
                move();
                break;
        }
    }

    @Override
    protected char getShape() {
        return 'B';
    }
}
