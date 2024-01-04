import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;;

public class MainFrame {

    //Main window class 
    private JFrame frame;
    //Main windows left is customer side, right is cashier side.
    private JPanel leftPanel;
    private JPanel rightPanel;

    public MainFrame(){
        initalize();
    }

    private void initalize(){
        this.frame = new JFrame();
        this.frame.setSize(800, 800);
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setLocationRelativeTo(null); //Center frame

        //Main background panel.
        JPanel center = new JPanel();
        center.setBackground(Color.gray);
        this.frame.add(center, BorderLayout.CENTER);

        leftPanel = createPanel(Color.cyan, BorderLayout.WEST, new Dimension(200, 400)); //Cutomer panel
        rightPanel = createPanel(Color.white, BorderLayout.EAST, new Dimension(300, 400)); //Cashier panel.

        show(true);
    }

    //Shortcut method to make JPanels.
    //Used to reduce cluter.
    private JPanel createPanel(Color backgroundColor, String borderlayout, Dimension size){
        JPanel panel = new JPanel();
        panel.setBackground(backgroundColor);
        panel.setPreferredSize(size);
        
        this.frame.add(panel, borderlayout);
        return panel;
    }

    //Method to show frame.
    public void show(boolean visible){
        this.frame.setVisible(visible);
    }
}
