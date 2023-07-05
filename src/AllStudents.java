import java.util.ArrayList;

public class AllStudents {
    private ArrayList<Student> studentList;

    public AllStudents(String filename){
        ArrayList<String> rawdata = FileHandling.wholeFileRead(filename);
        String classCode = "null";
        //skip header for file
        //loop until end of file
        for (int i =1;i < rawdata.size();i++){
            //if line begins with class list report, grab class id
            if (rawdata.get(i).startsWith("Class List Report")){
                classCode = rawdata.get(i).substring(20);
                System.out.println(classCode);
            }
            // if line begins with full name or male: ignore it
            if (rawdata.get(i).startsWith("Full Name") || rawdata.get(i).startsWith("Males: ")){
                continue;
            } else {
                //create new student objects and add to array
                String record = rawdata.get(i);
                Student student = new Student(record);
                studentList.add(student);
            }
        }
    }
}
