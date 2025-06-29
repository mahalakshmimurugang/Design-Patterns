public class Main {
    public static void main(String[] args) {
        Transport transport1 = TransportFactory.getTransport("car");
        transport1.deliver();

        Transport transport2 = TransportFactory.getTransport("bike");
        transport2.deliver();
    }
}
