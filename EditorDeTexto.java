//main

//public class Main {
//	public static void main(String[] args) {	
//		new TextEditor();
//	}
//}
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.*;

public class TextEditor extends JFrame implements ActionListener{
	
	JTextArea textArea;
	JScrollPane scrollPane;
	JLabel fontLabel;
	JSpinner fontSizeSpinner;
	JButton fontColorButton;
	JComboBox fontBox;
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenuItem openItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	
	TextEditor(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Editor de texto");
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Arial",Font.PLAIN,20));
		
		//scroll da página
		scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize(new Dimension(450,450));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		fontLabel = new JLabel("Tamanho:");
		
		fontSizeSpinner = new JSpinner();
		fontSizeSpinner.setPreferredSize(new Dimension(50,25));
		fontSizeSpinner.setValue(20);
		fontSizeSpinner.addChangeListener(new ChangeListener(){
			
			//isso faz com que o negócio de mudar o tamanho funcione
			public void stateChanged(ChangeEvent e) {
				textArea.setFont(new Font(textArea.getFont().getFamily(),Font.PLAIN,(int)fontSizeSpinner.getValue()));
			}
		});
		
		fontColorButton = new JButton("Cor");
		fontColorButton.addActionListener(this);
		
		//isso tá puxando todas as fontes disponiveis em java
		String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		fontBox = new JComboBox(fonts);
		fontBox.addActionListener(this);
		fontBox.setSelectedItem("Arial");
		
		// --------- MENU --------
		
			menuBar = new JMenuBar();
			fileMenu = new JMenu("Árquivo");
			openItem = new JMenuItem("Abrir");
			saveItem = new JMenuItem("Salvar");
			exitItem = new JMenuItem("Sair");
			
			openItem.addActionListener(this);
			saveItem.addActionListener(this);
			exitItem.addActionListener(this);
			
			fileMenu.add(openItem);
			fileMenu.add(saveItem);
			fileMenu.add(exitItem);
			menuBar.add(fileMenu);
		
		//tudo as funções adicionadas ao programa vai aq
			
		this.setJMenuBar(menuBar);
		this.add(fontLabel);
		this.add(fontSizeSpinner);
		this.add(fontColorButton);
		this.add(fontBox);
		this.add(scrollPane);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		//isso permite que você troque de cor
		if(e.getSource()==fontColorButton) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = colorChooser.showDialog(null, "Escolha uma cor", Color.black);
			
			textArea.setForeground(color);
		}
		
		//isso permite que você troque de fonte
		if(e.getSource()==fontBox) {
			textArea.setFont(new Font((String)fontBox.getSelectedItem(),Font.PLAIN,textArea.getFont().getSize()));
		}
		
		//função do "abrir" do menu
		if(e.getSource()==openItem) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("."));
			//isso abaixo faz com que só aceite arquivos de texto, que terminem em txt
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
			fileChooser.setFileFilter(filter);
			
			int response = fileChooser.showOpenDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath()); //aqui ta achando o arquivo aberto
				Scanner fileIn = null;
				
				try {
					fileIn = new Scanner(file);
					if(file.isFile()) {
						while(fileIn.hasNextLine()) { //enquanto o arquivo aberto tiver uma linha, vai copiar tudo
							String line = fileIn.nextLine()+"\n"; // aqui desce uma linha qnd necessario
							textArea.append(line);
						}
					}
				} 
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				finally {
					fileIn.close();
				}
			}
		}
		
		//função do "salvar" do menu
		if(e.getSource()==saveItem) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File(".")); //o "." tá enviando o arquivo q for salvo pra o próprio projeto como padrão
			
			int response = fileChooser.showSaveDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) { // se o arquivo escolhido pelo usuario for aprovado ai roda isso
				File file;
				PrintWriter fileOut = null;
				
				file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				try {
					fileOut = new PrintWriter(file);
					fileOut.println(textArea.getText());
				} 
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				finally {
					fileOut.close();
				}
			}
		}
		
		//função do "sair" do menu
		if(e.getSource()==exitItem) {
			System.exit(0);	
		}
		
	}

}
