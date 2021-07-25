//Game frame - Third frame, displays the score and buttons to display the questions

import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.*;

public class Game extends JFrame implements ActionListener{
	JPanel panel, secondPanel;
	JLabel label1, label2, label3, label4, background;
	JButton question1, question2, question3, question4, question5, question6, question7, question8, question9, question10, question11, question12, exit;
	JLabel score;
	private ArrayList <String> questions = new ArrayList <String> (12);
	
	/*
	 * Grid of 12 buttons where user can choose which question to choose
	 * pre: Be navigated to from the Start screen
	 * post: Display the grids of buttons, score and exit button
	 */
	public void Game() {
		
		//Creating GridBagLayout object
		GridBagConstraints gbc = new GridBagConstraints();	
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets (5, 20, 20, 20);
		
		panel = new JPanel(); //Creating panel
		panel.setLayout(new GridBagLayout());
		
		background = new JLabel(); //Creating label for background image
		background.setLayout(new GridBagLayout());
		
		//Adding background image
		ImageIcon img = new ImageIcon(getClass().getResource("gamebackground.jpg"));
		Image image = img.getImage(); 
		Image newImage = image.getScaledInstance(700, 500, Image.SCALE_SMOOTH); 
		img = new ImageIcon(newImage);
		background.setIcon(img);
		panel.add(background);
		
		//Creating Labels for topics
		label1 = new JLabel("<html><i>Variables &<br>Expressions");
		label1.setForeground(Color.white);
		label1.setFont(new Font("Impact", Font.PLAIN, 25));
		
		label2 = new JLabel("<html><i>Arrays &<br>Loops");
		label2.setForeground(Color.white);
		label2.setFont(new Font("Impact", Font.PLAIN, 25));
		
		label3 = new JLabel("<html><i>Inheritance & <br>Polymorphism");
		label3.setForeground(Color.white);
		label3.setFont(new Font("Impact", Font.PLAIN, 25));
	
		label4 = new JLabel("<html><i>Objects & <br>Classes");
		label4.setForeground(Color.white);
		label4.setFont(new Font("Impact", Font.PLAIN, 25));
		
		//Adding the labels to the panel
		gbc.gridx = 0;
		gbc.gridy = 0;
		background.add(label1, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		background.add(label2, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		background.add(label3, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 0;
		background.add(label4, gbc);
		
		
		//Creating Questions
	    question1 = new JButton("150");
		question1.setFont(new Font("Impact", Font.PLAIN, 25));
		question1.setForeground(new Color(255, 255, 80));
		question1.setBackground(new Color(80,50,250));
		question1.setMaximumSize(new Dimension(100,100));
		question1.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		gbc.gridx = 0;
		gbc.gridy = 1;
		background.add(question1, gbc);
		
		question2 = new JButton("250");
		question2.setFont(new Font("Impact", Font.PLAIN, 25));
		question2.setForeground(new Color(255, 255, 80));
		question2.setBackground(new Color(80,50,250));
		question2.setMaximumSize(new Dimension(100,100));
		question2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		gbc.gridx = 0;
		gbc.gridy = 2;
		background.add(question2, gbc);
		
		question3 = new JButton("350");
		question3.setFont(new Font("Impact", Font.PLAIN, 25));
		question3.setForeground(new Color(255, 255, 80));
		question3.setBackground(new Color(80,50,250));
		question3.setMaximumSize(new Dimension(100,100));
		question3.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		gbc.gridx = 0;
		gbc.gridy = 3;
		background.add(question3, gbc);
		
		question4 = new JButton("150");
		question4.setFont(new Font("Impact", Font.PLAIN, 25));
		question4.setForeground(new Color(255, 255, 80));
		question4.setBackground(new Color(80,50,250));
		question4.setMaximumSize(new Dimension(140,100));
		question4.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		gbc.gridx = 1;
		gbc.gridy = 1;
		background.add(question4, gbc);
		
		question5 = new JButton("250");
		question5.setFont(new Font("Impact", Font.PLAIN, 25));
		question5.setForeground(new Color(255, 255, 80));
		question5.setBackground(new Color(80,50,250));
		question5.setMaximumSize(new Dimension(100,100));
		question5.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		gbc.gridx = 1;
		gbc.gridy = 2;
		background.add(question5, gbc);
		
		question6 = new JButton("350");
		question6.setFont(new Font("Impact", Font.PLAIN, 25));
		question6.setForeground(new Color(255, 255, 80));
		question6.setBackground(new Color(80,50,250));
		question6.setMaximumSize(new Dimension(100,100));
		question6.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		gbc.gridx = 1;
		gbc.gridy = 3;
		background.add(question6, gbc);
		
		question7 = new JButton("150");
		question7.setFont(new Font("Impact", Font.PLAIN, 25));
		question7.setForeground(new Color(255, 255, 80));
		question7.setBackground(new Color(80,50,250));
		question7.setMaximumSize(new Dimension(100,100));
		question7.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		gbc.gridx = 2;
		gbc.gridy = 1;
		background.add(question7, gbc);
		
		question8 = new JButton("250");
		question8.setFont(new Font("Impact", Font.PLAIN, 25));
		question8.setForeground(new Color(255, 255, 80));
		question8.setBackground(new Color(80,50,250));
		question8.setMaximumSize(new Dimension(100,100));
		question8.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		gbc.gridx = 2;
		gbc.gridy = 2;
		background.add(question8, gbc);
		
		question9 = new JButton("350");
		question9.setFont(new Font("Impact", Font.PLAIN, 25));
		question9.setForeground(new Color(255, 255, 80));
		question9.setBackground(new Color(80,50,250));
		question9.setMaximumSize(new Dimension(100,100));
		question9.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		gbc.gridx = 2;
		gbc.gridy = 3;
		background.add(question9, gbc);
		
		question10 = new JButton("150");
		question10.setFont(new Font("Impact", Font.PLAIN, 25));
		question10.setForeground(new Color(255, 255, 80));
		question10.setBackground(new Color(80,50,250));
		question10.setMaximumSize(new Dimension(100,100));
		question10.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		gbc.gridx = 3;
		gbc.gridy = 1;
		background.add(question10, gbc);
		
		question11 = new JButton("250");
		question11.setFont(new Font("Impact", Font.PLAIN, 25));
		question11.setForeground(new Color(255, 255, 80));
		question11.setBackground(new Color(80,50,250));
		question11.setMaximumSize(new Dimension(100,100));
		question11.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		gbc.gridx = 3;
		gbc.gridy = 2;
		background.add(question11, gbc);
		
		question12 = new JButton("350");
		question12.setFont(new Font("Impact", Font.PLAIN, 25));
		question12.setForeground(new Color(255, 255, 80));
		question12.setBackground(new Color(80,50,250));
		question12.setMaximumSize(new Dimension(100,100));
		question12.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		gbc.gridx = 3;
		gbc.gridy = 3;
		background.add(question12, gbc);
		
		//Creating a label for score
		score = new JLabel("Score: 0");
		score.setFont(new Font("Impact", Font.PLAIN, 25));
		score.setForeground(new Color(255, 153, 0));
		score.setBackground(new Color(80,50,250));
		gbc.gridx = 1;
		gbc.gridy = 4;
		background.add(score, gbc);
		
		//Creating exit button
		exit = new JButton("Exit");
		exit.setFont(new Font("Impact", Font.PLAIN, 25));
		exit.setForeground(new Color(255, 153, 0));
		exit.setOpaque(false);
		exit.setContentAreaFilled(false);
		exit.setBorderPainted(false);
		gbc.gridx = 2;
		gbc.gridy = 4;
		background.add(exit, gbc);
		
		exit.addActionListener(e -> { //Adding action listener to the exit button 
			JOptionPane.showMessageDialog(null, "Thanks for playing!", "Exit", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		});
		
		//Adding action listeners to buttons
		question1.addActionListener(this);
		question2.addActionListener(this);
		question3.addActionListener(this);
		question4.addActionListener(this);
		question5.addActionListener(this);
		question6.addActionListener(this);
		question7.addActionListener(this);
		question8.addActionListener(this);
		question9.addActionListener(this);
		question10.addActionListener(this);
		question11.addActionListener(this);
		question12.addActionListener(this);
		
		//ArrayList of question strings
		questions.add("What are the primitive data types?");
		questions.add("If double x = 2.5 and then y = (int)x + 2, what is the value of y?");
		questions.add("(int)6 *Math.random() + 5 will have what output?");
		questions.add("If int[] arr = new int[10], what value does arr[0] store?");
		questions.add("If boolean gameOver = true, what will while(gameOver) result in?");
		questions.add("<html><i>for ( i = 1; i == 10; i++ )<br>System.out.print( i + \" \" );");
		questions.add("What would be an example of an \"is a\" relationship");
		questions.add("What is overloading?");
		questions.add("What is not true of polymorphism?");
		questions.add("What are setters and getters?");
		questions.add("<html><i>Can private variables or instances be accessed<br> through another class without getters?");
		questions.add("What is true of constructors?");
		
		getContentPane().add(panel);
		setSize(700, 500);
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	/*Act as a method listener for the buttons 
 	 *pre: Have a button clicked
 	 *post: Execute the body
	 */
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == question1) {
			question1.setEnabled(false);
			question1.setContentAreaFilled(false);
			new Questions(questions.get(0), "String, int, boolean, double, char", "String, int, boolean, double, byte", "Float, int, boolean, double, char", 150, 3);
			score.setText("Score: " + Questions.getScore());
		}
		else if (evt.getSource() == question2) {
			question2.setEnabled(false);
			question2.setContentAreaFilled(false);
			new Questions(questions.get(1), "4", "4.5", "5", 250, 1);
			score.setText("Score: " + Questions.getScore());
			
		}
		
		else if (evt.getSource() == question3) {
			question3.setEnabled(false);
			question3.setContentAreaFilled(false);
			new Questions(questions.get(2), "6 and 5 only", "11", "Between 5 and 10", 350, 3);
			score.setText("Score: " + Questions.getScore());
			
			
		}
		else if (evt.getSource() == question4) {
			question4.setEnabled(false);
			question4.setContentAreaFilled(false);
			new Questions(questions.get(3), "9", "10", "Null", 150, 3);
			score.setText("Score: " + Questions.getScore());
			
			
		}
		else if (evt.getSource() == question5) {
			question5.setEnabled(false);
			question5.setContentAreaFilled(false);
			new Questions(questions.get(4), "Infinite loop", "The loop runs once", "The loop never runs", 250, 1);
			score.setText("Score: " + Questions.getScore());
			
		}
		else if (evt.getSource() == question6) {
			question6.setEnabled(false);
			question6.setContentAreaFilled(false);
			new Questions(questions.get(5), "1 2 3...10", "1 2 3...9", "1", 350, 3);
			score.setText("Score: " + Questions.getScore());
			
		}
		else if (evt.getSource() == question7) {
			question7.setEnabled(false);
			question7.setContentAreaFilled(false);
			new Questions(questions.get(6), "Extending a class", "Creating an instance of class x in class y ", "Creating an abstract class and overriding", 150, 1);
			score.setText("Score: " + Questions.getScore());
			
		}
		else if (evt.getSource() == question8) {
			question8.setEnabled(false);
			question8.setContentAreaFilled(false);
			new Questions(questions.get(7), "Extending different classes with the previous ones", "<html><i>Creating many instance variables and setting<br> any parameters equal to them","<html><i>Defining a method multiple times<br>each with a unique signature", 250, 3);
			score.setText("Score: " + Questions.getScore());
			
		}
		else if (evt.getSource() == question9) {
			question9.setEnabled(false);
			question9.setContentAreaFilled(false);
			new Questions(questions.get(8), "Objects must react differently to each method and it's signature", "Methods in the parent class must be overriden in the child class","Using the keyword \"super\" can call the constructor of the parent", 350, 2);
			score.setText("Score: " + Questions.getScore());
			
		}
		else if (evt.getSource() == question10) {
			question10.setEnabled(false);
			question10.setContentAreaFilled(false);
		    new Questions(questions.get(9), "They loop through the variables and retrieve a random one ", "They set values for variables and retrieve them","They retrieve the variables first and then set values to them", 150, 2);
			score.setText("Score: " + Questions.getScore());
			
		}
		else if (evt.getSource() == question11) {
			question11.setEnabled(false);
			question11.setContentAreaFilled(false);
			new Questions(questions.get(10), "No", "Yes-through setters","Yes-through constructors", 250, 1);
			score.setText("Score: " + Questions.getScore());
		
		}
		else if (evt.getSource() == question12) {
			question12.setEnabled(false);
			question12.setContentAreaFilled(false);
			new Questions(questions.get(11), "No return type, same name as class, members of a class", "<html><i>Return type void, same name as class,<br>executed when an object is instantiated","No return type, same name as class, not members of the class", 350, 3);
			score.setText("Score: " + Questions.getScore());
			
		}
	}
}