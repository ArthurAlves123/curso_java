import entities.Client;

public class App {
    public static void main(String[] args) throws Exception {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("João", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
