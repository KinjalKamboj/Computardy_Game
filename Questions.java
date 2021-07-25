//Questions Frame - Fourth Frame, displays the questions in a multiple choice form, inputs user feedback, and displays whether the result is correct or not

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.TimerTask;
import javax.swing.Timer;

public class Questions extends JFrame implements ItemListener{
	private String quest, answer1, answer2, answer3;
	private int questPrice, correctAnswer, o1, o2, o3;
	private static ArrayList <Integer> score = new ArrayList<Integer>();
	static int totalScore = 0;
	private static int index = 0;
	Timer timer;//a Timer used to generate action events 
	private int secondsPassed = 45;
	JPanel panel;
	JLabel questText, result, timerLabel;
	JRadioButton option1, option2, option3;
	JButton checkAnswer;
	
	/*
	 *Initialize parameters passed
 	 *pre: Have the method called and appropiate parameters passed
 	 *post: Display a new frame
	 */
	Questions(String q, String a1, String a2, String a3, int price, int correct){
		this.quest = q;
		this.answer1 = a1;
		this.answer2 = a2;
		this.answer3 = a3;
		this.questPrice = price;	
		this.correctAnswer = correct;
		
		//Creating GridBagLayout object
		GridBagConstraints gbc = new GridBagConstraints();	
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets (5, 5, 5, 5);
		
		panel = new JPanel(); //Creating a panel
		panel.setBackground(new Color(80, 50, 250));
		panel.setLayout(new GridBagLayout());
	
		//Displaying question
		questText = new JLabel(quest);
		questText.setFont(new Font("Biome", Font.BOLD, 18));
		questText.setForeground(Color.white);

		//Displaying Answers
		ButtonGroup group = new ButtonGroup();
		option1 = new JRadioButton(answer1);
		o1 = 1;
		option1.addItemListener(this);
		option1.setFont(new Font("Biome", Font.PLAIN, 20));
		option1.setBackground(new Color(80, 50, 250));
		option1.setForeground(Color.white);
		
		option2 = new JRadioButton(answer2);
		o2 = 2;
		option2.addItemListener(this);
		option2.setFont(new Font("Biome", Font.PLAIN, 20));
		option2.setBackground(new Color(80, 50, 250));
		option2.setForeground(Color.white);
		
		option3 = new JRadioButton(answer3);
		o3 = 3;
		option3.addItemListener(this);
		option3.setFont(new Font("Biome", Font.PLAIN, 20));
		option3.setBackground(new Color(80, 50, 250));
		option3.setForeground(Color.white);
		
		group.add(option1);
		group.add(option2);
		group.add(option3);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(questText, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(option1, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(option2, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(option3, gbc);
		
		//Displaying count down timer
		timerLabel = new JLabel();
		timerLabel.setFont(new Font("Impact", Font.BOLD, 23));
		timerLabel.setForeground(Color.red);
		
		timer = new Timer (1000, new ActionListener(){
			/*When a question is chosen, the timer starts
		 	 *pre: Have the user choose a question
		 	 *post: Counts down from 45 seconds to zero
			 */
			public void actionPerformed (ActionEvent evt){
				secondsPassed--;
				timerLabel.setText("0:" + secondsPassed);
				if (secondsPassed == 0) {
					timer.stop();
					JOptionPane.showMessageDialog(null, "You ran out of time! Choose a different question.", "Oops!", JOptionPane.INFORMATION_MESSAGE);
				    getContentPane().remove(panel); 
				}
				}
		     });
		timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.start();
       
		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(timerLabel, gbc);
		
		//Creating check answer button and adding action listener to it
		checkAnswer = new JButton("Check");
		checkAnswer.addActionListener((e -> {
			timer.stop();
			if (option1.isSelected()){
				if (o1 == correctAnswer) {
					result.setText("Correct!");
					setScore(questPrice);
					
					}
				else {
					result.setText("Incorrect!");	
					
			         }
			      }
			else if (option2.isSelected()){
				if (o2 == correctAnswer) {
					result.setText("Correct!");
					setScore(questPrice);
					
				    }
				else {
					result.setText("Incorrect!");  
					
				         }
			    	  }
			else if (option3.isSelected()) {
				if (o3 == correctAnswer) {
					result.setText("Correct!");
					setScore(questPrice);
					
				}
				else {
					result.setText("Incorrect!");	 
					
				         }
			      }	
			else {
				result.setText("Choose an answer!");
				
			}
		}));
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		panel.add(checkAnswer, gbc);
		
		//Creating result label to display if user choice is correct or not
		result = new JLabel();
		result.setForeground(Color.white);
		result.setFont(new Font("Impact", Font.PLAIN, 20));
		gbc.gridx = 0;
		gbc.gridy = 5;
		panel.add(result, gbc);
		
		getContentPane().add(panel);
		setSize(650, 320);
		setBackground(new Color(80, 50, 250));
		setVisible(true);
		
}	/*Set points to the ArrayList
 	 *pre: Have the method called and have an int passed as a parameter
 	 *post: Add the number to the array and add to the totalScore
	 */
	private void setScore(int p) { 
		score.add(p);
		totalScore += score.get(index);
		index++;
		}
	
	/*Get user score
 	 *pre: Have the method called
 	 *post: Return the totalScore
	 */
	static int getScore() {
		return totalScore;
		}
			
	/*
 	 *pre: 
 	 *post: Override the itemStateChanged action listeners for the radio buttons
	 */
	@Override
	public void itemStateChanged(ItemEvent e) {
	    //TODO Auto-generated method stub
	}		
}