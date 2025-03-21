
import view.DashboardView;
import view.LoginView;
import model.Model;
import controller.LoginController;

public class Main {
    public static void main(String[] args) {
        Model model = new Model(); // create the model
        LoginView loginWindow = new LoginView(); //create the login window view, initially passing null to the controller
        DashboardView dashboard = new DashboardView(); // initialize the dashboard
        LoginController loginController = new LoginController(model,loginWindow,dashboard); // create the controller object for login page which connects both model and view
        
       
        loginWindow.initializeWindow(loginController); // open the login window
       
    }
    
}


