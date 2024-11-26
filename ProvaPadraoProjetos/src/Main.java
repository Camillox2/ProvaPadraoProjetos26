public class Main {
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();
        TransportSelector selector = new TransportSelector(factory);


        Package landPackage = new Package(10, 30, 30, 20, false);
        Location landLocation = new Location("São Paulo", false);
        System.out.println("Entrega para transporte terrestre:");
        selector.selectAndDeliver(landPackage, landLocation);


        Package airPackage = new Package(20, 50, 50, 50, false);
        Location airLocation = new Location("Brasília", false);
        System.out.println("\nEntrega para transporte aéreo:");
        selector.selectAndDeliver(airPackage, airLocation);


        Package seaPackage = new Package(100, 200, 150, 100, true);
        Location seaLocation = new Location("Lisboa", false);
        System.out.println("\nEntrega para transporte marítimo:");
        selector.selectAndDeliver(seaPackage, seaLocation);


        Package dronePackage = new Package(1.5, 30, 30, 20, false);
        Location droneLocation = new Location("Curitiba", true);
        System.out.println("\nEntrega por drone:");
        selector.selectAndDeliver(dronePackage, droneLocation);
    }
}
