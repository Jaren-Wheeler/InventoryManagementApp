package controller;
import model.Model;
import view.LoginView;

import javax.swing.JOptionPane;
import java.awt.event.*;
public class LoginController implements ActionListener {
    
    private Model model; 
    private LoginView loginWindow; 

    public LoginController(Model model, LoginView loginWindow) {
        this.model = model;
        this.loginWindow = loginWindow;
    }

    // handles button clicks
    public void actionPerformed(ActionEvent e) {

        // opens the dashboard if the entered information is accurate
        if (e.getSource() == loginWindow.enterBtn) {
             // 1. check if model has the information in the database

             // 2. open dashboard if 1. is true
        }

        // opens create account window if the create new account button is clicked
        if (e.getSource() == loginWindow.createAccBtn) {
            loginWindow.createAccWindow(this);
        }

        // writes the inputted account information into the database
        if (e.getSource() == loginWindow.submitBtn) {
            Model.createAccount(loginWindow.usernameCreateField.getText(),loginWindow.passwordCreateField.getText());
        }

    }
}
