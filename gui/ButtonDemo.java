import java.awt.Frame;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ButtonDemo extends Frame implements ActionListener {
    Button yes, no, maybe;
    String msg;
    ButtonDemo() {
        setLayout(new FlowLayout());
        setSize(300, 300);
        yes = new Button("Yes");
        no = new Button("No");
        maybe = new Button("Undecided");
        add(yes);
        add(no);
        add(maybe);

        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str.equals("Yes")) {
            msg = "You pressed Yes.";
        }
        else if(str.equals("No")) {
            msg = "You pressed No.";
        }
        else {
            msg = "You pressed Undecided.";
        }

        repaint();

    }
    public void paint(Graphics g) {
        g.drawString(msg, 6, 100);
    }
    public static void main(String args[]) {
        ButtonDemo b = new ButtonDemo();
        b.setVisible(true);
    }
}
