package views;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;



import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	final int originalTilesize=16;//char size
	final int scale=3;
	final int tileSize=originalTilesize*scale;
	final int maxScreenCol=32;
	final int maxScreenRow=25;
	final int screenwidth=tileSize*maxScreenCol;
	final int screenheight=tileSize*maxScreenRow;
	Thread gameThread;
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenwidth,screenheight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		
	}
	public void startGameThread() {
		gameThread=new Thread(this);
		gameThread.start(); 
	}
	@Override
	public void run() {
		while(gameThread !=null) {
			Update();
			repaint();// calling paintComponentmethod
		}
		
	}
	public void Update() {
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		g2.setColor(Color.white);
		g2.fillRect(100,100,tileSize,tileSize);
		g2.dispose();
		
		
	}
	

}
