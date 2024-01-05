import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
import javax.swing.border.Border;

public class PerksMenu {
    private JFrame frame;
    private JPanel mainPanel;
    private JPanel arrowPanel; 

    public PerksMenu(){
        initalize();
    }

    private void initalize(){
        this.frame = new JFrame();
        this.frame.setSize(300, 400);
        this.frame.setLocationRelativeTo(frame);
        
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.gray);

        arrowPanel = new JPanel();
        arrowPanel.setBackground(Color.green);

        this.frame.add(mainPanel);
        this.frame.add(arrowPanel, BorderLayout.SOUTH);

    }

}
