import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
class TableEx{
    public static void main(String[] args) {
       m();
        
    }
    public static void m() {
        JFrame f = new JFrame();
        
        String[][] a= {
            {"1","2","3"},
            {"4","5","6"},
            {"7","8","9"},
            {"10","11","12"}
        };
        
        String[] cols = {"A","B","C"};
        JTable t = new JTable(a, cols);
        JScrollPane m = new JScrollPane(t);
        
        f.add(m);
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

