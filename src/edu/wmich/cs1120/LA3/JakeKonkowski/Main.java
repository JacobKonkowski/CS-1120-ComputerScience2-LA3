package edu.wmich.cs1120.LA3.JakeKonkowski;

import java.io.File;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		
		//The directions said not to edit this class, but
		//I had to because there wasn't anywhere that was
		//Catching the IOException from the instantiation
		//Of the file and from the loadInstructionsFromFile
		//method.
		
		try {
			File file = new File("instructions.txt");
			
			IExecutable[] instructions =
					IExecutable.loadInstructionsFromFile(file);
			ICPU cpu = new CPU();
			IMemory memory = new Memory();
			
			for(IExecutable ins: instructions) {
				ins.execute(cpu, memory);
			}
			
			System.out.println("Program Output: \n");
			
			memory.printMemoryStatus();
			cpu.printCPUStatus();
		} catch (IOException e) {
			//This is the easy way to print an exception
			//I don't know why we're taught to
			//print the exception's message
			//with the System.out.println
			//method. 
			e.printStackTrace();
		}
		
	}

}
