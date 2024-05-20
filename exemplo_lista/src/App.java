import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();

        list.add("Arthur");
        list.add("Adriano");
        list.add("Flávia");
        list.add(2,"Geraldo");
        
        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------");
        // list.remove(1);
        // list.remove("Geraldo");
        // list.removeIf(x -> x.charAt(0) == 'A');

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------------");

        System.out.println("Index of Flavia: " + list.indexOf("Flávia"));
        System.out.println("Index of João: " + list.indexOf("João"));

        System.out.println("---------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
    }
}
