package view;

import java.util.Scanner;
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.*;

public class View {

    //method for the window
    public static void initializeWindow() {

        // basic window information
        JFrame window = new JFrame("Inventory Manager"); 
        window.setSize(1280,720);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        // create panel object to store login window elements.
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(3,2,10,100)); // grid layout design
        loginPanel.setBounds(500,300,300,300); // position on window

        // username label and text field
        JLabel usernameLbl = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        // password label and text field
        JLabel passwordLbl = new JLabel("Password:");
        JTextField passwordField = new JTextField();

        // enter button and create account button
        JButton enterBtn = new JButton("Enter");
        JButton createAccBtn = new JButton("Create Account");

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
}