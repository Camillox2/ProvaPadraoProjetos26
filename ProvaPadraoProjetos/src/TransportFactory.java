import java.util.ArrayList;
import java.util.List;

public class TransportFactory {
    public List<Transport> transports;

    public TransportFactory() {
        transports = new ArrayList<>();
        transports.add(new LandTransport());
        transports.add(new AirTransport());
        transports.add(new SeaTransport());
        transports.add(new DroneTransport());
    }

    public Transport getTransport(Package pkg, Location location) {
        for (Transport transport : transports) {
            if (transport.isApplicable(pkg, location)) {
                return transport;
            }
        }
        throw new RuntimeException("Indisponiveis os Transportes para essa encomenda.");
    }
}
