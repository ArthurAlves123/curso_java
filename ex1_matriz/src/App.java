import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int [][] matriz = new int[x][y];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int num = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == num) {
                    System.out.println("Position: " + i + "," + j);
                    if (j - 1 >= 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (j + 1 <= matriz[i].length -1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i - 1 >= 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (i + 1 <= matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
