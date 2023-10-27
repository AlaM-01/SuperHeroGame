package gui;

import javafx.animation.TranslateTransition;
import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.util.Duration;

public class AbilityUseSubScene extends SubScene {
	private final String BG_IMAGE="file:///C:/Users/DELL/Desktop/Milestone3swing/Marvel-M2/src/gui/iabback-%20Copy.jpg";
	private final static String FONT_PATH = "src/gui/kenvector_future.ttf";
	private boolean isHidden = false;	


	
	
	public AbilityUseSubScene() {
		super(new AnchorPane(), 600, 400);
		prefWidth(600);
		prefHeight(400);
		BackgroundImage image = new BackgroundImage(new Image(BG_IMAGE, 600, 400, false, true),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);
		AnchorPane root2 = (AnchorPane) this.getRoot();
		root2.setBackground(new Background(image));
		
		setLayoutX(420);
		setLayoutY(180);
	}
	
	public AnchorPane getPane() {
		return (AnchorPane) this.getRoot();
	}
	
	
	
	
	
	
	
	
	
	

}
