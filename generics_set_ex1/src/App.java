import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] log = line.split(" ");
                String username = log[0];
                Instant moment = Instant.parse(log[1]);
                set.add(new LogEntry(username, moment));
                line = br.readLine();
            }
            System.out.print("Total users: " + set.size());
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
