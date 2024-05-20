import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(Math.abs(n) % 2 == 1){
            System.out.println("IMPAR");
        }else{
            System.out.println("PAR");
        }
        sc.close();
    }
}
