import java.util.Scanner;

public class V_4Z_20220504_Sluga_Samuel_v4 {
    public static void main(String[] args) {
        int[][][] mojePolje = new int[2][2][2];
        Scanner myScanner = new Scanner(System.in);

        for (int a = 0; a < mojePolje.length; a++) {
            for (int b = 0; b < mojePolje[a].length; b++) {
                for (int c = 0; c < mojePolje[a][b].length; c++) {
                    System.out.print("Prosim vnesi vrednost: ");
                    mojePolje[a][b][c] = myScanner.nextInt();
                }
            }
        }
    }
}
