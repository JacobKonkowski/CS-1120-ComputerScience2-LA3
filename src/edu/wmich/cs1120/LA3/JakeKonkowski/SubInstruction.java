package edu.wmich.cs1120.LA3.JakeKonkowski;

public class SubInstruction extends Instruction {

	public SubInstruction(String opcode, String arg1, String arg2) {
		super(opcode, arg1, arg2);
	}

	@Override
	public void execute(ICPU cpu, IMemory memory) {
		int intToSub = 0;
		
		//Converts arg2 to an int
		if ("ax".equals(this.getArg2())) {
			intToSub = cpu.getAx();
		} else if ("bx".equals(this.getArg2())) {
			intToSub = cpu.getBx();
		} else {
			intToSub = Integer.parseInt(this.getArg2());
		}
		
		//Subtracts arg2 from arg1 and stores in arg1
		if ("ax".equals(this.getArg1())) {
			int diff = cpu.getAx() - intToSub;
			cpu.setAx(diff);
		} else if ("bx".equals(this.getArg1())) {
			int diff = cpu.getBx() - intToSub;
			cpu.setBx(diff);
		}
	}

}
