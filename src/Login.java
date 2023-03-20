import java.util.Scanner;

public class Login {
    // ask the user for a username and password
    public static void getCredentials(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String Username = myScanner.nextLine();
        System.out.println("Enter username");
        String Password = myScanner.nextLine();
    }
    // search through a file to see if the username and password combo match
    // if they do allow the user access
    // if they don't, prompt the user to try again
}
