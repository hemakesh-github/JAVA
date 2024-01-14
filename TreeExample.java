        import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTree Example");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Creating nodes
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");

        // Adding nodes to the root
        root.add(node1);
        root.add(node2);

        // Creating the JTree
        JTree tree = new JTree(root);
        frame.add(tree);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
