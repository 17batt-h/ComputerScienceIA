import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Student {
    private String firstName;
    private  String lastName;
    private String gender;
    private boolean pp;
    private  String teachingClass;
    public static String nameTag;
    public ArrayList<String> nameTagList = new ArrayList<>();

    public Student(){
        firstName = "null";
        lastName = "null";
        gender = "null";
        pp = false;
        teachingClass = "null";
    }

    public Student(String record){
        //parse record from input file into student
        // Akintayo, Rio	Male	No
        //split on the spaces
        //split name field on comma
        String[] fields = record.split("[,\t]");
        String studentDetails = ("First Name:" + fields[1] + " Last Name: " + fields[0] + " Gender: " + fields[2] + " Pupil Premium?: " + fields[3]);
        nameTag = fields[1] + " " + fields[0];
        //nameTagList.add(nameTag);
        System.out.println(studentDetails);
        JLabel studentNameLabels = new JLabel(nameTag);

        //System.out.println(nameTag);
    }

    public String getNameTag(){
        return nameTag;
    }
}
