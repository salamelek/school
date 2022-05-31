import java.util.Scanner;

public class V_4Z_20220504_Sluga_Samuel_v2 {
    public static void main(String[] args) {
        int[][] mojePolje = new int[3][2];
        Scanner myScanner = new Scanner(System.in);

        for (int a = 0; a < mojePolje.length; a++) {
            for (int b = 0; b < mojePolje[a].length; b++) {
                System.out.print("Prosim vnesi vrednost: ");
                mojePolje[a][b] = myScanner.nextInt();
            }
        }
    }
}
