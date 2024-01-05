import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame {
    //Main window class 
    private JFrame frame;

    //Main windows left is customer side, right is cashier side.
    private JPanel customerPanel;
    private JPanel cashierPanel;

    //Action Commands
    private String addItemComand = "ADDITEM";
    private String perksCommand = "PERKS";


    //Main listener class
    public class ButtonListener implements ActionListener{
        //Grab action commands from different buttons
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals(addItemComand)){
                
            }
            else if(command.equals(perksCommand)){
                int choice = JOptionPane.showConfirmDialog(cashierPanel, "Would the customer like to Enroll in perks?", command, 1);
                if(choice == 0){
                    String firstName = JOptionPane.showInputDialog(cashierPanel, "Please Enter the First Name.");
                    String lastName = JOptionPane.showInputDialog(cashierPanel, "Please Enter the Last Name.");
                    String phoneNumber = JOptionPane.showInputDialog(cashierPanel, "Please Enter the Phone number.");


                }
            }
        }
    }

    //Main ActionListener. 
    private ButtonListener actionListner = new ButtonListener();

    public MainFrame(){
        initalize();
    }

    private void initalize(){
        this.frame = new JFrame();
        this.frame.setSize(800, 800);
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setLocationRelativeTo(null); //Center frame
        this.frame.setLayout(new GridLayout(1, 2, 30, 0)); //Layout for panels.

        //Setting up both panels
        this.customerPanel = createPanel(Color.white);
        this.frame.add(customerPanel);

        this.cashierPanel = createPanel(Color.white); 
        this.cashierPanel.setLayout(new GridLayout(4, 4));
        this.frame.add(cashierPanel);

        //Main add item button.
        JButton addItemButton = new JButton("Add Item");
        addItemButton.setActionCommand(addItemComand);
        addItemButton.addActionListener(actionListner);
        this.cashierPanel.add(addItemButton);

        //Enroll in Perk Menu.
        JButton perksMemeberButton = new JButton("Enroll in Perks");
        perksMemeberButton.setActionCommand(perksCommand);
        perksMemeberButton.addActionListener(actionListner);
        this.cashierPanel.add(perksMemeberButton);

        showFrame(true);
    }

    //Shortcut method to make JPanels.
    //Used to reduce cluter.
    private JPanel createPanel(Color backgroundColor){
        //Gives a border around panel and lets set panel color. 
        JPanel panel = new JPanel();
        panel.setBackground(backgroundColor);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        return panel;
    }

    //Method to show frame.
    public void showFrame(boolean visible){
        this.frame.setVisible(visible);
    }
}
