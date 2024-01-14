import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTextFieldExample {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("ButtonTextField Example");

        // Creating a JTextField
        JTextField textField = new JTextField(20);

        // Creating a JButton
        JButton button = new JButton("Submit");

        // Creating an ActionListener implementation
      

        // Adding ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            double t = Integer.parseInt(textField.getText());
                JOptionPane.showMessageDialog(frame, Math.sqrt(t));
            }
        });

        // Creating a JPanel to hold the components
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);

        // Adding the panel to the frame
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
   
}
