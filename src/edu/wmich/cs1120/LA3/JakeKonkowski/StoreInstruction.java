package edu.wmich.cs1120.LA3.JakeKonkowski;

public class StoreInstruction extends Instruction {

	public StoreInstruction(String opcode, String arg1, String arg2) {
		super(opcode, arg1, arg2);
	}

	@Override
	public void execute(ICPU cpu, IMemory memory) {
		int memAddr = Integer.parseInt(this.getArg2());
		int[] memContent = memory.getMemoryContent();
		
		//Stores the value of arg1 into the memory location
		if ("ax".equals(this.getArg1())) {
			memContent[memAddr] = cpu.getAx();
		} else if ("bx".equals(this.getArg1())) {
			memContent[memAddr] = cpu.getBx();
		}
		
		memory.setMemoryContent(memContent);
	}

}
