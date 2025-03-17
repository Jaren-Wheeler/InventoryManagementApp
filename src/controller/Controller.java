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

        this.loginWindow.addCreateAccountListener(this);
    }

    // opens the create account window when create new account button is clicked.
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginWindow.createAccBtn) {
            loginWindow.createAccWindow();
        }
    }
}
