class Fish extends GameObject {

    int[] fishPatten = new int[5];
    int fishPattenCount = 0;

    public Fish(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }

    /**
     * fish의 움직임 패턴을 생성합니다.
     * 패턴은 5번중 2번을 움직입니다.
     */
    protected void setFishPatten() {
        for (int i = 0; i < fishPatten.length; i++) {
            fishPatten[i] = 0;
        }

        int fishPattenCount = 0;
        while (true) {
            int ranIndex = (int) (Math.random() * 5);
            if (fishPatten[ranIndex] == 0) {
                fishPatten[ranIndex] = 1;
                fishPattenCount++;
            }
            if (fishPattenCount == 2) {
                break;
            }
        }
    }

    private boolean checkPositionError(String position, int num) {
        boolean error = false;
        if (num < 0 || num > 10 && position.equals("x")) {
            error = true;
        }
        if (num < 0 || num > 20 && position.equals("y")) {
            error = true;
        }
        return error;
    }

    @Override
    protected char getShape() {
        return '@';
    }

    @Override
    protected void move() {
        if (fishPattenCount == 5) {
            setFishPatten();
            fishPattenCount = 0;
        }
        /* 만약 물고기가 움직일 때라면 (패턴에서 1) 위, 아래, 왼쪽 , 오른쪽으로 움직입니다. */
        if (fishPatten[fishPattenCount] == 1) {
            int moveKey = (int) (Math.random() * 4);
            int newX, newY;
            // 0 ->위 , 1->왼쪽 , 2->아래 , 3->오른쪽
            switch (moveKey) {
                case 0:
                    newY = getY() - this.distance;
                    if (checkPositionError("y", newY)) {
                        move();
                    } else {
                        super.y = newY;
                    }
                    break;
                case 1:
                    newX = getX() - this.distance;
                    if (checkPositionError("x", newX)) {
                        move();
                    } else {
                        super.x = newX;
                    }
                    break;
                case 2:
                    newY = getY() + this.distance;
                    if (checkPositionError("y", newY)) {
                        move();
                    } else {
                        super.y = newY;
                    }
                    break;
                case 3:
                    newX = getX() + this.distance;
                    if (checkPositionError("x", newX)) {
                        move();
                    } else {
                        super.x = newX;
                    }
                    break;
                default:
                    break;
            }
        }
        fishPattenCount++;
    }

}
