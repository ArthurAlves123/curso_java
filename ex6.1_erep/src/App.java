import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i <= x; i++){
            if(x % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
