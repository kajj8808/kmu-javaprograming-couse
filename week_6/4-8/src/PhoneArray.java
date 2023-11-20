import java.util.Scanner;

class Phone {
    String name;
    String tel;

    protected Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
}

public class PhoneArray {
    protected static void addPhoneAdress(Phone[] phoneBook, Phone phoneAdress) {
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] == null) {
                phoneBook[i] = phoneAdress;
                break;
            }
        }
    }

    protected static void searchPhoneNumber(Phone[] phoneBook, String name) {
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] != null && phoneBook[i].name.equals(name)) {
                System.out.println(name + "의 번호는 " + phoneBook[i].tel + " 입니다.");
                return;
            }
        }
        System.out.println(name + " 이 없습니다.");
    }

    public static void main(String[] args) throws Exception {
        Phone[] phoneBook = new Phone[100];
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int users = scanner.nextInt();
        for (int i = 0; i < users; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = scanner.next();
            String tel = scanner.next();
            Phone phoneAdress = new Phone(name, tel);
            addPhoneAdress(phoneBook, phoneAdress);
        }
        System.out.println("저장되었습니다...");
        scanner.nextLine();
        while (true) {
            System.out.print("검색할 이름>>");
            String payload = scanner.next();

            if (payload.equals("그만")) {
                break;
            }
            searchPhoneNumber(phoneBook, payload);
        }
        scanner.close();
    }
}
