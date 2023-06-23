package module6.finallytry.resources;

public class TestConnection {

    public static void main(String[] args) {

        try (Connection connection = new Connection()) {
            connection.readData();
        } catch (IllegalStateException exception) {
            System.out.println("Connection error");
        }



    /*
        Connection connection = null;
        try {
            connection = new Connection();
            connection.readData();
        }catch (IllegalStateException exception) {
            System.out.println("Connection error");
        } finally {
            connection.close();
        }
    }
     */

    }
}
