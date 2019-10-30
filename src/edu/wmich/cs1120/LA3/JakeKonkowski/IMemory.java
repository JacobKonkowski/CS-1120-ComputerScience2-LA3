package edu.wmich.cs1120.LA3.JakeKonkowski;

public interface IMemory { 
	 
 	// NOTE: You should have a constructor for your Memory class. This   	
	// constructor should initialize each location in the memory array  	
	// with its index in the array: so memory[0] = 0; memory[1] = 1; etc. 
 	// The constructor should also print out the initial contents of the  
 	// memory. 
 	 
 	/** 
 	 *	Prints out the status of the memory (a one-dimensional array) 
 	 * (status => the contents of the array representing the memory). 
 	 */ 
 	void printMemoryStatus(); 
 
 	/** 
 	 *	Return the memory array. 
 	 *  
 	 *	@return The memory array. 
 	 */ 
 	int[] getMemoryContent(); 
 
 	/** 
 	 *	Update the memory array with the one referenced in the parameter. 
 	 *  
 	 *	@param memoryContent The array with which to update the memory. 
 	 */ 
 	void setMemoryContent(int[] memoryContent); 
 
} 