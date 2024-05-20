import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int in, out, n;
        in = 0;
        out = 0;
        for(int i = 0; i < x; i++){
            n = sc.nextInt();
            if(n >= 10 && n <=20){
                in += 1;
            } else{out += 1;}
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
