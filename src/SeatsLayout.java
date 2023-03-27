import java.util.ArrayList;
import java.util.Scanner;

public class SeatsLayout {
    //each classroom has a set number of desks
    // when the program is run an arraylist will be made that contains the desks represented as numbers
    //seats will be arranged differently depending on the classroom - method required for each classroom
    //needs an array of numbers to assign seats to names

    public static ArrayList<String> seats = new ArrayList<String>();

    public static void chooseClassroom(){
        System.out.println("What classroom layout do you want to use: ");
        String classroomSelection = Main.mainScanner.nextLine();
        if (classroomSelection.equals("h14")){
            roomH14();
        } else if (classroomSelection.equals("h11")){
            System.out.println("h11");
        } else if (classroomSelection.equals("h12")){
            System.out.println("h12");
        } else if (classroomSelection.equals("h13")){
            System.out.println("h13");
        }
    }

    public static void placeNames(){
        ArrayList<String> names = new ArrayList<String>();
        names = StudentNames.getNames();
        boolean finished = false;
        int i = 0;
        while (finished != true){
            System.out.println("Where do you want to place this student?: " + names.get(i));
            int seatNum = Main.mainScanner.nextInt();
            Main.mainScanner.nextLine();
            seats.set(seatNum - 1, "[" + names.get(i) + "]");
            System.out.println("Do you want to add another student?");
            String userAnswer = Main.mainScanner.nextLine();
            if (userAnswer.equals("no")){
                finished = true;
            }
            i++;
        }
        for (int a=0;a<seats.size();a++) {
            System.out.print(seats.get(a));
        }
    }

    public static void roomH14(){
        //creates an arraylist and fills it with numbers
        int counter = 0;
        for (int i = 1; i < 19; i++){
            seats.add("[" + i + "]");
            counter++;
            if (counter == 6){
                seats.add("\n");
                counter = 0;
            }
        }
        for (int i=0;i<seats.size();i++) {
            System.out.print(seats.get(i));
        }
    }

}
