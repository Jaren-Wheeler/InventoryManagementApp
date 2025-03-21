
import view.mainView;
import model.Model;
import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Model model = new Model(); // create the model
        mainView loginWindow = new mainView(); //create the login window view, initially passing null to the controller
        Controller controller = new Controller(model,loginWindow); // create the controller which connects both model and view
       
        loginWindow.initializeWindow(); // open the login window
        loginWindow.addCreateAccountListener(controller); 

        //loginWindow.createAccWindow(controller);
       
    }
    
}


