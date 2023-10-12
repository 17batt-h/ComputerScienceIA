import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ProjectCreationGUI {
    private static File selectedFile;
    private static AllStudents allStudents;

    public static void baseScreen() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(800,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.white);
        frame.setResizable(false);

        JButton importNames = importNamesButton(frame);
        panel.add(importNames);
        JTextArea textArea = new JTextArea("slay");
        textArea.setEditable(false); // Prevent editing
        panel.add(textArea);

        frame.setVisible(true);
    }

    public static JButton importNamesButton(JFrame frame){
        JButton importNames = new JButton("Import Names");
        importNames.setFocusable(false);
        importNames.setBounds(10,10,150,25);
        importNames.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if(returnValue == JFileChooser.APPROVE_OPTION){
                selectedFile = fileChooser.getSelectedFile();
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                allStudents = new AllStudents(selectedFile.getAbsolutePath());
                for (int i = 0; i < allStudents.getNameTags().size(); i++) {
                    System.out.println(allStudents.getNameTags().get(i));
                }
            } else {
                System.out.println("File selection cancelled.");
            }
        });
        return importNames;
    }


}

