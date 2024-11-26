public class AirTransport implements Transport {
    public static final double MAX_WEIGHT = 50.0;
    public static final double MAX_DIMENSION = 150.0;

    @Override
    public boolean isApplicable(Package pkg, Location location) {
        return pkg.getWeight() <= MAX_WEIGHT &&
                pkg.getLength() <= MAX_DIMENSION &&
                pkg.getWidth() <= MAX_DIMENSION &&
                pkg.getHeight() <= MAX_DIMENSION;
    }

    @Override
    public void deliver(Package pkg) {
        System.out.println("Entrega aérea confirmada para o pacote.");
    }
}
