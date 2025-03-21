package controller;
import model.Model;
import view.mainView;

import javax.swing.JOptionPane;
import java.awt.event.*;
public class Controller implements ActionListener {
    
    private Model model; 
    private mainView loginWindow; 

    public Controller(Model model, mainView loginWindow) {
        this.model = model;
        this.loginWindow = loginWindow;
    }

    // handles button clicks
    public void actionPerformed(ActionEvent e) {

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
