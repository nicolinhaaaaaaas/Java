//MAIN

public class Game {

	public static void main(String[] args) {

		MyFrame myFrame = new MyFrame();

	}

}

// MyFrame

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame{

	Image image;
	Graphics graphics;
	Box player;
	Box enemy;
	boolean gameOver;
	
	MyFrame(){
		player = new Box(100, 300, 50, 50, Color.blue);
		enemy = new Box(400, 300, 50, 50, Color.red);
		gameOver = false;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
		this.addKeyListener(new AL());
	}
	
	public void paint(Graphics g) {
		image = createImage(this.getWidth(), this.getHeight());
		graphics = image.getGraphics();
		g.drawImage(image, 0, 0, this);
		
		player.draw(g);
		enemy.draw(g);
		
		if(gameOver) {
			g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.BOLD, 45));
			g.drawString("Game Over", 150, 100);
		}
	}
	
	public void checkCollision() {
		if(player.intersects(enemy)) {
			gameOver = true;
			System.out.println("Game Over");
		}
	}
	
	public class AL extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			player.keyPressed(e);
			checkCollision();
			repaint();
		}
	}
}


// Box

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Box extends Rectangle{

	Color color;
	
	Box(int x, int y, int width, int height, Color color){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public void keyPressed(KeyEvent e) { // isso ta fazendo os controles
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.y=y-10;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.y=y+10;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.x=x-10;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.x=x+10;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.x, this.y, this.width, this.height);
	}
}
