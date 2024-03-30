package desafio.leitor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitor {
    Scanner scannerDouble = new Scanner(System.in);
    Scanner scannerInt = new Scanner(System.in);
    Scanner scannerString = new Scanner(System.in);

    public double leDouble() throws InputMismatchException {
        return Double.parseDouble(scannerDouble.nextLine());
    }

    public int leInt() throws InputMismatchException {
        return Integer.parseInt(scannerInt.nextLine());
    }

    public String leString() {
        return scannerInt.nextLine();
    }
}
