import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x >= 1 && x <= 1000){
            for(int i = 0; i <= x; i++){
                if(i % 2 == 1){
                    System.out.println(i);
                }
            }
        } else {System.out.println("ERRO");}
        sc.close();
    }
}
