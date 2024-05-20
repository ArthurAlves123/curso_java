import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int result;
        if(h1 < h2){
            result = h2 - h1;
        }
        else {
            result = 24 - h1 + h2;
        }
        System.out.printf("O JOGO DUROU %d HORA(S).%n", result);
        sc.close();
    }
}
