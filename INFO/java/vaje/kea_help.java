import java.util.Scanner;

public class kea_help {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String[][][] mojePoljeImen = new String[2][3][2];
        // {{a, b}{a, b}{a, b}}

        for (int i = 0; i < mojePoljeImen.length; i++) {
            for (int j = 0; j < mojePoljeImen[i].length; j++) {
                for (int h = 0; h < mojePoljeImen[i][j].length; h++) {
                    System.out.println("vnesi vrednost: ");
                    mojePoljeImen[i][j][h] = myScanner.next();
                }
            }
        }
    }
}