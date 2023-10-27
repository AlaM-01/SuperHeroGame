package gui;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import model.world.Champion;

public class ChampionPicker extends VBox {

	private ImageView ChampionImage;
	private ImageView CircleImage;
	private String circleNotChoosen="file:///C:/Users/DELL/Desktop/Milestone3swing/Marvel-M2/src/gui/grey_circle.png";
	private String circleChoosen="file:///C:/Users/DELL/Desktop/Milestone3swing/Marvel-M2/src/gui/green_circle.png";
	private Champion champ;
	private boolean isCircleChoosen;
	private Tooltip tip;
	public ChampionPicker(Champion champ) {
		CircleImage=new ImageView(circleNotChoosen);
		ChampionImage=new ImageView(champ.getURL());
		ChampionImage.setFitHeight(100);
		ChampionImage.setFitWidth(100);
		
		this.champ=champ;
		isCircleChoosen=false;
		//this.setAlignment(Pos.CENTER);
		this.setSpacing(20);
		Tooltip tip=new Tooltip(ChampDetails());
		
		Tooltip.install(ChampionImage, tip);
		tip.centerOnScreen();
		this.getChildren().add(CircleImage);
		this.getChildren().add(ChampionImage);
		//Tooltip.install(ChampionImage, new Tooltip(ChampDetails()));
		
		
		
		
		
	}
	public Champion getChamp() {
		return champ;
	}
	public Tooltip getTip() {
		return tip;
	}
	
	public boolean getIsCircleChoosen() {
		return isCircleChoosen;
	}
	public void setIsCircleChoosen(boolean isCircleChoosen) {
		this.isCircleChoosen=isCircleChoosen;
		String imageToSet=this.isCircleChoosen ? circleChoosen : circleNotChoosen;
		CircleImage.setImage(new Image(imageToSet));
	}
	public String ChampDetails() {
		String r="Name:"+ champ.getName()+'\n'
				+"Health Points: "+champ.getMaxHP()+'\n'
				+ "Actions Points Per Turn: "+champ.getMaxActionPointsPerTurn()+'\n'
				+"Mana: "+champ.getMana()+'\n'
				+"Attack Range: "+champ.getAttackRange()+'\n'
				+"Attack Damage: "+champ.getAttackDamage()+'\n'+"Champions's Abilities: ";
		for(int i=0 ; i<champ.getAbilities().size();i++) {
			r=r+champ.getAbilities().get(i).getName() + ",";
			
		}
		r=r+'\n';
		

		return r;
		
		
	}
	
   
	

}
