//Instructions Frame - Second Frame, is the abstract class that reads from a file from the InstructionsText class (child class) and displays it
 
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public abstract class Instructions extends JFrame {
	JPanel textPanel;
	JLabel titleBack, title, instructions;
	JButton back;
	
	/*
	 * Display the instructions and navigate back to the Start class with the back button
	 * pre: Be able to call the InstructionsText class
	 * post: Display the instructions and back button
	 */
	Instructions(){
		textPanel = new JPanel(); //Creating a panel to display the text
		textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
		
		//Creating GridBagLayout object
		GridBagConstraints gbc = new GridBagConstraints();	
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets (5, 20, 20, 20);
		
		//Creating an image for for the background and adding it to the titleBack label
		titleBack = new JLabel();
		titleBack.setLayout(new GridBagLayout());
		ImageIcon img = new ImageIcon(getClass().getResource("startbackground.jpg"));
		Image image = img.getImage(); 
		Image newImage = image.getScaledInstance(600, 600, Image.SCALE_SMOOTH); 
		img = new ImageIcon(newImage);
		titleBack.setIcon(img);
			
		//Creating a label for instructions title
		title = new JLabel("Instructions - How to Play");
		title.setFont(new Font("Broadway", Font.PLAIN, 30));
		title.setForeground(Color.white);
		title.setVerticalAlignment(JLabel.NORTH);
		title.setHorizontalAlignment(JLabel.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 0;
		titleBack.add(title, gbc);
		
		//Displaying instructions
		instructions = new JLabel("<html>" + getInstructionsText() + "<html>");
		instructions.setFont(new Font("Consolas", Font.PLAIN, 17));
		instructions.setForeground(Color.white);
		instructions.setVerticalAlignment(JLabel.BOTTOM);
		instructions.setHorizontalAlignment(JLabel.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 1;
		titleBack.add(instructions, gbc);
		
		textPanel.add(titleBack);
	
		//Creating a back buttons
		back = new JButton("Back");
		back.setFont(new Font("Broadway", Font.PLAIN, 23));
		back.setForeground(Color.white);
		back.setOpaque(false);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);
		gbc.gridx = 0;
		gbc.gridy = 2;
		titleBack.add(back, gbc);
		
		//Adding ActionListener to back button
		back.addActionListener(a -> {
			Start start;
			try {
				start = new Start();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
			this.setVisible(false);
			validate();
			
		});
		
		setContentPane(textPanel);
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	public abstract String getInstructionsText(); //Declaring abstract method
	
		
	
}