import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

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
        this.frame.setLayout(new GridBagLayout());
        //Needed class for gridbaglayout.
        GridBagConstraints gbc = new GridBagConstraints();

        //Setting location for panel.
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.gridwidth = 2;
        gbc.ipady = 10;
        leftPanel = createPanel(Color.white); //Cutomer panel
        this.frame.add(leftPanel, gbc);

        rightPanel = createPanel(Color.white); //Cashier panel.

        show(true);
    }

    //Shortcut method to make JPanels.
    //Used to reduce cluter.
    private JPanel createPanel(Color backgroundColor){
        JPanel panel = new JPanel();
        panel.setBackground(backgroundColor);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        return panel;
    }

    //Method to show frame.
    public void show(boolean visible){
        this.frame.setVisible(visible);
    }
}
