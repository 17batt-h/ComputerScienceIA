import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //classroom, student data (gender,name,what subject,gender) etc
    public static String inputFile;
    public static Scanner mainScanner;

    public static void main(String[] args) {
        /*mainScanner = new Scanner(System.in);
        System.out.println("What file do you want to use: ");
        inputFile = mainScanner.nextLine();
        SeatsLayout.roomH14();
        SeatsLayout.placeNames();*/
        JFrame slay = new JFrame("My Program");
        slay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI myGUI = new GUI(600,400);
        myGUI.setBackground(Color.cyan);
        slay.add(myGUI);
        slay.pack();
        slay.setVisible(true);
    }
}
