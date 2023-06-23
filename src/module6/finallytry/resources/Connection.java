package module6.finallytry.resources;

public class Connection implements AutoCloseable{

    public Connection() {
        System.out.println("Opening connection");
        throw new IllegalStateException();
    }

    public void readData() {
        System.out.println("Receiving data");
        throw new IllegalStateException();
    }

    public void close() {
        System.out.println("Closing connection");
    }
}
