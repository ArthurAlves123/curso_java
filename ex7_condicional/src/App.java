import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String msg;
        if(x > 0 && y > 0){
            msg = "Q1";
        }
        else if(x < 0 && y > 0){
            msg = "Q2";
        }
        else if(x < 0 && y < 0){
            msg = "Q3";
        }
        else if(x > 0 && y < 0){
            msg = "Q4";
        }
        else if(x == 0 && y != 0){
            msg = "Eixo X";
        }
        else if(x != 0 && y == 0){
            msg = "Eixo Y";
        }else {
            msg = "Origem";
        }
        System.out.println(msg);
        sc.close();
    }
}
