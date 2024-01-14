import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExampleDemo implements ActionListener {
    JMenuBar bar;
    JMenu ari, log, op;
    JMenuItem add, sub, mul, div, and, or, not;

    MenuExampleDemo() {
        JFrame frame = new JFrame("Menu Bar Operations");
        frame.setSize(1000, 1000);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        bar = new JMenuBar();
        frame.add(bar);
        op = new JMenu("Operations");
        bar.add(op);

        ari = new JMenu("Arithematic");
        log = new JMenu("Logical");
        op.add(ari);
        op.add(log);

        add = new JMenuItem("ADD");
        sub = new JMenuItem("SUB");
        mul = new JMenuItem("MUL");
        div = new JMenuItem("DIV");
        ari.add(add);
        ari.add(sub);
        ari.add(mul);
        ari.add(div);

        and = new JMenuItem("AND");
        or = new JMenuItem("OR");
        not = new JMenuItem("NOT");
        log.add(and);
        log.add(or);
        log.add(not);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        and.addActionListener(this);
        or.addActionListener(this);
        not.addActionListener(this);
        frame.pack();

    }

    public void actionPerformed(ActionEvent e) {

        
        if (e.getSource() == add) {
            JOptionPane.showMessageDialog(add, "add");
        } else if (e.getSource() == sub) {
            JOptionPane.showMessageDialog(sub, "sub");
        } else if (e.getSource() == mul) {
            JOptionPane.showMessageDialog(mul, "mul");
        } else if (e.getSource() == div) {
            JOptionPane.showMessageDialog(div, "div");
        } else if (e.getSource() == and) {
            JOptionPane.showMessageDialog(and, "and");
        } else if (e.getSource() == or) {
            JOptionPane.showMessageDialog(or, "or");
        } else if (e.getSource() == not) {
            JOptionPane.showMessageDialog(not, "not");
        }
    }

    public static void main(String[] args) {
        MenuExampleDemo m = new MenuExampleDemo();
    }
}
