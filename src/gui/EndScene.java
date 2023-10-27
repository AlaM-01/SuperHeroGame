package gui;

import engine.Game;
import engine.Player;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.stage.Stage;

public class EndScene {
	private static final int HEIGHT = 731;
	private static final int WIDTH = 1300;
	private AnchorPane mainPane;
	private Scene mainScene;
	private Stage mainStage;
	private Stage menuStage;
	private Game currentGame;
	
	public EndScene(Game currentGame) {
		
		
		this.currentGame=currentGame;
		mainPane=new AnchorPane();
		mainScene=new Scene(mainPane,WIDTH,HEIGHT);
		mainStage=new Stage();
		mainStage.setScene(mainScene);
		mainStage.setTitle("Avengers Assemble");
		mainStage.setResizable(false);
		Image backgroundImage = new Image(
				"file:///C:/Users/DELL/Desktop/Milestone3swing/Marvel-M2/src/gui/maxresdefault%20(1).jpg");
		BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT,
				BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, null);
		mainPane.setBackground(new Background(background));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void createNewGame(Stage menuStage) {
		this.menuStage = menuStage;
		this.menuStage.hide();
		mainStage.show();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
