/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogithub;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author earlie87
 */
public class HelloGitHub extends Application {
	int b = 0;
	HelloGitHubHelp help = new HelloGitHubHelp("startup");
	AddedClassA addedClassA = new AddedClassA(5);
	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button();
		btn.setText("Say 'Hello GitHub'");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello GitHub!");
			}
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root, 300, 250);
		
		primaryStage.setTitle("Hello GitHub!");
		primaryStage.setScene(scene);
		primaryStage.show();
		System.out.println("\nLeaving hello GitHub now!!...Bye bye!!");
		System.out.println("\nadded another println.");
		help.setValuein(21);
		help.setLstring("about to enter for loop");
		help.prValuein();
		help.prLstring();
		addedClassA.setParm1(56);
		//add while loop
		b = 200;
		while (b > 0){
			b--;
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
}
