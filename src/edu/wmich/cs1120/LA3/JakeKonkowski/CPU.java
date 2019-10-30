package edu.wmich.cs1120.LA3.JakeKonkowski;

public class CPU implements ICPU {

	private int ax;
	private int bx;
	
	public CPU() {
		this.ax = 0;
		this.bx = 0;
	}

	@Override
	public void printCPUStatus() {
		System.out.println("CPU Status:");
		System.out.printf("ax:%s bx:%s\n", this.ax, this.bx);
	}

	@Override
	public int getAx() {
		return this.ax;
	}

	@Override
	public void setAx(int ax) {
		this.ax = ax;
	}

	@Override
	public int getBx() {
		return this.bx;
	}

	@Override
	public void setBx(int bx) {
		this.bx = bx;
	}

}
