public class SeaTransport implements Transport {
    @Override
    public boolean isApplicable(Package pkg, Location location) {
        return pkg.isInternational();
    }

    @Override
    public void deliver(Package pkg) {
        System.out.println("Entrega marítima confirmada para o pacote.");
    }
}
