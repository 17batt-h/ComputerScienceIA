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
    private ArrayList<JLabel> labels; // Add the labels list
    private int x = 20;
    private int numDesks = 6;
    public JPanel labelPanel = new JPanel(null);

    public DeskLayout() {
        setLayout(new BorderLayout());
        importButton = new JButton("Import Names");
        importButton.addActionListener(this);
        add(importButton, BorderLayout.NORTH);
        labels = new ArrayList<>(); // Initialize the labels list
        JLabel tester = new JLabel("slay");
        add(tester);
        add(labelPanel, BorderLayout.CENTER);
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
                //System.out.println(allStudents.getNameTags());
                int currentY = 150; // Y position for label placement
                for (int tS = 0; tS < allStudents.getNameTags().size(); tS++) {
                    JLabel nameLabel = new JLabel(allStudents.getNameTags().get(tS));
                    labels.add(nameLabel);
                    nameLabel.setBounds(20, currentY, nameLabel.getPreferredSize().width, nameLabel.getPreferredSize().height);
                    currentY=currentY+15; // Increment the y position for the next label
                    add(nameLabel); // Add the label to the panel
                }
                revalidate(); // Trigger layout update to show the labels
                repaint(); // Trigger repaint to show the labels
            } else {
                System.out.println("File selection cancelled.");
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.white);

        // Draw the desks
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        int startX = (panelWidth - (numDesks * (DESK_WIDTH + SPACING) - SPACING)) / 2;
        int startY = (panelHeight - DESK_HEIGHT) / 2;

        for (int i = 0; i < numDesks; i++) {
            int x = startX + i * (DESK_WIDTH + SPACING);
            g.drawRect(x, startY, DESK_WIDTH, DESK_HEIGHT);
        }
    }

    private void positionLabels() {
        int currentY = 0; // Y position for label placement
        for (JLabel label : labels) {
            label.setBounds(20, currentY, label.getPreferredSize().width, label.getPreferredSize().height);
            currentY += 16; // Increment the y position for the next label
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