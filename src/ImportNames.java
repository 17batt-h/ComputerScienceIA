import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

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
    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            // Do something with the selected file
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        } else {
            System.out.println("File selection cancelled.");
        }
    }




}

