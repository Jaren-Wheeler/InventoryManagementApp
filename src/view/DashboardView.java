package view;
import model.Model;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

// class outlining the user interface for the main dashboard
public class DashboardView {

    private JFrame dashboard;

    public DashboardView() {
        this.dashboard = new JFrame("Inventory Management");
        initializeDashboard();
    }

    // create the main outline of the dashboard
    public void initializeDashboard() {
      
        dashboard.setSize(800, 600); // Set window size
        dashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
        JLabel db_title = new JLabel("Welcome");

        dashboard.add(db_title);
        dashboard.setVisible(true);
    }
}
