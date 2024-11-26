public class Package {
    public double weight;
    public double length;
    public double width;
    public double height;
    public boolean isInternational;

    public Package(double weight, double length, double width, double height, boolean isInternational) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.isInternational = isInternational;
    }

    public double getWeight() { return weight; }
    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public boolean isInternational() { return isInternational; }
}
