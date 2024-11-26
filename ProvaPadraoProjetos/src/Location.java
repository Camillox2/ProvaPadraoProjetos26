public class Location {
    public String city;
    public boolean isMetropolitan;

    public Location(String city, boolean isMetropolitan) {
        this.city = city;
        this.isMetropolitan = isMetropolitan;
    }

    public boolean isMetropolitan() { return isMetropolitan; }
    public String getCity() { return city; }
}
