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
        this.window = window; // this is the same window as the login page
    }

    // create the main outline of the dashboard
    public void initializeDashboard() {
       
        dashboard = new JPanel(); // new panel for dashboard
        dashboard.setLayout(new FlowLayout());
        JLabel db_title = new JLabel("Welcome");
        
        dashboard.add(db_title);
        window.setContentPane(dashboard); // set the content of the window to dashboard panel rather than login panel
        window.setVisible(true);
    }
}
