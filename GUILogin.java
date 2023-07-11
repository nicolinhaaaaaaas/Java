import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class GUILogin implements ActionListener{
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	
	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(250,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("Usuario");
		userLabel.setBounds(10, 20, 80, 25);
		
		passwordLabel = new JLabel("Senha");
		passwordLabel.setBounds(10, 50, 80, 25);
		
		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUILogin());
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		success.setText(null);
	
		panel.add(passwordLabel);
		panel.add(userText);
		panel.add(passwordText);
		panel.add(button);
		panel.add(success);
		panel.add(userLabel);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + " ; " + password);
		
		if(user.equals("Nicolas") && password.equals("12345")) {
			success.setText("Login Bem Sucedido");
		}
		
	}

}
