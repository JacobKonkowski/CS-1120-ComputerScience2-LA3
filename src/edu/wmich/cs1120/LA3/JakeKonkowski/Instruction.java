package edu.wmich.cs1120.LA3.JakeKonkowski;

public abstract class Instruction implements IExecutable {

	private String arg1;
	private String arg2;
	private String opcode;
	
	Instruction(String opcode, String arg1, String arg2) {
		this.opcode = opcode;
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	
	public String getArg1() {
		return arg1;
	}
	
	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}
	
	public String getArg2() {
		return arg2;
	}
	
	public void setArg2(String arg2) {
		this.arg2 = arg2;
	}
	
	public String getOpcode() {
		return opcode;
	}
	
	public void setOpcode(String opcode) {
		this.opcode = opcode;
	}

}
