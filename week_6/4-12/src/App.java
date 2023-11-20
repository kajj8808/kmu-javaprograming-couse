class Appointment {
    String name;
    int classNum, postion;

    public Appointment(String name, int classNum, int postion) {
        this.name = name;
        this.classNum = classNum;
        this.postion = postion;
    }
}

public class App {

    public static void appointment(Appointment[] arrayList, Appointment arrayItme) {
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] == null) {
                arrayList[i] = arrayItme;
                System.out.println("예약 성공");
                break;
            }
            if (arrayItme.classNum == arrayList[i].classNum && arrayItme.postion == arrayList[i].postion) {
                System.out.println("이 좌석은 이미 예약되어 있습니다.");
                break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Appointment[] appointmentList = new Appointment[100];
        Appointment ticket = new Appointment("황기태", 1, 1);
        appointment(appointmentList, ticket);
        appointment(appointmentList, ticket);
    }
}
