package edu.wmich.cs1120.LA3.JakeKonkowski;

public class AddInstruction extends Instruction {

	public AddInstruction(String opcode, String arg1, String arg2) {
		super(opcode, arg1, arg2);
	}

	@Override
	public void execute(ICPU cpu, IMemory memory) {
		
		int intToAdd = 0;
		
		//Converts arg2 to an int
		if ("ax".equals(this.getArg2())) {
			intToAdd = cpu.getAx();
		} else if ("bx".equals(this.getArg2())) {
			intToAdd = cpu.getBx();
		} else {
			intToAdd = Integer.parseInt(this.getArg2());
		}
		
		//Adds arg1 and arg2 and stores in arg1
		if ("ax".equals(this.getArg1())) {
			int sum = cpu.getAx() + intToAdd;
			cpu.setAx(sum);
		} else if ("bx".equals(this.getArg1())) {
			int sum = cpu.getBx() + intToAdd;
			cpu.setBx(sum);
		}
		
	}

}
