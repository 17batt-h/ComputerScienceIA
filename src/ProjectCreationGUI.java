import javax.swing.*;
import java.awt.*;

public class ProjectCreationGUI {

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
                System.out.println("slay queen");
            } else {
                System.out.println("File selection cancelled.");
            }
        });
        return importNames;
    }


}
