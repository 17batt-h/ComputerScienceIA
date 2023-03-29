import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String inputFile;
    public static Scanner mainScanner;

    public static void main(String[] args) {
        mainScanner = new Scanner(System.in);
        System.out.println("What file do you want to use: ");
        inputFile = mainScanner.nextLine();
        SeatsLayout.chooseClassroom();
        SeatsLayout.placeNames();
    }
}
