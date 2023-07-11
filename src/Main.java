import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    //classroom, student data (gender,name,what subject,gender) etc
    public static String inputFile;
    public static Scanner mainScanner;

    public static void main(String[] args) {
        mainScanner = new Scanner(System.in);
        JFrame slay = new JFrame("My Program");
        slay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI myGUI = new GUI(600,400);
        myGUI.setBackground(Color.white);
        slay.add(myGUI);
        slay.pack();
        slay.setVisible(true);
        /*String filename = "slay.txt";
        AllStudents allStudents = new AllStudents(filename);*/
    }
}
