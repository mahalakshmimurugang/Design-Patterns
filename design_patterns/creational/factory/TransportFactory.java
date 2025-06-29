public class TransportFactory {
    public static Transport getTransport(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        } else {
            throw new IllegalArgumentException("Unknown transport type");
        }
    }
}
