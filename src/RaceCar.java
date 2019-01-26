
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;

/**
 * Project: Racing Car
 * Task: Creates a car that can be sped up, slowed down and paused/restarted 
 * @author Justin Mangan
 * Date: 17 February 2018
 */

public class RaceCar extends Application{
    @Override 
	public void start(Stage primaryStage) {
            
            // instantiates a CarPane object named pane
            CarPane car = new CarPane();

            // creates and registers event handlers for mouse and up/down keys
            car.setOnMousePressed(e -> car.stop());
            car.setOnMouseReleased(e -> car.go());

            car.setOnKeyPressed(e -> {
                    if (e.getCode() == KeyCode.UP) {
                            car.speedUp();
                    }
                    else if (e.getCode() == KeyCode.DOWN) {
                            car.slowDown();
                    }
            });

            // Creates a scene and places it and pane in the stage
            Scene scene = new Scene(car, 1300, 200);
            primaryStage.setTitle("Racing Car"); 
            primaryStage.setScene(scene);
            primaryStage.show();
            
            // sets the focus on pane
            car.requestFocus();
	}
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
