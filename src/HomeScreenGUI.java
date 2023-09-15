import javax.swing.*;
import java.awt.*;

public class HomeScreenGUI {

    public static void homeScreen() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Home");
        frame.setSize(800,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setResizable(false);
        panel.setLayout(null);

        JButton createProject = createProjectButton(frame);
        createProject.setFocusable(false);
        panel.add(createProject);
        panel.setBackground(Color.white);

        frame.setVisible(true);

    }

    public static JButton createProjectButton(JFrame frame) {
        JButton createProject = new JButton("Create New Project");
        createProject.setBounds(10,10,300,75);
        createProject.addActionListener(e -> {
            frame.dispose();
            ProjectCreationGUI.baseScreen();
        });
        return createProject;
    }


}
