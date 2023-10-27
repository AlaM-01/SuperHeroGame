package views;

import javax.swing.JButton;
import javax.swing.JFrame;

public abstract class StartGame {
	public static void main(String[] args) {
		JFrame window= new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Avengers Assemble");
		GamePanel gamePanel= new GamePanel();
		window.add(gamePanel);
		window.pack();
		window.setLocationRelativeTo(null); 
		window.setVisible(true);
		gamePanel.startGameThread();
		JButton button=new JButton("Start Game");
		//button.setBounds(60, 400, 220, 30);
		window.add(button);

		
	}
}
