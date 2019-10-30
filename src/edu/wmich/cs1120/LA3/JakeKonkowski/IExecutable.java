package edu.wmich.cs1120.LA3.JakeKonkowski;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public interface IExecutable { 
 	/** 
 	 * Overridden by the four subclasses of abstract class Instruction. 
 	 * 
 	 * It checks to see which register(s) and memory locations (if applicable) 
 	 * are to be used for this instruction and sets the relevant register or  
 	 * memory location with the result / value based on the specific instruction 
 	 * (add, subtract, load or store). 
 	 * 
 	 * @param cpu The CPU object with the registers ax, bx 	 
 	 * @param memory The memory object to be used for retrieving or storing data 
 	 */ 
 	void execute(ICPU cpu, IMemory memory); 
 	 
 	/** 
 	 * This is a static method and so must be implemented here. YOU WILL NEED 
 	 * TO WRITE THE IMPLEMENTATION FOR THIS METHOD. 
 	 * 
 	 * It reads the data in the input file and stores the individual instructions 
 	 * in an array of IExecutable objects. In order to determine what kind of 
 	 * instruction to instantiate, it needs to check the first token (or word) 
 	 * on each line and then create the corresponding Instruction object  	 
 	 * (passing the parameters for that object to the relevant 
 	 * constructor in the process). 
 	 * 
 	 * Remember that the first line in the input file specifies the number of 
 	 * instructions stored in it. 
 	 * 
 	 * @param file The File object referencing the input file. 
 	 * @return The array of IExecutable objects / instructions. 
 	 * @throws IOException In case the input file is not found. 
 	 */ 
 	static IExecutable[] loadInstructionsFromFile(File file)
 			throws IOException {
 		
 		//Converts the file into data we can use
 		BufferedReader br = new BufferedReader(new FileReader(file));
 		//Uses the first line in the file as the number of instructions
 		int numOfInstructions = Integer.parseInt(br.readLine());
 		IExecutable[] instructions = new IExecutable[numOfInstructions];
 		
 		//Creates objects for the instructions and stores them in an array
 		for (int i = 0; i < numOfInstructions; i++) {
 			String[] line = br.readLine().split(",");
 			
 			if ("store".equals(line[0].toLowerCase())) {
 				instructions[i] = new StoreInstruction(line[0], line[1], line[2]);
 			} else if ("load".equals(line[0].toLowerCase())) {
 				instructions[i] = new LoadInstruction(line[0], line[1], line[2]);
 			} else if ("add".equals(line[0].toLowerCase())) {
 				instructions[i] = new AddInstruction(line[0], line[1], line[2]);
 			} else if ("sub".equals(line[0].toLowerCase())) {
 				instructions[i] = new SubInstruction(line[0], line[1], line[2]);
 			}
 			
 		}
 		
 		//Closes the buffered reader and returns the array
 		br.close();
 		return instructions;
 	} 
 	 
 	/** 
 	 * A getter for the first argument in an instruction. 
 	 * 
 	 * @return The first argument. 
 	 */ 
 	String getArg1(); 
 	 
 	/** 
 	 * A setter for the first argument. 
 	 * 
 	 * @param arg1 The first argument. 
 	 */ 
 	void setArg1(String arg1); 
 	 
 	/** 
 	 * A getter for the second argument in an instruction. 
 	 * 
 	 * @return The second argument. 
 	 */ 
 	String getArg2(); 
 	 
 	/** 
 	 * A setter for the second argument. 
 	 * 
 	 * @param arg2 The second argument. 
 	 */ 
 	void setArg2(String arg2); 
 	 
 	/** 
 	 * A getter for the operation code that specifies the type of operation
 	 * or instruction to be performed. 
 	 * 
 	 * @return The type of operation or instruction. 
 	 */ 
 	String getOpcode(); 
 	 
 	/** 
 	 * A setter for the type of operation to be performed. 
 	 * 
 	 * @param opcode The operation to be performed. 
 	 */ 
 	void setOpcode(String opcode); 
 	
}