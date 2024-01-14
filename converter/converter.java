import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class converter implements ActionListener{
    JTextField jtf1, jtf2;
    JButton button;
    JRadioButton jrb1, jrb2;
    ButtonGroup bg;
    converter() {
        JFrame f = new JFrame("Converter");
        f.setSize(300,300);
        f.setVisible(true);
        
        f.setLayout(new GridLayout(4,3));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("Square Yards");
        jtf1 = new JTextField(10);
        jtf2 = new JTextField(10);
        jtf2.setEditable(false);

        button = new JButton("Convert");
        jrb1 = new JRadioButton("Cents");
        jrb2 = new JRadioButton("Square Feets");
        bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        
        f.add(label);
        f.add(jtf1);
        f.add(new JLabel());
        
        f.add(jrb1);
        f.add(jtf2);
        f.add(new JLabel());
        
        f.add(jrb2);
        f.add(new JLabel());
        f.add(new JLabel()); 
       
        f.add(new JLabel());
        f.add(button);
        f.add(new JLabel());
        f.pack();

        button.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent ae) {
        double c = 0;
        try {
            double x = Double.parseDouble(jtf1.getText());
            if (jrb1.isSelected()) {
                System.out.println(jrb1.getText());
                
                c = x * 48.4;
            }
            else if(jrb2.isSelected()) {
                c = x * 9;
            }
            jtf2.setText(String.valueOf(c));
        }
        catch(NumberFormatException n) {
            System.out.println("Enter a numerical value");
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        converter c = new converter();
        
    }
}

