import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        System.out.println("What file do you want to use: ");
        String inputFile = mainScanner.nextLine();
        ArrayList<String> names = new ArrayList<String>();
        names = FileHandling.wholeFileRead(inputFile);
        System.out.println("What classroom layout do you want to use: ");
        String classroomSelection = mainScanner.nextLine();
    }
}
