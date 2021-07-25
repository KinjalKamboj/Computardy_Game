//Reads from the Instructions text file and displays it on a label when called from the parent class

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InstructionsText extends Instructions {
	JPanel text;
	String textRead = "";
	File textFile; 
	FileReader intake;
    BufferedReader readFile;
    String instructionsText;
    
    /*
     * Read from a file
     * pre: Be called by the Instructions class
     * post: Display the text by reading from a file
     */
   
	public String getInstructionsText() {
		text = new JPanel();
		/*textFile = new File("Instructions.txt");
		try {           
			intake = new FileReader (textFile);
			readFile = new BufferedReader (intake);
			while ((instructionsText = readFile.readLine()) != null){
					textRead += "";
					textRead += instructionsText;
				}  		

    	readFile.close();
}
		catch (FileNotFoundException e){
			System.out.println("File not found");
}
		catch (IOException e){
			System.out.println("Exception-ERROR");
}
		return textRead;
	}
	}*/
		textRead += "Welcome to Computardy! This game is a single-player review game \r\n"
				+ "designed to allow you to review important concepts in Grade 12 \r\n"
				+ "Computer Science. To get started, please go back and click on the \r\n"
				+ "start buzzer button. You will be directed to the main game where \r\n"
				+ "there are 12 questions, three in each category, ranging from \r\n"
				+ "easy (150), medium (250) and hard (350). Select a question \r\n"
				+ "and choose the best answer from each multiple choice. You have \r\n"
				+ "45 seconds to answer each question. It would be ideal to achieve\r\n"
				+ "a minimum score of 2050 points. You can choose to exit the \r\n"
				+ "game anytime by clicking the exit button or closing the frame. \r\n"
				+ "		   Good luck!";
		return textRead;
	}
}

