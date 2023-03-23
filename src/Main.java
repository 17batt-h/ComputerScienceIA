import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String inputFile;
    public static Scanner mainScanner;

    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        System.out.println("What file do you want to use: ");
        inputFile = mainScanner.nextLine();
        System.out.println("What classroom layout do you want to use: ");
        String classroomSelection = mainScanner.nextLine();
        //SeatsLayout.placeNames("slay.txt");
        SeatsLayout.roomH14();

    }
}
