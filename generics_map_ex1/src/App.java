import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();
        Map<String, Integer> votation = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String [] fields = line.split(",");
                String name = fields[0];
                int qVotes = Integer.parseInt(fields[1]);

                if(votation.containsKey(name)){
                    votation.put(name, votation.get(name) + qVotes);
                }
                else {
                    votation.put(name, qVotes);
                }
                line = br.readLine();
            }

            for (String key : votation.keySet()) {
                System.out.println(key + ": " + votation.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
