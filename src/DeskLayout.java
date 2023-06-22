import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DeskLayout extends JPanel {
    private static final int DESK_WIDTH = 80;
    private static final int DESK_HEIGHT = 40;
    private static final int SPACING = 20;

    private BufferedImage backgroundImage;

    private int numDesks = 6;

    public DeskLayout (){
        try {
            // Load the image from a file
            backgroundImage = ImageIO.read(new File("C:\\Users\\17batt_h\\Downloads\\slayyyyy.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0,getWidth(), getHeight(),this);
        }

        int panelWidth = getWidth();
        int panelHeight = getHeight();
        int startX = (panelWidth - (numDesks * (DESK_WIDTH + SPACING) - SPACING)) / 2;
        int startY = (panelHeight - DESK_HEIGHT) / 2;

        for (int i = 0; i < numDesks; i++) {
            int x = startX + i * (DESK_WIDTH + SPACING);
            g.drawRect(x, startY, DESK_WIDTH, DESK_HEIGHT);
        }
    }

    public void setNumDesks(int numDesks) {
        this.numDesks = numDesks;
        repaint();
    }

    public static void DrawDesks()  {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Desk Layout");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);

            DeskLayout deskLayout = new DeskLayout();
            frame.add(deskLayout);

            frame.setVisible(true);
        });
    }



}