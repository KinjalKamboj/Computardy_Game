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
		textFile = new File("Instructions.txt");
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
}
