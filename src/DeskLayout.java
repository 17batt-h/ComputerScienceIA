import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class DeskLayout extends JPanel implements ActionListener{
    private JButton importButton;
    private static final int DESK_WIDTH = 80;
    private static final int DESK_HEIGHT = 40;
    private static final int SPACING = 20;
    private AllStudents allStudents;
    private File selectedFile;

    private int numDesks = 6;

    public DeskLayout() {
        importButton = new JButton("Import Names");
        importButton.setBounds(150, 150, 300, 40);
        importButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Import Names")){
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                //CALL ALLSTUDENTS HERE
                allStudents = new AllStudents(selectedFile.getAbsolutePath());
            } else {
                System.out.println("File selection cancelled.");
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.white);
        add(importButton);

        int panelWidth = getWidth();
        int panelHeight = getHeight();
        int startX = (panelWidth - (numDesks * (DESK_WIDTH + SPACING) - SPACING)) / 2;
        int startY = (panelHeight - DESK_HEIGHT) / 2;

        for (int i = 0; i < numDesks; i++) {
            int x = startX + i * (DESK_WIDTH + SPACING);
            g.drawRect(x, startY, DESK_WIDTH, DESK_HEIGHT);
        }
    }
    public static void DrawDesks()  {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Seating Plan Editor");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);

            DeskLayout deskLayout = new DeskLayout();
            frame.add(deskLayout);

            frame.setVisible(true);
        });
    }

}