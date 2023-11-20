import java.util.Scanner;

public class Group {

    private String groupName;
    // 10칸의 Seat
    private Seat[] seats = new Seat[10];

    public Group(String groupName) {
        this.groupName = groupName;
        for (int i = 0; i < seats.length; i++) {
            seats[i] = new Seat("");
        }
    }

    public void reserve() {
        Scanner scanner = new Scanner(System.in);
        showReservedList();
        System.out.print("이름>>");
        String reserverName = scanner.nextLine();
        System.out.print("번호>>");
        int seatNum = scanner.nextInt();
        seats[seatNum - 1].setReserverName(reserverName);
    }

    public void cancel(int type) {
        Scanner scanner = new Scanner(System.in);
        showReservedList();
        System.out.print("이름>>");
        String reserverName = scanner.nextLine();
        for (int i = 0; i < seats.length; i++) {
            if (seats[i].getReserverName().equals(reserverName)) {
                seats[i].setReserverName("");
            }
        }

    }

    public void showReservedList() {
        System.out.print(this.groupName + ">> ");
        for (int i = 0; i < seats.length; i++) {
            System.out.print(seats[i].getReserverName() == "" ? "--- " : seats[i].getReserverName());
        }
        System.out.println();
    }

}
