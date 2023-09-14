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
        frame.setResizable(false);

        JButton importNames = importNamesButton(frame);

        frame.setVisible(true);
    }

    public static JButton importNamesButton(JFrame frame){
        JButton importNames = new JButton("Import Names");
        importNames.setFocusable(false);
        importNames.setBounds(10,10,10,10);
        importNames.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if(returnValue == JFileChooser.APPROVE_OPTION){

            }

        });
        return importNames;
    }


}
