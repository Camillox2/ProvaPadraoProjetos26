public class TransportSelector {
    public TransportFactory transportFactory;

    public TransportSelector(TransportFactory transportFactory) {
        this.transportFactory = transportFactory;
    }

    public void selectAndDeliver(Package pkg, Location location) {
        Transport transport = transportFactory.getTransport(pkg, location);
        transport.deliver(pkg);
    }
}
