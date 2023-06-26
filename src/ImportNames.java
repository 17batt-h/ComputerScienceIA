import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//have a button that imports the names from a CSV file and displays them in a box
//when the button is pressed the user can choose which file to read from
// read the names from the file and add them to an array
//display the array visually

public class ImportNames extends JPanel implements ActionListener{

    public ImportNames(){
        JButton importButton = new JButton("Import Names");
        importButton.setBounds(150, 150, 300, 40);
        add(importButton);
        importButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Import Names")){
            System.out.println("hi");
        } else {
            System.out.println("hey");
        }
    }
}
