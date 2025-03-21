package controller;
import model.Model;
import view.DashboardView;
import view.LoginView;

import javax.swing.JOptionPane;
import java.awt.event.*;
public class LoginController implements ActionListener {
    
    private Model model; 
    private LoginView loginWindow; 
    private DashboardView dashboard;

    public LoginController(Model model, LoginView loginWindow, DashboardView dashboard) {
        this.model = model; // the model
        this.loginWindow = loginWindow; // the login window
        this.dashboard = dashboard; // the dashboard window
    }

    // handles button clicks
    public void actionPerformed(ActionEvent e) {

        // opens the dashboard if the entered information is accurate
        if (e.getSource() == loginWindow.enterBtn) {
             // 1. check if model has the information in the database

             // 2. open dashboard if 1. is true
             loginWindow.window.getContentPane().removeAll(); // remove all content from the login window
             loginWindow.window.setContentPane(dashboard); // set the content of the window to dashboard panel rather than login panel
             dashboard.initializeDashboard(); // create the dashboard
             loginWindow.window.revalidate();
             loginWindow.window.repaint();
             
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
