//public class Main {
//	public static void main(String[] args) {	
//		new MyFrame();
//	}
//}

//aqui é só um exemplo de como funciona as função de KeyPressed

//MyFrame.java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements KeyListener{
	
	JLabel label;
	//ImageIcon icon;
	
	MyFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		//icon = new ImageIcon("icone.png");
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		//label.setIcon(icon);   não funcionou a imagem q eu botei
		label.setBackground(Color.red);
		label.setOpaque(true);
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// KeyTyped = utilizado quando uma tecla é digitada. Usa KeyChar, com output de caractere
		switch(e.getKeyChar()) {
			case 'a': label.setLocation(label.getX()-10,label.getY());
				break;
			case 'w':label.setLocation(label.getX(),label.getY()-10);
				break;
			case 'd':label.setLocation(label.getX()+10,label.getY());
				break;
			case 's':label.setLocation(label.getX(),label.getY()+10);
				break;
			
		//aqui ta usando os caracteres pra indicar o movimento
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// KeyPressed = utilizado quando uma tecla é apertada, usa KeyCode, output de Int
		switch(e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-10,label.getY()); //seta da esquerda
			break;
		case 38:label.setLocation(label.getX(),label.getY()-10); //seta pra cima
			break;
		case 39:label.setLocation(label.getX()+10,label.getY()); //seta pra direita
			break;
		case 40:label.setLocation(label.getX(),label.getY()+10); //seta pra baixo
			break;
		// aqui ta utilizando os valores das setas para indicar pra que lado ir
		//quando o keyPressed é usado ele dá o valor inteiro da tecla
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// KeyRelesed = utilizado quando um botão deixa de ser apertado
		System.out.println("Voce soltou a tecla: "+e.getKeyChar());
		System.out.println("Codigo da tecla que voce apertou: "+e.getKeyCode());
	}
}
