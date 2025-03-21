package view;
import model.Model;
import javax.swing.*;
import view.LoginView;

import java.awt.*;
import java.awt.event.*;

// class outlining the user interface for the main dashboard
public class DashboardView {

    private JFrame window;
    private JPanel dashboard;

    public DashboardView(JFrame window) {
        this.window = window; 
    }

    // create the main outline of the dashboard
    public void initializeDashboard() {
       
        dashboard = new JPanel();
        dashboard.setLayout(new FlowLayout());
        JLabel db_title = new JLabel("Welcome");
        
        dashboard.add(db_title);
        window.setContentPane(dashboard);
        window.setVisible(true);
    }
}
