import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel {
    JButton button1;
    JButton button2;

    public GUI(int width, int height) {
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        button1 = new JButton("Create new seating plan");
        button1.setBounds(250, 150, 300, 40);
        button2 = new JButton("Load existing seating plan");
        button2.setBounds(250, 200, 300, 40);
        add(button1);
        add(button2);
    }
}