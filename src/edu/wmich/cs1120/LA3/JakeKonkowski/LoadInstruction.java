package edu.wmich.cs1120.LA3.JakeKonkowski;

public class LoadInstruction extends Instruction {

	public LoadInstruction(String opcode, String arg1, String arg2) {
		super(opcode, arg1, arg2);
	}

	@Override
	public void execute(ICPU cpu, IMemory memory) {
		int memAddr = Integer.parseInt(this.getArg2());
		int[] memContent = memory.getMemoryContent();
		
		//Stores the memory's value into ax or bx
		if ("ax".equals(this.getArg1())) {
			cpu.setAx(memContent[memAddr]);
		} else if ("bx".equals(this.getArg1())) {
			cpu.setBx(memContent[memAddr]);
		}
	}

}
