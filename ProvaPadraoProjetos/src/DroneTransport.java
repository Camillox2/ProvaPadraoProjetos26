public class DroneTransport implements Transport {
    public static final double MAX_WEIGHT = 2.0;
    public static final double MAX_DIMENSION = 50.0;

    @Override
    public boolean isApplicable(Package pkg, Location location) {
        return location.isMetropolitan() &&
                pkg.getWeight() <= MAX_WEIGHT &&
                pkg.getLength() <= MAX_DIMENSION &&
                pkg.getWidth() <= MAX_DIMENSION &&
                pkg.getHeight() <= MAX_DIMENSION;
    }

    @Override
    public void deliver(Package pkg) {
        System.out.println("Entrega por drone confirmada para o pacote.");
    }
}
