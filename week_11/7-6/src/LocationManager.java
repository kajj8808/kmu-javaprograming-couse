import java.util.HashMap;
import java.util.Scanner;

public class LocationManager {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Location> locationDict = new HashMap<String, Location>();
        String city;
        int longitude, latitude;
        System.out.println("도시,경도,위도를 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String[] lineData = scanner.nextLine().split(", ");

            city = lineData[0];
            longitude = Integer.parseInt(lineData[1]);
            latitude = Integer.parseInt(lineData[2]);
            Location location = new Location(longitude, latitude);
            locationDict.put(city, location);
        }
        System.err.println("--------------------------------------------------------");
        for (String key : locationDict.keySet()) {
            System.out.println(key + "\t" + locationDict.get(key).longitude + "\t" + locationDict.get(key).latitude);
        }
        System.err.println("--------------------------------------------------------");
        while (true) {
            System.out.print("도시 이름 >> ");
            String inputTerm = scanner.nextLine();
            try {
                Location locationData = locationDict.get(inputTerm);
                System.out.println(inputTerm + "\t" + locationData.longitude + "\t" + locationData.latitude);
            } catch (Exception e) {
                if (inputTerm.equals("그만")) {
                    break;
                }
                System.out.println(inputTerm + "는 없습니다.");
            }
        }
        scanner.close();
    }
}
