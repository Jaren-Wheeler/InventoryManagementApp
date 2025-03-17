
package view;

import model.Model;
import controller.Controller;

import java.util.Scanner;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class mainView {
    public JFrame window;
    public JPanel loginPanel;
    public JButton enterBtn, createAccBtn;

    public mainView() {
        initializeWindow();
    }

    //method for the window
    public void initializeWindow() {


        // basic window information
        window = new JFrame("Inventory Manager");
        window.setSize(1280,720);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());


        // create panel object to store login window elements.
        loginPanel = new JPanel(new GridLayout(3,2,10,100));
    
        //loginPanel.setBounds(500,300,300,300); // position on window
        loginPanel.setPreferredSize(new Dimension(300,700));

        // username label and text fiel d
        JLabel usernameLbl = new JLabel("Username:");
        JTextField usernameField = new JTextField();


        // password label and text field
        JLabel passwordLbl = new JLabel("Password:");
        JTextField passwordField = new JTextField();


        // enter button and create account button
        enterBtn = new JButton("Enter");
        createAccBtn = new JButton("Create Account");

       

        // add all elements to the panel
        loginPanel.add(usernameLbl);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLbl);
        loginPanel.add(passwordField);
        loginPanel.add(enterBtn);
        loginPanel.add(createAccBtn);


        window.add(loginPanel); // add panel to window
        window.setVisible(true);

    }
    
    // create the pop up window when creating a new account
    public void createAccWindow() {
        JPanel createAccPanel = new JPanel();
        createAccPanel.setLayout(new GridLayout(4,2,10,20)); // grid layout design
       
        
        // label and text field for username
        JLabel usernameLbl = new JLabel("Enter a username");
        JTextField  usernameField = new JTextField();

        // label and text field for password
        JLabel passwordLbl = new JLabel("Enter a passowrd (must be more than 8 characters)");
        JTextField  passwordField = new JTextField();

        // label and text field for confirming password
        JLabel confPasswordLbl = new JLabel("Confirm your password");
        JTextField  confPasswordField = new JTextField();

        // button for submitting info
        JButton submitBtn = new JButton("Submit");

        // add everything to the panel
        createAccPanel.add(usernameLbl);
        createAccPanel.add(usernameField);
        createAccPanel.add(passwordLbl);
        createAccPanel.add(passwordField);
        createAccPanel.add(confPasswordLbl);
        createAccPanel.add(confPasswordField);
        createAccPanel.add(submitBtn);
     
        // remove login panel and add create account panel to the window
        window.remove(loginPanel);
        window.add(createAccPanel);
       
        // update the UI of the window
        window.revalidate();
        window.repaint();    
    }

    public void addCreateAccountListener(ActionListener l) {
        createAccBtn.addActionListener(l);
    }
}
