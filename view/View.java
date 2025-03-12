package view;

import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class View {

    //method for the window
    public static void initializeWindow() {
        JFrame window = new JFrame("Inventory Manager");
        window.setSize(1280,720);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setVisible(true);
    }
}