package edu.wmich.cs1120.LA3.JakeKonkowski;

public class Memory implements IMemory {
	
	int[] memoryContent;
	
	public Memory() {
		this.memoryContent = new int[10];
		
		for (int i = 0; i < 10; i++) {
			this.memoryContent[i] = i;
		}
		
		System.out.println("Initial memory contents:");
		System.out.print(this);
		System.out.println("");
	}

	@Override
	public void printMemoryStatus() {
		System.out.println("Memory Status:");
		System.out.print(this);
		System.out.println("");
	}

	@Override
	public int[] getMemoryContent() {
		return this.memoryContent;
	}

	@Override
	public void setMemoryContent(int[] memoryContent) {
		this.memoryContent = memoryContent;
	}
	
	@Override
	public String toString() {
		String string = "";
		
		for (int i = 0; i < 10; i++) {
			string += String.format("Address %s: %s\n", i, this.memoryContent[i]);
		}
		
		return string;
	}

}
