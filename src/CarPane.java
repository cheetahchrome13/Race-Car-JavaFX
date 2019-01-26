
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Arc;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 * Project: Racing Car
 * Task: Creates a car that can be sped up, slowed down and paused/restarted 
 * @author Justin Mangan
 * Date: 17 February 2018
 */

public class CarPane extends Pane{
    
    private Timeline action;
    private double x = 0;
    private double y = 200;
    private double rad = 10;

    // default CarPane constructor with method call to drawCar() and animation
    CarPane() {
            drawCar();
            action = new Timeline(new KeyFrame(Duration.millis(20), e -> moveCar()));
            action.setCycleCount(Timeline.INDEFINITE);
            action.play();
    }

    // creates a car and adds it to the pane
    private void drawCar() {
            getChildren().clear();
            Rectangle body = new Rectangle(x, y - 27, 170, 20);
            body.setArcWidth(10);
            body.setArcHeight(20);
            Polygon roof = new Polygon(x + 40, y - 27, x + 75, y - 36, x + 110, y - 36, x + 120, y - 27);
            Polygon window = new Polygon(x + 60, y - 27, x + 77, y - 33, x + 107, y - 33, x + 115, y - 27);
            window.setFill(Color.SILVER);
            Polygon fins = new Polygon(x + 3, y - 27, x - 2, y - 40, x + 75, 
                    y - 20, x + 40, y - 20);
            Arc wheel1 = new Arc(x + 42, y - 10, rad, rad, 0, -180);
            wheel1.setFill(Color.BLACK);
            wheel1.setStroke(Color.BLACK);
            wheel1.setType(ArcType.CHORD);
            Arc wheel2 = new Arc(x + 144, y - 10, rad, rad, 0, -180);
            wheel2.setFill(Color.BLACK);
            wheel2.setStroke(Color.BLACK);
            wheel2.setType(ArcType.CHORD);
            getChildren().addAll(body, roof, window, wheel1, wheel2, fins);
    }

    // uses the pause() method of javafx.animation.Timeline
    public void stop() {
            action.pause();
    }

    // uses the play() method of javafx.animation.Timeline
    public void go() {
            action.play();
    }

    // increments the rate of speed by 1 per key stroke
    public void speedUp() {
            action.setRate(action.getRate() + 1);
    }

    // decrements the rate of speed by 1 per key stroke
    public void slowDown() {
            action.setRate(action.getRate() > 0 ? action.getRate() - 1 : 0);
    }

    // moves the car by adding 1px to x and redrawing it in an endless loop
    public void moveCar() {
        if (x <= getWidth()) {
            x += 1;	
        } 
        else {
            x = 0;
        }
        drawCar();
    }
    
}
