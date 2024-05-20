import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i <= x; i++){
            System.out.println((int)Math.pow(i, 1) + " " + (int)Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
        }
        sc.close();
    }
}
