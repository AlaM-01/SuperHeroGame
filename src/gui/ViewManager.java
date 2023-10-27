package gui;

import javafx.event.EventHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import engine.Game;
import engine.Player;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ViewManager {
	private static final int HEIGHT=731;
	private static final int WIDTH=1300;
	private AnchorPane mainPane;
	private Scene mainScene;
	private Stage mainStage;
	//private String player1name;
	//private String player2name;
	TextField textfield=new TextField();
	TextField textfield1=new TextField();
	Game currentGame;
	
	public ViewManager() {
		mainPane=new AnchorPane();
		mainScene=new Scene(mainPane,WIDTH,HEIGHT);
		mainStage=new Stage();
		mainStage.setScene(mainScene);
		mainStage.setTitle("Avengers Assemble");
		mainStage.setResizable(false);
		StartGameButton();
		createLabels();
		createBackground();
		//player1name=textfield.getText();
	//	player2name=textfield1.getText();

		
		

		
	
		
		
	}
	private void StartGameButton() {
		Buttons button=new Buttons("Start Game!");
		mainPane.getChildren().add(button);
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				String player1name=textfield.getText();
				String player2name=textfield1.getText();
				if(!player1name.isEmpty() && !player2name.isEmpty() ) {
					Player Player1=new Player(player1name);
					Player Player2=new Player(player2name);
				    GameRegulationsView temp=temp=new GameRegulationsView(Player1,Player2);
				    temp.createNewGame(mainStage,Player1,Player2);
					//currentGame=new Game(new Player(player1name),new Player(player2name));
					//PickChampViewManager gameManager=new PickChampViewManager( /*currentGame,*/Player1,Player2);
					//gameManager.createNewGame(mainStage,Player1,Player2);
					
				}
			}
			
		});
		
		button.setLayoutX(520);
		button.setLayoutY(600);
		
	}
	private void  createBackground() {
		Image backgroundImage=new Image("file:///C:/Users/DELL/Desktop/Milestone3swing/Marvel-M2/src/gui/scale%20(1).jpg");
		BackgroundImage background=new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT,BackgroundRepeat.REPEAT,BackgroundPosition.CENTER,null);
		mainPane.setBackground(new Background(background));
	    
	}
	
	private void createLabels() {
		Label labelPlayer1=new Label("Player 1 name:   ");
		labelPlayer1.setTextFill(Color.web("#9FADBD"));
		try {
			labelPlayer1.setFont(Font.loadFont(new FileInputStream("kenvector_future.ttf"), 23));
		} catch (FileNotFoundException e) {
			labelPlayer1.setFont(Font.font("Verdana",23));
		}
		Label labelPlayer2=new Label("Player 2 name:   ");
		labelPlayer2.setTextFill(Color.web("#9FADBD"));
		try {
			labelPlayer2.setFont(Font.loadFont(new FileInputStream("kenvector_future.ttf"), 23));
		} catch (FileNotFoundException e) {
			labelPlayer2.setFont(Font.font("Verdana",23));
		}
		//TextField textfield=new TextField();
		//player1name=textfield.getText();
		textfield.setPrefColumnCount(10);
		//TextField textfield1=new TextField();
		//player2name=textfield1.getText();
		textfield1.setPrefColumnCount(10);
		HBox hbox=new HBox(labelPlayer1,textfield,labelPlayer2,textfield1);
		hbox.setSpacing(30);
		hbox.setLayoutX(280);
		hbox.setLayoutY(700);

		//hbox.setAlignment(Pos.CENTER);
		mainPane.getChildren().add(hbox);
	}
	public String getPlayer1() {
	
		return textfield.getText();
	}
	
	public String getPlayer2() {
		return textfield1.getText();
	}
	public Stage getMainStage() {
		return mainStage;
		
	}
	public  Game getGame() {
		return currentGame;
	}


}
