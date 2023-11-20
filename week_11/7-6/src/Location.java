public class Location {
    int longitude;
    int latitude;

    public Location(int longitude, int latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    protected int getLong() {
        return longitude;
    }

    protected int getLat() {
        return latitude;
    }
}
