import java.util.Scanner;

public class kea_help {
    public static void main(String[] args) {
        Scanner mojScanner = new Scanner(System.in);
        int[] mojepolje = new int[3];

        for (int i = 0; i < mojepolje.length; i++) {
            System.out.print("Vnsesi " + (i + 1) + ". številko: ");
            mojepolje[i] = mojScanner.nextInt();
        }

        for (int j : mojepolje) {
            System.out.println(j);
        }
    }
}