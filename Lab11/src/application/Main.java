package application;
	
import java.util.Calendar;
import java.util.GregorianCalendar;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class Main extends Application { //implements EvenetHandler<ActionEvent> 이러면 handle이라는 method를 넣어주게 됨
//이 객체 안에서 handle을 처리해서 이벤트를 처리할 수도 있다. 그럴경우엔, enlargeButton.setOnAction(this) 이렇게 표시.
	
	Button enlargeButton;
	Button shrinkButton;
	ClockPane clock;
	
	@Override
	public void start(Stage primaryStage) { //가장먼저실행됨
		try {
			
			clock = new ClockPane(400,400);
					
			Pane root = new Pane();
	
			BorderPane pane = new BorderPane();
			pane.setCenter(clock);
			
			EventHandler<ActionEvent> eventHandler = e-> {
				clock.setCurrentTime();
			};
			
			Timeline t1 = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
			t1.setCycleCount(Timeline.INDEFINITE);
			t1.play();
			
			Scene scene = new Scene(pane,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args); //Launch명령어가 start 부분을 실행시킴
	}
}

class ClockPane extends Pane {

	private int hour;
	private int minute;
	private int second;
	Circle circle;
	
	public ClockPane(double w, double h) {
		setWidth(w);
		setHeight(h);
		setCurrentTime();
	}
	
	public void setCurrentTime() {
		Calendar cal = new GregorianCalendar();
		
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
		
		paintClock();
	}
	
	void enlargeClock() {
		circle.setRadius(circle.getRadius() + 5);
	}
	
	void shrinkClock() {
		circle.setRadius(circle.getRadius() - 5);
	}
	
	void paintClock() {
		double clockRadius = getWidth()*0.5*0.8;
		double centerX = getWidth()*0.5;
		double centerY = getWidth()*0.5;
		
		circle = new Circle(centerX, centerY, clockRadius);
		
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		getChildren().add(circle);
		
		Text t1 = new Text(centerX-5, centerY - clockRadius + 12, "12");
		Text t2 = new Text(centerX-3, centerY + clockRadius - 3, "6");
		Text t3 = new Text(centerX-clockRadius, centerY +3, "9");
		Text t4 = new Text(centerX+clockRadius-10, centerY + 3, "3");



		getChildren().add(t1);
		getChildren().add(t2);
		getChildren().add(t3);
		getChildren().add(t4);
		
		double sLength = clockRadius * 0.8;
		double secondX = centerX + sLength * Math.sin(second * (2*Math.PI)/60);
		double secondY = centerY - sLength * Math.cos(second * (2*Math.PI)/60);
		
		Line sLine = new Line(centerX, centerY, secondX, secondY);
		getChildren().add(sLine);
		
		double mLength = clockRadius * 0.6;
		double minuteX = centerX + mLength * Math.sin((minute+second/60) * (2*Math.PI)/60);
		double minuteY = centerY - mLength * Math.cos((minute+second/60) * (2*Math.PI)/60);

		Line mLine = new Line(centerX, centerY, minuteX, minuteY);
		mLine.setStroke(Color.BLUE);
		getChildren().add(mLine);
		
		double hLength = clockRadius * 0.4;
		double hourX = centerX + hLength * Math.sin((hour + minute/60 + second/3600) * (2*Math.PI)/12);
		double hourY = centerY - hLength * Math.cos((hour + minute/60 + second/3600) * (2*Math.PI)/12);

		Line hLine = new Line(centerX, centerY, hourX, hourY);
		hLine.setStroke(Color.RED);
		getChildren().add(hLine);
	}
}
