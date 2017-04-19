package main;

/*Artist: Tyler Cabutto; Brandon Little */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent>{
	Button q1;
	Button q2;
	Button q3;
	Button q4;
	Button q5;
	Button q6;
	Button q7;
	Button q8;
	Button q9;
	Button q10;
	TextField t1;

	
	
	public static void main(String[] args){
		launch();
		
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Movie Recommender 3000");
		BorderPane layout = new BorderPane();
		HBox bRow = new HBox();
		bRow.setPadding(new Insets(20, 15, 15, 20));
		bRow.setSpacing(17);
		bRow.setStyle("-fx-background-color:  #5eb74e");
		
		q1 = new Button();
		q1.setText("Query 1");
		q1.setOnAction(this);
		
		q2 = new Button();
		q2.setText("Query 2");	
		q2.setOnAction(this);
		
		q3 = new Button();
		q3.setText("Query 3");
		q3.setOnAction(this);
		
		q4 = new Button();
		q4.setText("Query 4");
		q4.setOnAction(this);
		
		q5 = new Button();
		q5.setText("Query 5");	
		q5.setOnAction(this);
		
		q6 = new Button();
		q6.setText("Query 6");	
		q6.setOnAction(this);
		
		q7 = new Button();
		q7.setText("Query 7");	
		q7.setOnAction(this);
		
		q8 = new Button();
		q8.setText("Query 8");		
		q8.setOnAction(this);
		
		q9 = new Button();
		q9.setText("Query 9");		
		q9.setOnAction(this);
		
		q10 = new Button();
		q10.setText("Query 10");
		q10.setOnAction(this);
		
		bRow.getChildren().addAll(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10);
		
		StackPane textField = new StackPane();
		
		t1 = new TextField();
		
		textField.getChildren().addAll(t1);
		
		Label output = new Label();
		output.setPrefHeight(40);
		
		layout.setTop(bRow);
		layout.setBottom(textField);
		
		Scene scene = new Scene(layout, 780, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void handle(ActionEvent event){
		if (event.getSource() == q1) {
			t1.setText("yep");
		}
		if (event.getSource() == q2) {
			
		}
		if (event.getSource() == q3) {
			
		}
		if (event.getSource() == q4) {
			
		}
		if (event.getSource() == q5) {
			
		}
		if (event.getSource() == q6) {
			
		}
		if (event.getSource() == q7) {
			
		}
		if (event.getSource() == q8) {
			
		}
		if (event.getSource() == q9) {
			
		}
		if (event.getSource() == q10) {
			
		}
	}
	
}