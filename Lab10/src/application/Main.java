package application;
   
import application.Main.HandlerClass;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	
	Rectangle rec;
	Circle c;
	PathTransition pt;
	
   @Override
   public void start(Stage primaryStage) {
      try {
         Pane pane = new Pane();
         
         rec = new Rectangle(0, 0, 25, 50);
         rec.setFill(Color.ORANGE);
         
         c = new Circle(150, 125, 50);
         c.setFill(Color.WHITE);
         c.setStroke(Color.BLACK);
         
         pane.getChildren().addAll(c, rec);
         
         pt = new PathTransition();
         pt.setDuration(Duration.millis(4000));
         pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
         pt.setPath(c);
         pt.setNode(rec);
         pt.setCycleCount(Timeline.INDEFINITE);
         
//         pt.play();
         
         Button bt = new Button("Start");
         HandlerClass myHandler = new HandlerClass();
         bt.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(bt.getText() == "Start") {
					pt.play();
					bt.setText("Stop");
				}
				else {
					pt.pause();
					bt.setText("Start");
				}
			}
        	 
         });
         pane.getChildren().add(bt);
         bt.setLayoutX(125);
         bt.setLayoutY(220);

//         FadeTransition ft = new FadeTransition();
//         ft.setNode(rec);
//         ft.setFromValue(1.0);
//         ft.setToValue(0.1);
//         ft.setCycleCount(Timeline.INDEFINITE);
//         ft.setAutoReverse(true);
//         ft.play();
//         
//         c.setOnMousePressed(e->{pt.pause();});
//         c.setOnMouseReleased(e->{pt.play();});
         
         StackPane root = new StackPane();
         root.getChildren().add(c);
         root.getChildren().add(rec);
         root.getChildren().add(bt);
         
         StackPane.setAlignment(c, Pos.CENTER);
         StackPane.setAlignment(rec, Pos.TOP_LEFT);
         StackPane.setAlignment(bt, Pos.BOTTOM_CENTER);
                  
         Scene scene = new Scene(root,400,400);
         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
         primaryStage.setScene(scene);
         primaryStage.show();
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
   
   
	class HandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
//			if( == "Start") {
//				pt.play();
//			}
//			else {
////				clock.shrinkClock();
//				System.out.println("shrinkButton Clock button Clicked");
//			}
		}
	}
	
	
   public static void main(String[] args) {
      launch(args);
   }
}