//Start Frame - First Frame, is the frame that displays buttons to navigate to the instructions and game

import javax.swing.*;
import javax.sound.sampled.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Start extends JFrame{
	//JFrame frame;
	JPanel panel, buttons;
	JLabel title, background, soundInstruction;
	JButton startGame, instructions;
	char key;
	
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		new Start();
	}
	
	/*
	 * Displays the start screen and reads user input from buttons
	 * pre: 
	 * post: Display the required components and navigate successfully to the Game and Instructions class
	 */

	public Start() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		super("Computardy");
		
		//Creating panel for components and buttons
		panel = new JPanel();
		buttons = new JPanel();
		buttons.setLayout(new BoxLayout(buttons, BoxLayout.X_AXIS));
		buttons.setOpaque(false);
		
		background = new JLabel(); //Creating a label for the background image
		background.setLayout(new GridBagLayout());
		
		//Adding sound to the program
		File file = new File("JeopardyTheme.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);	
		clip.start();

		this.addKeyListener (new KeyAdapter() { //Adding an action listener for key events
			public void keyTyped(KeyEvent e) {
				key = e.getKeyChar();
				if (key == 'm' || key == 'M'){
					clip.stop();
	          }
				else if (key =='r' || key == 'R') {
					clip.start();
				}
			}     
		});
		clip.start();
		
		//Creating a GridBagLayout object
		GridBagConstraints gbc = new GridBagConstraints();	
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets (5, 20, 20, 20);
		
		//Adding background image
		ImageIcon img = new ImageIcon(getClass().getResource("startbackground.jpg"));
		Image image = img.getImage(); 
		Image newImage = image.getScaledInstance(500, 400, Image.SCALE_SMOOTH); 
		img = new ImageIcon(newImage);
		background.setIcon(img);
		panel.add(background);
		
		//Creating title and adding to the background label
		title = new JLabel("Computardy");
		title.setForeground(Color.white);
		title.setVerticalAlignment(JLabel.NORTH);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font("Broadway", Font.PLAIN, 50));
		background.add(title);
		
		//Creating buttons	
		ImageIcon start = new ImageIcon(getClass().getResource("startButton.png")); //Start Button
		Image image2 = start.getImage(); 
		Image newImage2 = image2.getScaledInstance(120, 100, Image.SCALE_SMOOTH); 
		start = new ImageIcon(newImage2);
		startGame = new JButton (start);
		startGame.setContentAreaFilled(false);
		startGame.setBorderPainted(false);

		ImageIcon instruct = new ImageIcon(getClass().getResource("instructionsButton.png")); //Instructions Button
		Image image3 = instruct.getImage(); 
		Image newImage3 = image3.getScaledInstance(100, 90, Image.SCALE_SMOOTH); 
		instruct = new ImageIcon(newImage3);
		instructions = new JButton (instruct);
		instructions.setContentAreaFilled(false);
		instructions.setBorderPainted(false);

		buttons.add(startGame);
		buttons.add(instructions);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		background.add(buttons, gbc);
		
		//Adding action listeners to the two buttons
		startGame.addActionListener(a -> {
			Game game = new Game();
			this.setVisible(false);
			game.Game();
			game.setVisible(true);
			validate();
			
		});
		
		instructions.addActionListener(a -> {
			InstructionsText inst = new InstructionsText();
			this.setVisible(false);
			inst.getInstructionsText();
			inst.setVisible(true);
			validate();
		});
		
		//Creating sound label
		soundInstruction = new JLabel("<html><io>Type \"m\" to mute the music &<br> \"r\" to resume the music");
		soundInstruction.setForeground(Color.white);
		soundInstruction.setHorizontalAlignment(JLabel.CENTER);
		soundInstruction.setFont(new Font("Broadway", Font.PLAIN, 18));
		gbc.gridx = 0;
		gbc.gridy = 2;
		background.add(soundInstruction, gbc);
		
		getContentPane().add(panel);
		setSize(490,390);
		setFocusable(true);
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}	
}