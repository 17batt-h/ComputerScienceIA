public class Student {
    private String firstName;
    private  String lastName;
    private String gender;
    private boolean pp;
    private  String teachingClass;

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
        String[] fields = record.split(" ");
        System.out.println(fields[0]);
        System.out.println(fields[1]);
        System.out.println(fields[2]);
        //split name field on comma
    }
}
