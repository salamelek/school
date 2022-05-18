import java.util.Scanner;

public class V_4Z_20220504_Sluga_Samuel_v1 {
    public static void main(String[] args) {
        int[] mojePolje = new int[3];
        Scanner myScanner = new Scanner(System.in);

        for (int i = 0; i < mojePolje.length; i++) {
            System.out.print("Prosim vnesi vrednost: ");
            mojePolje[i] = myScanner.nextInt();
        }
    }
}
