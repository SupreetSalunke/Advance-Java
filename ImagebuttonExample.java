/*
 * 4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).
 */
package Swings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ImagebuttonExample {

    JLabel l1;

    ImagebuttonExample() {

        JFrame f = new JFrame("Image Button Example");

        // Label
        l1 = new JLabel();
        l1.setBounds(50, 50, 400, 50);

        // Load Images (Make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("digitalclock1.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass1.png");

        // Buttons with images
        JButton b1 = new JButton(clockIcon);
        JButton b2 = new JButton(hourglassIcon);

        // Button positions
        b1.setBounds(50, 120, 150, 150);
        b2.setBounds(220, 120, 150, 150);

        // Event handling
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Digital Clock is pressed");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Hour Glass is pressed");
            }
        });

        // Add components
        f.add(b1);
        f.add(b2);
        f.add(l1);

        f.setSize(450, 350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImagebuttonExample();
    }
}