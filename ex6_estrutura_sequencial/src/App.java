import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a,b,c,a_retang,a_circ,a_trap,a_quadr,a_triang,pi;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        pi = 3.14159;
        a_triang = a*c/2;
        a_circ = pi*Math.pow(c, 2);
        a_trap = (a+b)*c/2;
        a_quadr = b*b;
        a_retang = a*b;
        sc.close();
        System.out.printf("TRINGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", a_triang,a_circ,a_trap,a_quadr,a_retang);
    }
}
