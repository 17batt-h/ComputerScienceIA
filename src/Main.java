import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String inputFile;
    public static Scanner mainScanner;

    public static void main(String[] args) {
        mainScanner = new Scanner(System.in);
        System.out.println("What file do you want to use: ");
        inputFile = mainScanner.nextLine();
        System.out.println("What classroom layout do you want to use: ");
        String classroomSelection = mainScanner.nextLine();
        SeatsLayout.roomH14();
        SeatsLayout.placeNames();
    }
}
